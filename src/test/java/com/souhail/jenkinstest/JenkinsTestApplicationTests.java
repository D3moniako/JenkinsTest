package com.souhail.jenkinstest;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)// serve per introdurre jUNIT TEST, CHE HO NEL POM
@Log
@SpringBootTest
class JenkinsTestApplicationTests {

    @Test
   public  contextLoads() {
        log.info("Test in esecuzione");
        assertEquals(true,true);
    }

}
