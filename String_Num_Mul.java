package assignment;
import java.util.*;

public class String_Num_Mul {
	public static void main(String args[])
	{
		String s1,s2;
		System.out.println("enter two number");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		int n1=s1.length();
		int n2=s2.length();
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		int s=0;
		int i=0;
		while(i!=n1)
		{
			
			int g=a[i]-'0';
			s=s*10+g;
			i++;
		}
		int su=0;
		int i1=0;
		while(i1!=n2)
		{
			int g=b[i1]-'0';
			su=su*10+g;
			i1++;
		}
		long mul=s*su;
		long n=mul;
		long y=0;
		char t[]=new char[10];
		int o=0;
		while(n>0)
		{
			long r=n%10;
			t[o]=(char) (r+'0');
			n=n/10;
			o++;
			
			
		}
		char t1[]=new char[o];
		int k=0;
		for(int m=o-1;m!=-1;m--)
		{
			t1[k]=t[m];
			k++;
		}
		String str=String.valueOf(t1);
		System.out.println("multiplication of two string : "+str);
		
	}

}
