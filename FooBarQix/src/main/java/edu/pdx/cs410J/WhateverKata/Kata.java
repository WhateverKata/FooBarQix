package edu.pdx.cs410J.WhateverKata;

import java.text.ParseException;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Missing command line arguments");
            System.exit(1);
        } else if (args.length > 1) {
            System.err.println("Too many arguments");
            System.exit(1);
        }

        System.out.println(transformString(args[0]));
    }

    public static String transformString(String s) {
        boolean check = false;
        String result = "";

        try {
            int number = Integer.parseInt(s);
            if (number % 3 == 0){
                result += "Foo";
                check = true;
            }
            if (number % 5 == 0){
                result += "Bar";
                check = true;
            }
            if (number % 7 == 0){
                result += "Qix";
                check = true;
            }
        } catch (NumberFormatException e) {
            System.err.println("Wrong format");
            System.exit(1);
        }

        for (int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)) {
                case '0':
                    result += '*';
                    break;
                case '3':
                    result += "Foo";
                    break;
                case '5':
                    result += "Bar";
                    break;
                case '7':
                    result += "Qix";
                    break;
                default:
                    if(!check)
                        result += s.charAt(i);
                    break;
            }
        }
        return result;
    }
}

