/******************************************************************************

make class complex for addition subtraction multiplication and division of two complex numbers.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		complex a = new complex(1,-2);
		complex b = new complex(2,2);
		complex c = add(a,b);
		c.print();
		 c = subtraction(a,b);
		c.print();
		 c = multiplication(a,b);
		c.print();
		c=inverse(c);	
		c.print();
		c=division(a,b);	
		c.print();
		

	}
	public static complex add(complex a, complex b){
	    return new complex(a.real+b.real,a.img+b.img);
	}
	public static complex multiplication(complex a, complex b){
	    return new complex(a.real*b.real-a.img*b.img,a.real*b.img+b.real*a.img);
	}
	public static complex inverse(complex a){
	    
     return new complex(a.real/(a.real*a.real+a.img*a.img),-a.real/(a.real*a.real+a.img*a.img));
}
	public static complex division(complex a, complex b){
	    return multiplication(a,inverse(b));
	}
	public static complex subtraction(complex a, complex b){
	    return new complex(a.real-b.real,a.img-b.img);
	}
}
