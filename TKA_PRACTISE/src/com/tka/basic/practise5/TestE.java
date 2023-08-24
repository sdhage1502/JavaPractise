package com.tka.basic.practise5;
//convert this no to binary
public class TestE {
public static void main (String[]args) {
	String s = "555";

	int i = Integer.parseInt(s);// conver string into  number
	//convert number into binaary number
	System.out.println(Integer.toBinaryString(i));
	//convert number into octal number
	System.out.println(Integer.toOctalString(i));
	//convert number into hexadecimal number
	System.out.println(Integer.toHexString(i));
	}
}



