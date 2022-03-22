package com.harman.Annotations;

import java.util.ArrayList;

public class Base {
    void display()
    {
        System.out.println("this is parent class");
    }
    @Deprecated    //to print warnings
    void test()
    {
        System.out.println("testing...");
    }
}
@SuppressWarnings("no errors") //to avoid warnings
class Child extends Base
{

    @Override // indicates the child class method is over writing its base  class method
    void display() {
        super.display();
    }
    public @interface Myannotation{   // create our own annotation
        int age() default 18;
        String name();
    }

    @Myannotation(
            name= "raj"
    )

    public static void main(String[] args) {
        Child c=new Child();
        c.display();
        c.test();
        @SuppressWarnings("unused")
        int y;

//        @SuppressWarnings("rawtype")
//                List x=new ArrayList();
    }
}