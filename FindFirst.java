package assignment;
import java.util.*;

public class FindFirst {
	public static void main(String args[])
	{
		List <Integer> e=Arrays.asList(109,67,98);
		Optional<Integer> a=e.stream().findFirst();
		System.out.println(a);
	}

}
