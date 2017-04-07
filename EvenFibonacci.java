/*
 * Author: Stephanie Hayden
 * Date 10/16/2016
 * 
 * Project Euler roblem description:
 * "Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."
 * 
 */
 
public class EvenFibonacci {
	
	public static final int FIBONACCI_FIRST_TERM = 1;
	public static final int FIBONACCI_SECOND_TERM = 2;
	
	public static final int TERM_LIMIT = 4000000;
	
	// Returns true if the given int is even
	public static boolean isEven(int value){
		return (value % 2 == 0);
	}
	
	public static void main(String[] args) {
		int termOne = FIBONACCI_FIRST_TERM;
		int termTwo = FIBONACCI_SECOND_TERM;
		int sumOfEvenValuedTerms = (isEven(FIBONACCI_FIRST_TERM) ? FIBONACCI_FIRST_TERM : 0); //start with the first Fibonacci term if it is even.
		
		//iterate through all fibonacci numbers less than the limit, adding each even fib. number to the sum.
		while (termTwo <= TERM_LIMIT){ 
			sumOfEvenValuedTerms += (isEven(termTwo) ? termTwo : 0);
			int nextTerm = termOne + termTwo;
			termOne = termTwo;
			termTwo = nextTerm;
		}
		
		System.out.println("The sum of the even fibonacci numbers under four million is:  " + sumOfEvenValuedTerms);
	}
	

}