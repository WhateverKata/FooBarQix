package edu.pdx.cs410J.WhateverKata;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public String transformString( String s ) {
    String result = "";

    for( int i = 0; i < s.length(); ++i ){
      switch(s.charAt(i)){
        case '3':
          result = result + "Foo";
          break;
        default:
          result = result + s.charAt(i);
          break;
      }
    }

    System.out.println(result);
      return result;
  }
}

