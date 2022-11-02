package lab2.task1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this(0,0);
    }

    public Complex(Complex complex) {
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    void addWithComplex(Complex complex) {
        if (complex == null)
            return;
        this.real += complex.real;
        this.imaginary += complex.imaginary;
    }

    void showNumber() {
        if (imaginary > 0) {
            System.out.println(real + " + i * " + imaginary);
        } else if (this.imaginary < 0) {
            System.out.println(real + " - i * " + -imaginary);
        } else {
            System.out.println(real);
        }
    }

    public static void main(String[] args) {
        Complex complex = new Complex(1,2);
        complex.showNumber();
    }
}
