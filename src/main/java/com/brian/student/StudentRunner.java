package com.brian.student;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("Brian", 77, 99);
        stu.print();
        System.out.println("High score: " + stu.highest());


    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english score:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math score:");
        int math  = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}

