package com.tka.basic.patternprogram;

public class PatternPrinter {

    public static void printPattern(int n) {
        if(n<=0) {
        	return;
        }
        printPattern(n-1);
        printLine(n);
        System.out.println();
    }
    public static void printLine(int num)
    {
    	if(num<=0)
    	{
    		return;
    	}
    	printLine(num-1);
    	System.out.print  (num);
    }
    public static void main(String[] args) {
    	printPattern(4);
    }
}