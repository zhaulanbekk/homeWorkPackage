package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Это было командная работа
        System.err.println("Insert number to find area or circumference of circle:");
        Circle circle= new Circle();
        Scanner scanner=new Scanner(System.in);
        int radius= scanner.nextInt();
        Circle.area(radius);
        Circle.circumference(radius);
    }
}
