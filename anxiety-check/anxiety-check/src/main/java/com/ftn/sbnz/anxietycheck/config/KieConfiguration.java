package com.ftn.sbnz.anxietycheck.config;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KieConfiguration {

    @Bean
    public KieServices kieServices() { return KieServices.Factory.get(); }

    @Bean
    public KieContainer kieContainer(KieServices kieServices) {

        System.out.println("kieContainer start ");
        KieContainer kieContainer = kieServices
                .newKieContainer(kieServices.newReleaseId("com.ftn.sbnz", "anxietycheck-drools", "1.0.0-SNAPSHOT"));
        KieScanner kieScanner = kieServices.newKieScanner(kieContainer);
        kieScanner.start(10_000);
        System.out.println("kieContainer end");
        return kieContainer;
    }

//    @Bean
//    public KieSession kieSession(KieContainer kieContainer) {
//        KieSession kieSession = kieContainer.newKieSession("test-session");
//
//        System.out.println("kieSession new");
//        return kieSession;
//    }

}

