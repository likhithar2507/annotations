package com.harman.Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.Scanner;
public class Custom {


    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface MyAnnotation{
        String word();
    }

    static class Hello{
        @MyAnnotation(word="Enter Details.")

        @Deprecated
        public void sayHello(){System.out.println("hello Welcome to annotation");}
    }

    class TestCustomAnnotation1{
        public void main(String args[])throws Exception{

            Hello h= new Hello();
            Method m=h.getClass().getMethod("sayHello");
            MyAnnotation manno=m.getAnnotation(MyAnnotation.class);

            Scanner s=new Scanner(System.in);

            h.sayHello();

            System.out.println(manno.word());
            System.out.println("Enter Name :");
            String Name=s.nextLine();
            System.out.println("Address :");
            String Address=s.nextLine();
            System.out.println("Email :");
            String Email=s.nextLine();
            System.out.println("Age :");
            int Age=s.nextInt();
            System.out.println("Phone :");
            long Phone=s.nextLong();

            System.out.println("Name is : "+Name);
            System.out.println("Age is : "+Age);
            System.out.println("Address : "+Address);
            System.out.println("Email : "+Email);
            System.out.println("Phone : "+Phone);

        }}
}
