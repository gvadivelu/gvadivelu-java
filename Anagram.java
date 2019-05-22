package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Anagram {

	public static void main(String[] args) {
		
		List<String> list_String = new ArrayList<>();
		
		String[] input = {"DECO","MotherInLaw","LISTEN","KEEP","CODE","SILENT","PEEK","MotherInLaw","HAD"};
		
		//Arrays.stream(ip).boxed().collect(Collectors.toList())
		List<String> output = isAnagram_new(Arrays.asList(input));
		System.out.println("OUTPUT "+output);

	}
	private static List<String> isAnagram_new(List<String> list_String)
	{
		
		
		List<String> list = new ArrayList<>();
		
		System.out.println("isAnagram"+list_String);
		for(int i = 0; i< list_String.size(); i++)
		{
			for(int j = i+1; j<list_String.size();j++)
			{
				if(checkifA(list_String.get(i),list_String.get(j)))
				{
					System.out.println("TRUE");
					list.add(list_String.get(i));
				}
			}
		}
		System.out.println("list "+list.stream().collect(Collectors.toList()));
		return list;
	}
	private static boolean checkifA(String string, String string2) {
		//System.out.println("string "+string +" string2 "+string2);
		if(string.length() == string2.length())
		{
			
			char[] ch1 = string.toCharArray();
			char[] ch2 = string2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			String tmp1 = new String(ch1);
			String tmp2 = new String(ch2);
			
			if(tmp1.equalsIgnoreCase(tmp2))
			{
				System.out.println("Yes");
				return true;
			}
					
		}
		return false;
	}
	private static List<String> isAnagram(List<String> list_String) {
		
		System.out.println("isAnagram"+list_String);
		
		//Collections.sort(list_String);
		LinkedHashSet<String> hSet = new LinkedHashSet<>();
		
		
		for(String str : list_String)
		{	
			char [] char_arry1 = str.toCharArray();
			
			Arrays.sort(char_arry1);
			
			String str1 = new String(char_arry1);
			System.out.println("str1 : "+str1);
		
			hSet.add(new String(char_arry1));
		}
		System.out.println(" hset "+hSet);
		
		return hSet.stream().collect(Collectors.toList());
	}
	 
}
