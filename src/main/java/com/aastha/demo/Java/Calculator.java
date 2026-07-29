package com.aastha.demo.Java;

public class Calculator {
    public int add(int a,int b){
        return a + b;
    }

    public int sub(int a,int b){
        return a - b;
    }

    public int mul(int a,int b){
        return a * b;
    }

    public int div(int a,int b){
        if(b==0){
            throw new ArithmeticException("Can't divide by 0");
        }
        return a / b;
    }
    public boolean isEven(int num){
        return num%2==0;
    }

}