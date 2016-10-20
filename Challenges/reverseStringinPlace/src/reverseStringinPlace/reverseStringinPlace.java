package reverseStringinPlace;

import java.util.Scanner;

public class reverseStringinPlace {
	public static char[] stringReverseInPlace(char[] string) {
		  for(int i = 0, j = string.length - 1; i < string.length / 2; i++, j--) {
		    char c = string[i];
		    string[i] = string[j];
		    string[j] = c;
		  }
		  return string;
	}
	public static void main(String[] args){
		System.out.print("Enter a string you would like in reverse: ");
		Scanner scan = new Scanner(System.in); 
		String s = scan.next(); 
		char[] charArray = s.toCharArray();
		charArray = stringReverseInPlace(charArray);
		System.out.println(charArray);
		return; 
	}
}
