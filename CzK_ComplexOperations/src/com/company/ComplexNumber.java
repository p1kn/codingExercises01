package com.company;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal () {
        return real;
    }

    public double getImaginary () {
        return imaginary;
    }

    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add (ComplexNumber parameter) {
        this.real += parameter.real;
        this.imaginary += parameter.imaginary;
    }

    public void subtract (double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract (ComplexNumber other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
    }


}
