package com.ftn.sbnz.anxietycheck.drools;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.test.context.junit4.SpringRunner;

import com.ftn.sbnz.anxietycheck.model.AnxietyDisorder;
import com.ftn.sbnz.anxietycheck.model.CommonAnxietySymptoms;
import com.ftn.sbnz.anxietycheck.model.Depression;
import com.ftn.sbnz.anxietycheck.model.DepressionSymptoms;
import com.ftn.sbnz.anxietycheck.model.DepressionType;
import com.ftn.sbnz.anxietycheck.model.PredominantSymptoms;
import com.ftn.sbnz.anxietycheck.model.TestTakingUser;

@RunWith(SpringRunner.class)
public class DisorderTest {
	
	 private static KieContainer kieContainer;
	 private static Set<CommonAnxietySymptoms> cas = new HashSet<CommonAnxietySymptoms>();
	 private static Set<DepressionSymptoms> ds = new HashSet<DepressionSymptoms>();
	 private static Set<PredominantSymptoms> ps = new HashSet<PredominantSymptoms>();
	 private static List<AnxietyDisorder> disorders = new ArrayList<AnxietyDisorder>();
	 private static List<Depression> depressions = new ArrayList<Depression>();
	 

    @Before
    public void setup() {
        KieServices kieServices = KieServices.Factory.get();
        kieContainer = kieServices
                .newKieContainer(kieServices.newReleaseId("com.ftn.sbnz", "anxietycheck-drools", "1.0.0-SNAPSHOT"));
        
        cas.add(CommonAnxietySymptoms.DifficultyConcentrating);
        cas.add(CommonAnxietySymptoms.ElevatedHeartRate);
        cas.add(CommonAnxietySymptoms.Irritability);
        cas.add(CommonAnxietySymptoms.FrequencyAlmostEveryDay);
        cas.add(CommonAnxietySymptoms.IssuesWithSleep);
        
        ds.add(DepressionSymptoms.hopelessness);
        ds.add(DepressionSymptoms.suicidalThougths);
        
        ps.add(PredominantSymptoms.UpsettingDreams);
        ps.add(PredominantSymptoms.SenseOfDoom);
        ps.add(PredominantSymptoms.EmotionalDistress);
        ps.add(PredominantSymptoms.UnwantedMemories);
        ps.add(PredominantSymptoms.IntrusiveThoughts);
        
        AnxietyDisorder ad = new AnxietyDisorder();
        Set<PredominantSymptoms> symptoms = new HashSet<PredominantSymptoms>();
        ad.setPredominantSymptoms(new HashSet<PredominantSymptoms>());
        symptoms.add(PredominantSymptoms.Irritability);
        symptoms.add(PredominantSymptoms.Restlesness);
        symptoms.add(PredominantSymptoms.IntrusiveThoughts);
        symptoms.add(PredominantSymptoms.ConstantWorrying);
        symptoms.add(PredominantSymptoms.FeelingsOfDread);
        ad.setName("GAD");
        ad.getPredominantSymptoms().addAll(symptoms);
        disorders.add(ad);
        symptoms.clear();
        
        ad.setPredominantSymptoms(new HashSet<PredominantSymptoms>());
        symptoms.add(PredominantSymptoms.FearOfAttention);
        symptoms.add(PredominantSymptoms.FearOfCriticism);
        symptoms.add(PredominantSymptoms.FearOfEmbarassement);
        symptoms.add(PredominantSymptoms.FearOfJudgement);
        symptoms.add(PredominantSymptoms.IntrusiveThoughts);
        ad.setName("SAD");
        ad.getPredominantSymptoms().addAll(symptoms);
        disorders.add(ad);
        symptoms.clear();
        
        ad.setPredominantSymptoms(new HashSet<PredominantSymptoms>());
        symptoms.add(PredominantSymptoms.UpsettingDreams);
        symptoms.add(PredominantSymptoms.EmotionalDistress);
        symptoms.add(PredominantSymptoms.UnwantedMemories);
        symptoms.add(PredominantSymptoms.IntrusiveThoughts);
        symptoms.add(PredominantSymptoms.RelivingOfPast);
        ad.setName("PTSD");
        ad.getPredominantSymptoms().addAll(symptoms);
        disorders.add(ad);
        symptoms.clear();
        
        Depression d = new Depression();
        Set<DepressionSymptoms> dSymptoms = new HashSet<DepressionSymptoms>();
        dSymptoms.add(DepressionSymptoms.hopelessness);
        dSymptoms.add(DepressionSymptoms.suicidalThougths);
        d.setDepressionSymptoms(dSymptoms);
        d.setName("Depression caused by GAD");
        d.setType(DepressionType.DepressionGAD);
        depressions.add(d);
        d.setName("Depression caused by SAD");
        d.setType(DepressionType.DepressionSAD);
        depressions.add(d);
        d.setName("Depression caused by PTSD");
        d.setType(DepressionType.DepressionPTSD);
        depressions.add(d);
        
        
        
    }

    @Test
    public void disorder_PTSD() {
    	
    	KieSession kieSession = kieContainer.newKieSession("test-session");
        
        TestTakingUser user = new TestTakingUser();
        user.setStressPoints(39);
        user.setStart(LocalDate.of(2021, 1, 8));
        user.setCommonSymptoms(cas);
        user.setDepressionSymptoms(ds);
        user.setPredominantSymptoms(ps);
      
        System.out.println(user.getPredominantSymptoms().size());
        
        assertNull(user.getAnxietyDisorder());
        
        kieSession.insert(user);
      
        for(AnxietyDisorder d : disorders) {
        	kieSession.insert(d);
        }
        for(Depression d : depressions) {
        	kieSession.insert(d);
        }
        kieSession.fireAllRules();
        
        System.out.println(user.getAnxietyDisorder());
        assertEquals(user.getAnxietyDisorder().getName(),"PTSD");
       
    }

}
