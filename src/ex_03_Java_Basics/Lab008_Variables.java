package ex_03_Java_Basics;

import org.w3c.dom.ls.LSOutput;

public class Lab008_Variables {
    public static void main(String[] args) {

            /*
    1. data_type variable_name(Identifier = Unique name) = variable_value;
    2. variable value is also called as literal

    3. 3 types of variable - Instance, static & Local
    4. We can create variable name as '_' & '$'

     */
        byte age_sundar;
        age_sundar = 30;
        age_sundar = 31;
        System.out.println(age_sundar); // this will display overridden value

        int a = 3;
        a = 4+5;
        byte b = -127;
        System.out.println(a); //Overridden
        System.out.println(b);


        int binary = 0b1010;
        int hex = 0xFF;
        long amount = 1_000_000L;
        System.out.println(binary);
        System.out.println(hex);
        System.out.println(amount);
    }
    /*
    1. data_type variable_name(Identifier = Unique name) = variable_value;
    2. variable value is also called as literal

    3. 3 types of variable - Instance, static & Local

     */




}
