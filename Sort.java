package assignment;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Sort {
	public static void main(String args[])
	{
		List <Integer> a=Arrays.asList(1,2,3,2,4,6,6,7,8,2,4);
		List <Integer> b=a.stream().sorted().collect(Collectors.toList());
		System.out.println("asc order:"+b);
		List <Integer> b1=a.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("dec order:"+b1);
}
}