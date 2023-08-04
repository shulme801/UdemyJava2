import javax.crypto.Cipher;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real      = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber complexNum) {
        this.real = this.real + complexNum.getReal();
        this.imaginary = this.imaginary + complexNum.getImaginary();
    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber complexNum) {
        this.real = this.real - complexNum.getReal();
        this.imaginary = this.imaginary - complexNum.getImaginary();
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
