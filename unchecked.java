package assignment;

import java.util.Optional;

public class unchecked {
		public static void main(String args[]) throws Exception
		{
			int a=0;
			String s=null;
		//  System.out.println(name2);
			 String name2=Optional.ofNullable(s).orElseThrow(() -> new Exception("wrong arugment - "));
			  System.out.println(name2); 
			try {
				int d=2/a;
				System.out.println("exception");
			}
			catch(Exception e)
			{
				System.out.println("exception divisible  by zero");
			}
		}
}
