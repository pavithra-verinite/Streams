package assignment;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Duplicate {
	public static void main(String args[])
	{
		List <Integer> a=Arrays.asList(1,2,3,2,4,6,6,7,8,2,4);
		Set <Integer> b=a.stream().filter(i -> Collections.frequency(a, i)>1)
                .collect(Collectors.toSet());
		System.out.println("using frequency method"+b);
		Set <Integer> s=new HashSet<>();
		Set <Integer> g=a.stream().filter(x -> ! s.add(x)).collect(Collectors.toSet());
		System.out.println("using set "+g);
}
}