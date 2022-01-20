package com.hcl.vowels;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels vowels = new Vowels("This is a string for test purposes");
		System.out.println(vowels.getVowels_string());
		System.out.println(vowels.getVowels_string());
		vowels.setOriginal_string("And this is another string for check the output's right");
		System.out.println(vowels.getVowels_string());
	}

}
