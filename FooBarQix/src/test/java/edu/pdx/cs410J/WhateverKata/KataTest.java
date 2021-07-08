package edu.pdx.cs410J.WhateverKata;

import org.junit.jupiter.api.Test;
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

    assertTrue( result == "1" );
  }
}
