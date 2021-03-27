package javaOops;

public class Abs2 extends Abs1 {

	@Override
	public void add() 
	{
		c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void sub() {
	
		c=a-b;
		System.out.println(c);
	}
public static void main(String[] args) {
	Abs2 a=new Abs2();
	a.add();
	a.sub();
	a.mul();
	a.div();
}

}
