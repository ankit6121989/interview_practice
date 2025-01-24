package com.corejava.concepts;

public class ImmutableClass {
    void main(){
        SampleClass sampleClass = new SampleClass("Ankit");
    }
}

final class SampleClass {
    private String name;
    SampleClass(String name){
        this.name=name;
    }
}
