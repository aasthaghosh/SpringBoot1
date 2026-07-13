package com.aastha.demo;

class p{
    void m1(){

    }
    void m2(){

    }
}
class C extends p{
    void m3(){

    }
}
public class Test {
    p obj1 = new C(); //correct
//    C obj2 = new p();//wrong not allowed
}
