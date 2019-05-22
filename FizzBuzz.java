package InterviewQuestions;

import javax.lang.model.element.Element;

/**
 * FizzBuzz
 *
 * for 1 to 100,
 * print "Fizz" if number is divisible by 3
 * print "Buzz" if number is divisible by 5
 * print "FizzBuzz if number is divisible by both
 * else print the number
 *
 * @return void
 */
 
public class FizzBuzz {

    String result;
    FizzBuzz(){}
    
    void printfizzBuzz()
    {
    	System.out.println("In fizzBuzz Function\n ");
        for(int i = 1; i<=100; i++)
        {
        	if((i%3 ==0 && i%5 == 0))
          	  System.out.println("FizzBuzz");
        	else if((i%3) == 0) 
        	  System.out.println("Fizz"); 
        	else if((i%5) == 0) 
        	  System.out.println("Buzz"); 
        	else
        	  System.out.println(i);
        }
    }
  
	public static void main(String[] args) {
		
		FizzBuzz mp = new FizzBuzz();
		
        mp.printfizzBuzz();
    }
        
}
