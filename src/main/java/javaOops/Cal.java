package javaOops;

public class Cal implements IAddition,Isubstraction,Imultiple {
int a=20;
int b=10;
int c;
	public void mul()
	{
		
		c=a*b;
		System.out.println(c);
	}

	public void sub()
	{
		
		c=a-b;
		System.out.println(c);
	}

	public void add() 
	{
		c=a+b;
		System.out.println(c);
	}
public static void main(String[] args) {
	Cal c=new Cal();
	c.add();
	c.mul();
	c.sub();
}
}
