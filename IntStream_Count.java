package assignment;
import java.util.*;

public class IntStream_Count {
	public static void main(String args[])
	{
		List <Integer> a=new ArrayList<>();
		a.add(1);
		a.add(5);
		long count=a.stream().count();
		System.out.println(count);
	}

}
