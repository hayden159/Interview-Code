
/*
 * Author: Stephanie Hayden
 * Date 10/16/2016
 * 
 * Project Euler problem Description:
 * "A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers."
 * 
 */

public class LargestPalendromeProject {

	public static final int THREE_DIGIT_MAX = 999;
	
	
	//returns true if the given int param is a palendrome
	public static boolean isPalendrome(int product){
		String productString = Integer.toString(product);
		boolean palendrome = true;
		for (int i = 0; i < productString.length()/2 && palendrome; i++){
			palendrome = (productString.charAt(i)) == (productString.charAt((productString.length()-1)-i));
		}
		return palendrome;
	}
	
	public static void main(String[] args) {
		int largestPalendrome = 0, finalFactor1 = 0, finalFactor2 = 0;
		
		//iterate through all three digit number products, saving the largest palendromic product
		for (int i = 0; i < THREE_DIGIT_MAX; i++) {
			for (int j = 0; j < THREE_DIGIT_MAX; j++) {
				if (isPalendrome(j*i) && (j*i) > largestPalendrome){
					finalFactor1 = j;
					finalFactor2 = i;
					largestPalendrome = j*i;
				}
			}
		}
		
		System.out.print("The largest palendrome product from two three-digit numbers is: " + largestPalendrome + " = " + finalFactor1 + " * " + finalFactor2);
	}

}
