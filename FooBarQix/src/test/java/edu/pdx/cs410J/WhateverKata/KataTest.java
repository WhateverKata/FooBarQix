package edu.pdx.cs410J.WhateverKata;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

public class KataTest extends InvokeMainTestCase {

    @Test
    void canInstantiateKataClass() {
        new Kata();
    }

    private InvokeMainTestCase.MainMethodResult invokeMain(String... args) {
        return invokeMain(Kata.class, args);
    }

    @Test
    void testNoCommandLineArguments() {
        InvokeMainTestCase.MainMethodResult result = invokeMain();
        assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
        assertThat(result.getExitCode(), CoreMatchers.equalTo(1));
    }

    @Test
    void moreThanOneArguments() {
        InvokeMainTestCase.MainMethodResult result = invokeMain("124", "234", "2345");
        assertThat(result.getTextWrittenToStandardError(), containsString("Too many arguments"));
        assertThat(result.getExitCode(), CoreMatchers.equalTo(1));
    }

    @Test
    void wrongFormat() {
        InvokeMainTestCase.MainMethodResult result = invokeMain("adsf");
        assertThat(result.getTextWrittenToStandardError(), containsString("Wrong format"));
        assertThat(result.getExitCode(), CoreMatchers.equalTo(1));
    }


    @Test
    void canWorkWithNumber1() {
        Kata kata = new Kata();

        String result = kata.transformString("1");

        assertThat(result, equalTo("1"));
    }

    @Test
    void canWorkWithNumber3() {
        Kata kata = new Kata();

        String result = kata.transformString("3");

        assertTrue(result.equals("FooFoo"));
    }


}
