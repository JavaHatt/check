package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = -2;
        
    oddEvenChecker(a);
    }

    static void oddEvenChecker (int a) {
	
	if (a % 2 == 0) {
		System.out.println("This num is even");
	} else {
		System.out.println("This num is odd");
	}
	
}



}