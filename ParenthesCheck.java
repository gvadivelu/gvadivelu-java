package InterviewQuestions;

import java.util.Iterator;
import java.util.Stack;

import org.omg.CORBA.portable.ValueBase;

/*
input 1:  ()()() - true
input 2:  ((())) - true
input 3:  )(     - false
input 4:  ())(   - false
*/
public class ParenthesCheck {
	
	boolean isParenthesisMatch(String inputString)
	{
		System.out.println(inputString);
		Stack<Character> stack = new Stack<Character>();
		char c;
		for(int i = 0; i < inputString.length(); i++) 
		{
			c = inputString.charAt(i);
			if(c == '(') {
				stack.push(c);
			}
			if( c ==')') 
			{
				if(!stack.empty())
				{
					if(stack.peek() == '(')
					{
						stack.pop();
					}
				}
				else 
					return false;
			}
		}
		return stack.empty();
	}
	
    static String[] braces(String[] values) {
        System.out.println("input : "+values);
        String[] result = new String[values.length];
        char c;
        int count =0;
        for(String input : values)
        {
            Stack<Character> stack = new Stack<Character>();
            System.out.println("Values "+input);
            for(int i =0; i< input.length();i++)
            {
                c = input.charAt(i);
                if(c == '(' || c == '{' || c =='[')
                {
                    stack.push(c);
                }
                if(c == ')' || c == '}' || c==']')
                {
                    if(!stack.empty())
                    {
                        char ch = stack.peek();
                        System.out.println("3 :"+ch);
                        switch(ch)
                        {
                            case '(':
                            if(c == ')')
                            {
                                stack.pop();
                            }
                            case '{':
                            if (c == '}') {
                                stack.pop();
                            }
                            case '[':
                            if (c == ']') {
                                stack.pop();
                            }
                        }
                        
                    }
                }
            }
            if (stack.empty()) {
                result[count] = "YES";
            } else {
                result[count] = "NO";
            }
            count++;
             
        }
            return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParenthesCheck cInput = new ParenthesCheck();
		String inputString = ("()(()");
		boolean result = cInput.isParenthesisMatch(inputString);
		if(result)
			System.out.println("true\n");
		else System.out.println("false\n");
		
	    String string_array[] = new String[4];
	    string_array[0]= "{}()[]";
	    string_array[1]= "{()}";
	    string_array[2]= "[)(}{]";
	    string_array[3]= "(()";
	    
	    String output [] = braces(string_array);
	    
	    for(String s: output)
	    {
	    	System.out.println(" "+s);
	    }
	}

}
