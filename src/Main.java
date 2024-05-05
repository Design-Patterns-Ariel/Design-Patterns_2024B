import JUNIT.Junit.Java.Calculator;

import java.util.Random;

public class Main {


    static Random rd = new Random();
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        if((7+8)==calc.add(7,8))
            System.out.println("true");
        else
            System.out.println("false");

        for (int i = 0; i < 300; i++) {
            int a = rd.nextInt(-5555,6666);
            int b = rd.nextInt(-5555,6666);
            if((a+b)==calc.add(a,b))
                System.out.println(a +" + " + b +" = "+ (a+b) +" -> "+"true");
            else
                System.out.println("false");
        }



    }



}
