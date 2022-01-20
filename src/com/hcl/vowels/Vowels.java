package com.hcl.vowels;

public class Vowels {
	private String original_string = "";
	String vowels_string;

	public Vowels(String original_string) {
		this.original_string = original_string;
	}

	public void setOriginal_string(String original_string) {
		this.original_string = original_string;
	}

	public String getVowels_string() {
		vowels_string = "";
		for(int i = 1; i <= original_string.length(); i++) {
			if(i%3 == 0) {
				vowels_string = (
							original_string.charAt(i-1) == 'a'
							|| original_string.charAt(i-1) == 'e'
							|| original_string.charAt(i-1) == 'i'
							|| original_string.charAt(i-1) == 'o'
							|| original_string.charAt(i-1) == 'u'
						) ? vowels_string + original_string.charAt(i-1) : vowels_string;
			}
		}
		
		if(vowels_string.length() > 0) return vowels_string;
		else return "Vowels not found :(";
	}
		
}
