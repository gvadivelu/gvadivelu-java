package interview;

import java.util.Arrays;

public class UniqueCharcters {

	public static void main(String[] args) {
		
		String str = "Gaythri";

		//System.out.println("Is unique chars : "+isUniqueChars(str));
		System.out.println("Is unique chars using sort : "+isUniqueChars_UsingSort(str));
	}

	//Time COmplexitry O(n log n)
	private static boolean isUniqueChars_UsingSort(String str) {
		
		char [] char_array = str.toCharArray();
		Arrays.sort(char_array);
		
		for(int i = 0; i< char_array.length -1; i++)
		{
			System.out.println("1 "+char_array[i] +" 2 "+char_array[i+1]);
			if(char_array[i] != char_array[i+1])
			{
				continue;
			}
			else 
				return false;
		}
		System.out.println("input string : "+str);
		return true;
	}

	//Time COmplexitry O(n)
	private static Boolean isUniqueChars(String str) {
		
		int length = str.length();
		if(length > 128)
			return false;
		
		boolean [] char_set = new boolean[128];
		for(int i =0; i< length; i++)
		{
			int val = str.charAt(i);
			System.out.println("char : "+str.charAt(i)+" value : "+val);
			if(char_set[val])
			{
				System.out.println("Yes present ");
				return false;
			}
			char_set[val] = true;
		}
		System.out.println("No Unique");
		return true;
	}

}
