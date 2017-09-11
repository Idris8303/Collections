package com.tiy;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	List<String> students = Arrays.asList("Maggie Simpson", "Bobby Hill", "Stewie Griffin", "little Johnny", "Bo Peep", "Razor Sharpe", "Anne Withany", "Mary Poppins", "Luke duke, "Jerry Springer", "Bobby Jo Wills", "Joey Salis", "Moar Sweets", "Barry Handy", "Linda Porter");
                                //asList doesn't support "clear"
        System.out.println(students);
        System.out.println("size is " + students.size());
        System.out.println("value at 1 is " + students.get(1));

        for (String name : students){
            System.out.println(name);
        }
    }
}
