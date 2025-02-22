package com.example;

public class ReverseString {
	public String reversestring(String str) {
	char[] charArray = str.toCharArray () ;
	int left = 0;
	int right = charArray. length - 1;
	
	while (left < right) {
		// Swap characters at the left and right positions
		char temp = charArray [left];
		charArray[left] = charArray[right];
		charArray [right] = temp;
		// Move the pointers towards each other
		left++;
		right--;
	}		
	return new String(charArray) ;
	}
}
