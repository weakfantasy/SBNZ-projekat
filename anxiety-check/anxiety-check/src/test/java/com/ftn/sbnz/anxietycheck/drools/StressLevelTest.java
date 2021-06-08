package com.ftn.sbnz.anxietycheck.drools;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.test.context.junit4.SpringRunner;

import com.ftn.sbnz.anxietycheck.model.CommonAnxietySymptoms;
import com.ftn.sbnz.anxietycheck.model.DepressionSymptoms;
import com.ftn.sbnz.anxietycheck.model.PredominantSymptoms;
import com.ftn.sbnz.anxietycheck.model.StressCategory;
import com.ftn.sbnz.anxietycheck.model.TestTakingUser;


@RunWith(SpringRunner.class)
public class StressLevelTest {

	 private static KieContainer kieContainer;

	   

	    @Before
	    public void setup() {
	        KieServices kieServices = KieServices.Factory.get();
	        kieContainer = kieServices
	                .newKieContainer(kieServices.newReleaseId("com.ftn.sbnz", "anxietycheck-drools", "1.0.0-SNAPSHOT"));
	        
	    }

	    @Test
	    public void stressLevel_NONE() {
	    	
	    	KieSession kieSession = kieContainer.newKieSession("test-session");
	        
	        TestTakingUser user = new TestTakingUser();
	        user.setStressPoints(4);
	        user.setStart(LocalDate.of(2021, 3, 8));
	        user.setCommonSymptoms(new HashSet<CommonAnxietySymptoms>());
	        user.setDepressionSymptoms(new HashSet<DepressionSymptoms>());
	        user.setPredominantSymptoms(new HashSet<PredominantSymptoms>());
	        
	        assertFalse(StressCategory.NONE == user.getStress());
	        
	        kieSession.insert(user);
	        kieSession.fireAllRules();

	        assertEquals(StressCategory.NONE, user.getStress());
	       
	    }
	    
	    @Test
	    public void stressLevel_LOW() {
	    	
	    	KieSession kieSession = kieContainer.newKieSession("test-session");
	        
	        TestTakingUser user = new TestTakingUser();
	        user.setStressPoints(6);
	        user.setStart(LocalDate.of(2021, 3, 8));
	        user.setCommonSymptoms(new HashSet<CommonAnxietySymptoms>());
	        user.setDepressionSymptoms(new HashSet<DepressionSymptoms>());
	        user.setPredominantSymptoms(new HashSet<PredominantSymptoms>());
	        
	        assertFalse(StressCategory.LOW == user.getStress());
	        
	        kieSession.insert(user);
	        kieSession.fireAllRules();

	        assertEquals(StressCategory.LOW, user.getStress());
	       
	    }
	    
	    @Test
	    public void stressLevel_MEDIUM() {
	    	
	    	KieSession kieSession = kieContainer.newKieSession("test-session");
	        
	        TestTakingUser user = new TestTakingUser();
	        user.setStressPoints(15);
	        user.setStart(LocalDate.of(2021, 3, 8));
	        user.setCommonSymptoms(new HashSet<CommonAnxietySymptoms>());
	        user.setDepressionSymptoms(new HashSet<DepressionSymptoms>());
	        user.setPredominantSymptoms(new HashSet<PredominantSymptoms>());
	        
	        assertFalse(StressCategory.MEDIUM == user.getStress());
	        
	        kieSession.insert(user);
	        kieSession.fireAllRules();

	        assertEquals(StressCategory.MEDIUM, user.getStress());
	       
	    }
	    
	    @Test
	    public void stressLevel_HIGH() {
	    	
	    	KieSession kieSession = kieContainer.newKieSession("test-session");
	        
	        TestTakingUser user = new TestTakingUser();
	        user.setStressPoints(39);
	        user.setStart(LocalDate.of(2021, 3, 8));
	        user.setCommonSymptoms(new HashSet<CommonAnxietySymptoms>());
	        user.setDepressionSymptoms(new HashSet<DepressionSymptoms>());
	        user.setPredominantSymptoms(new HashSet<PredominantSymptoms>());
	        
	        assertFalse(StressCategory.HIGH == user.getStress());
	        
	        kieSession.insert(user);
	        kieSession.fireAllRules();

	        assertEquals(StressCategory.HIGH, user.getStress());
	       
	    }
}
