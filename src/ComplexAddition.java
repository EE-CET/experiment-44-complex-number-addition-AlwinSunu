import java.util.Scanner;

class Complex {
    int real;
    int imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // Static method to add two complex numbers
    static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }
}

public class ComplexAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        Complex c1 = new Complex(a, b);
        Complex c2 = new Complex(c, d);

        // Using the static method from the Complex class
        Complex c3 = Complex.add(c1, c2);

        // Printing in the requested format
        System.out.println(c3.real + " + " + c3.imag + "i");
        
        sc.close();
    }
}
