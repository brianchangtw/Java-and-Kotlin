package com.brian;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello();
//        String s = new String("dog");
        String s = "airplane";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,4));


        Person p = new Person("Brian", 66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 85);
        char c = 'A';
        System.out.println(c > 'a');

        /*int age = 19;
        char c = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        // Reference data type
        String name = "Brian";
        Integer age2 = 19;
        Character c2 = 'A';*/
    }

}
