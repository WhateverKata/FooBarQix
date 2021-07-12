package edu.pdx.cs410J.WhateverKata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void canWorkWithNumber1() {
    Kata kata = new Kata();

    String result = kata.transformString( "1" );

    assertThat( result, equalTo("1") );
  }

  @Test
  void canWorkWithNumber3() {
    Kata kata = new Kata();

    String result = kata.transformString( "3" );

    assertTrue( result == "Foo" );
  }
}
