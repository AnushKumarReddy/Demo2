package javaOops;

public abstract class Abs1 {
	
	int a=20;
	int b=10;
	int c;
	public abstract void add();
	public abstract void sub();
	public void mul()
	{
		c=a*b;
		System.out.println(c);
	}
   public void div()
   {
	   c=a/b;
	   System.out.println(c);
   }
}
