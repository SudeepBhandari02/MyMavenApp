package com.exmaple;

public class App 
{
    public int add(int a,int b){
      return a+b;
    }
    public static void main( String[] args )
    {
        App app = new App();
        int a = 3;
        int b = 5;
        int result = app.add(a,b);
        System.out.println(a+" + "+b+" = "+result);
    }
}
