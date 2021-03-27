package javaOops;

public class Fullcal extends Inherit{
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
public static void main(String[] args) {
	Fullcal fc=new Fullcal();
	fc.add();
	fc.sub();
	fc.mul();
	fc.div();
	fc.status();
}
}
