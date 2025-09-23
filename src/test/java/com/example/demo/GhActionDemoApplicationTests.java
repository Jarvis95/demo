package com.example.demo;

import com.example.demo.service.GithubActionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GhActionDemoApplicationTests {

    @InjectMocks
    private GithubActionService githubActionService;

	@Test
	void contextLoads() {
	}

    @Test
     void sayHello2Test(){
        String s = githubActionService.sayHello();
        Assertions.assertEquals("Hello World :: Github Action Service", s);
    }

}
