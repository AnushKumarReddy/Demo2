package javaOops;

public class Inherit extends Inherit2 {
int a=20;
int b=10;
	int c;
public void add()
{
	c=a+b;
	System.out.println(c);
}
public void sub()
{
	c=a-b;
	System.out.println(c);
}
public static void main(String[] args) {
	Inherit i=new Inherit();
	i.add();
	i.sub();
}

}
