package assignment;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StartWith_One {
	public static void main(String args[])
	{
		List<Integer> l=Arrays.asList(1,5,6,9,15,8,117);
		List<Integer> a=(List<Integer>)l.stream()
						.filter(x->x.toString().startsWith("1"))
						.collect(Collectors.toList());
						
		System.out.println(a);
	}

	
	

}
