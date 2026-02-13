import java.util.Scanner;

class Complex {
    int real;
    int imag;
    
    Complex(int real,int imag){
        this.real=real;
        this.imag=imag;
        
        
    }
    int add(Complex c1,Complex c2){

        Complex c3=new Complex(c1.real+c2.real,c1.imag+c2.imag);
       
        return c3;
    }
    // TODO: parameterized constructor Complex(int real, int imag)

    // TODO: Method to add two complex numbers: add(Complex other) returning new Complex
    // Or static method add(Complex c1, Complex c2)
}

public class ComplexAddition {
    public void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;

        a=sc.NextInt();
        b=sc.NextInt();
        c=sc.NextInt();
        d=sc.NextInt();
        Complex c1=new Complex(a,b);
        Complex c2=new Complex(c,d);

        //add(c1,c2);

        Complex c3=add(c1,c2);

        System.out.println(c3.real+" "+c3.imag+"i");


    }
        // TODO: Read real1, imag1
        // TODO: Read real2, imag2
        
        // TODO: Create two Complex objects
        
        // TODO: Add them
        
        // TODO: Print result in "real + imagi" format (e.g., "6 + 8i")
    
}
