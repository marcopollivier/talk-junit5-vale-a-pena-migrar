package com.github.marcopollivier.talkjunit5valeapenamigrar.test001;

import static org.assertj.core.api.Assertions.assertThat;

import com.github.marcopollivier.talkjunit5valeapenamigrar.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    private HomeController controller;

	@Test
	public void contextLoads() {
        assertThat(controller).isNotNull();
	}



}
