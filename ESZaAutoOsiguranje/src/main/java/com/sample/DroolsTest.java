package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	Osiguranje o = new Osiguranje();
        	o.setSnagaMotora(30);
        	o.setNovAutomobil(false);
        	o.setProslogodisnjiPremijskiStepen(1);
        	o.setBrojNezgoda(0);

            
            kSession.insert(o);
            kSession.fireAllRules();
            
            System.out.println(o);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
