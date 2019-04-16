package test;

import java.util.*;

public class Test {
    String s;

    public Test(String s, int a){
        this(s);
    }

    public Test(String s){
        this.s = s;
    }
    public static void main(String[] args) {
      Test t = new Test("hello");
      System.out.println(t.s);
    }
}