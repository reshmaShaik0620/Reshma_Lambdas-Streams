import java.util.function.Predicate;
import java.util.stream.*;
//import java.util.stream.Collectors;
//import java.util.Scanner;
import java.util.*;
public class StringsOfLengthThree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int noOfStrings,iter;
		List<String> strings=new ArrayList<String>();
		List<String> result;//=new ArrayList<String>();
		Predicate<String> predicate = (str)->str.length()==3&&str.startsWith("a");
		
		System.out.print("Enter no of strings : ");
		noOfStrings=sc.nextInt();
		
		System.out.println("Enter strings");
		for(iter=1;iter<=noOfStrings;iter++)
		{
			strings.add(sc.next());
		}
		
		result=strings.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(result);
	}
}