import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class AverageOfList
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int noOfIntegers,avgOfIntegers;
		ArrayList<Integer> integers=new ArrayList<Integer>();
		BiFunction<Integer,Integer,Integer> biFunction=( a, b)->a+b;
		int sum=0;
		BiFunction<Integer,Integer,Integer> findDiv=(a,b)->a/b;
		System.out.print("Enter number of elements:");
		noOfIntegers=sc.nextInt();
		System.out.println("Enter elements");
		for(int iter=1;iter<=noOfIntegers;iter++)
		{
			integers.add(sc.nextInt());
		}
		for(int num:integers)
		{
			sum=biFunction.apply(sum,num);
		}
		avgOfIntegers=findDiv.apply(sum,integers.size());
		System.out.println("Average of given integers is : "+avgOfIntegers);
	}
}
