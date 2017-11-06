package com.mulesoft.training;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.junit.Rule;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {
	
	@Rule
	public DynamicPort myPort = new DynamicPort("http.port");

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("\n\n------------Dynamic port in test case 1 ___________________>"+myPort.getNumber());
        runFlowAndExpect("mavenFlow", "hello");
    }
    
    @Override
    protected String getConfigFile() {
        return "mule-maven-training.xml";
    }

}
