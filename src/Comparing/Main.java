package Comparing;

import java.util.Arrays;
import java.util.Random;

public class Main {
static Random rd = new Random();

    public static void main(String[] args) {
        int[] arr = new int[40];
        for (int i = 0; i < 40; i++) {
            arr[i]= rd.nextInt(200);
        }
        Arrays.sort(arr);

        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++) {
            students[i]= new Student(i+"",i+"-"+i,rd.nextInt(32)+18,rd.nextInt(45)+55);
        }
        System.out.println("----------------------------");
        for (int i = 0; i <20 ; i++) {
            System.out.println(students[i]);
        }

        System.out.println("----------------------------");
        Arrays.sort(students);

        System.out.println("----------------------------");
        for (int i = 0; i <20 ; i++) {
            System.out.println(students[i]);
        }
        System.out.println("----------------------------");



    }
}
