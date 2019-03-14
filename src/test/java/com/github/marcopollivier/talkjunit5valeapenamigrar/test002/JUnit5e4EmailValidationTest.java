package com.github.marcopollivier.talkjunit5valeapenamigrar.test002;

import com.github.marcopollivier.talkjunit5valeapenamigrar.utils.ValidationUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JUnit5e4EmailValidationTest {

    @BeforeEach
    void setUp() {
        System.out.println("Executa algo antes de cada teste");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Executa algo depois de cada teste");
    }

    @org.junit.Test
    public void validaEmailsJUnit4() {
        System.out.println("Executando...");
        assertTrue(ValidationUtils.isValidEmail("marco@gmail.com"));
    }

    @Test
    void validaEmails() {
        System.out.println("Executando...");
        assertTrue(ValidationUtils.isValidEmail("marco@gmail.com"));
    }

    @Test
    void validaEmailsErrado() {
        System.out.println("Executando...");
        assertFalse(ValidationUtils.isValidEmail("marcogmail.com"));
    }

    @Disabled
    @Test
    void meErra() {
        System.out.println("Executando...");
        assertFalse(ValidationUtils.isValidEmail("marcogmail.com"));
    }


}
