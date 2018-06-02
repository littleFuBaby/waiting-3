package org.ownsbson;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ownsbson.controller.SampleController;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.TestCase;

@SpringBootTest(classes=SampleController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestSampleController {
	
	@Resource
	private SampleController sampleController;
	@Test
	public void testHome(){
		TestCase.assertEquals(sampleController.sayHello(), "Hello Spring Boot");
	}

}
