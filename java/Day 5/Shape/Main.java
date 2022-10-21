/******************************************************************************
make superclass shape and classes square, circle and triangle to inheroit from it.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		shape C=new circle(2.3);
		shape S= new square(2);
		shape T = new triangle(3);
		System.out.println(C.area());
		System.out.println(C.perimeter());
		System.out.println(S.area());
		System.out.println(S.perimeter());
		System.out.println(T.area());
		System.out.println(T.perimeter());
		
	}
}
