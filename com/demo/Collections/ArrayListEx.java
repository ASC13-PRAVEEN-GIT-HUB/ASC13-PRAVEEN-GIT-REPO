package com.demo.Collections;

import java.util.ArrayList;

public class ArrayListEx {


    public static void main(String[] args) {
rawType();
    }

    private static void rawType() {
        ArrayList colorList = new ArrayList();
        colorList.add("red");
        colorList.add("yellow");
        colorList.add(null);
        colorList.add("null");

        ArithmeticException arithmeticException=new ArithmeticException();
        colorList.add(arithmeticException);
        System.out.println(colorList);
        //collections do not allow premetives
       //eg  ArrayList<int>colorList=new ArrayList<int>();
        ArrayList<Integer>IntegerList=new ArrayList<Integer>();
        IntegerList.add(10);
        IntegerList.add(20);
        IntegerList.add(null);
        System.out.println(IntegerList);

        ArrayList<Number>NumberList=new ArrayList<Number>();
        NumberList.add(20);
        NumberList.add(30.2);
        NumberList.add(30.f);

        System.out.println(NumberList);

    }
}
