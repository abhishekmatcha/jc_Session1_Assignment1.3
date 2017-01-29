class Swap
{
	
	public static void main(String args[])
	{
		System.out.println("enter a and b values");
		int a=Integer.parseInt(System.console().readLine());
		int b=Integer.parseInt(System.console().readLine());
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=" +a  +  "b="+ b);
	}
}