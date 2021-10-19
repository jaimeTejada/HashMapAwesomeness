package com.JaimeTejada;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here,
      /*  int a = 10;
        int b = 3;
        int c = 88;

        HashMap happy = new HashMap();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy.get("c"));*/

       /* HashMap fun = new HashMap();
        fun.put("Jaime ", "Tejada");
        fun.put("Akerö", "Lovice");
        fun.put("Andelia", "Isabella");
        fun.put("Melissa", "Messi");


        System.out.println(fun.values());*/

        HashMap<String, String> countries = new HashMap<String, String>();

        LocalDateTime l = LocalDateTime.now();
        System.out.println(l);

        countries.put("USA", "Washintong DC");
        countries.put("El Salvador", "San Salvador");
        countries.put("Sverige", "Stockholm");
        countries.put("England", "London");

        //countries.remove("USA ");
        //System.out.println(countries.get("El Salvador "));
        //countries.clear();
        //System.out.println(countries.size());
        //countries.replace("USA ", "detroit");
        System.out.println(countries.containsKey("El Salvador"));
        System.out.println("----------------------");
        System.out.println(countries.containsValue("Stockholm"));
        System.out.println("----------------------");
        for (String i : countries.keySet()){
            System.out.print(i+"\t"+"= ");
            System.out.println(countries.get(i));
        }
        System.out.println("----------------------");
        System.out.println(countries);
    }
}
