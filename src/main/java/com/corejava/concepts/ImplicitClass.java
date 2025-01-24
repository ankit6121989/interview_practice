package com.corejava.concepts;

import static java.io.IO.println;

public class ImplicitClass {
    void main(){
        Parent p = new Parent(); // Only Parent constructor will be called
        Parent p1 = new Child(); // First Parent and then Child constructor will be called
        Child c = new Child(); // First parent and then child constructor will be called
    }
}

class Parent {
    Parent(){
        println("Parent Class");
    }
}
class Child extends Parent {
    Child(){
        println("Child Class");
    }
}
