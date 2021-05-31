

import java.util.*;


class complex {

	
	int real, imaginary;

	// Empty Constructor
	complex()
	{
	}

	
	complex(int tempReal, int tempImaginary)
	{
		real = tempReal;
		imaginary = tempImaginary;
	}

	
	complex addComp(complex C1, complex C2)
	{
		
		complex temp = new complex();

		
		temp.real = C1.real + C2.real;

		
		temp.imaginary = C1.imaginary + C2.imaginary;

		
		return temp;
	}
}


public class addcomplex {

	
	public static void main(String[] args)
	{

		
		complex C1 = new complex(3, 2);

		
		System.out.println("complex number 1 : "
						+ C1.real + " + i"
						+ C1.imaginary);

		
		complex C2 = new complex(9, 5);

		
		System.out.println("Complex number 2 : "
						+ C2.real + " + i"
						+ C2.imaginary);

		
		complex C3 = new complex();

		
		C3 = C3.addComp(C1, C2);

		
		System.out.println("Sum of complex number : "
						+ C3.real + " + i"
						+ C3.imaginary);
	}
}
