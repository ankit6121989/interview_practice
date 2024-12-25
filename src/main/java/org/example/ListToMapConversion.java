package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion {

    public static void main(String[] args) {
        List<Shape> listString = Arrays.asList(new Shape(20,"Rectangle"),
                new Shape(30,"Square"),
                new Shape(10,"Cube"));

        Map<String,Integer> integerMap = listString.stream().collect(Collectors.toMap(Shape::getName,Shape::getArea));
        integerMap.entrySet().forEach(System.out::println);
    }
}

class Shape {
    private int area;
    private String name;
    public Shape(int area, String name) {
        this.area = area;
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
