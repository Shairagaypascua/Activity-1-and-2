package ComProg;

import java.util.Scanner;

public class ComProg {
    public static void main(String[] args) {
        int seconds;
        double earthdays, earthyears;
        
       Scanner myObj = new Scanner(System.in);
       System.out.println("How old are you in seconds? ");
       seconds = myObj.nextInt();
       
       earthdays = seconds/86400.0;
       earthyears = earthdays/365.25;
       
//      or you can code the computation this way
//      earthyears = (seconds/86400.0)/365.26
       
        System.out.println("Earth: orbital period " + earthyears + " earth years");
        System.out.println("Mercury: orbital period " + earthyears*0.2408486 + " earth years");
        System.out.println("Venus: orbital period " + earthyears*0.61519726 + " earth years");
        System.out.println("Mars: orbital period " + earthyears*1.8808158 + " earth years");
        System.out.println("Jupiter: orbital period " + earthyears*11.862615 + " earth years");
        System.out.println("Staturn: orbital period " + earthyears*29.447498 + " earth years");
        System.out.println("Uranus: orbital period " + earthyears*84.016846 + " earth years");
        System.out.println("Neptune: orbital period " + earthyears*164.79132 + " earth years");
           
  }
}
