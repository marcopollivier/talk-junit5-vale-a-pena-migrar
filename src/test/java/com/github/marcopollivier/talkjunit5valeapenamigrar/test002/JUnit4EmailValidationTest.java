package com.github.marcopollivier.talkjunit5valeapenamigrar.test002;

import com.github.marcopollivier.talkjunit5valeapenamigrar.utils.ValidationUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JUnit4EmailValidationTest {

    @Before
    public void setUp() {
        System.out.println("Executa algo antes de cada teste");
    }

    @After
    public void tearDown() {
        System.out.println("Executa algo depois de cada teste");
    }

    @Test
    public void validaEmails() {
        System.out.println("Executando...");
        assertTrue(ValidationUtils.isValidEmail("marco@gmail.com"));
    }

    @Test
    public void validaEmailsErrado() {
        System.out.println("Executando...");
        assertFalse(ValidationUtils.isValidEmail("marcogmail.com"));
    }

    @Ignore
    @Test
    public void meErra() {
        System.out.println("Executando...");
        assertFalse(ValidationUtils.isValidEmail("marcogmail.com"));
    }

}
