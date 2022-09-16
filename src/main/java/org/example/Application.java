package org.example;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
      Scanner scannerinput = new Scanner(System.in) ;

        String val = "";


      do {
          System.out.println ("  enter a proper string"
          ) ;
          val = scannerinput.next() ;

      }
        while (!"shriya".equalsIgnoreCase(val));


        System.out.println ("val ochindi: " +val ) ;
    }


         
    }    