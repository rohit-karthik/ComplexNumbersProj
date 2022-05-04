/**
 * This class represents a complex number.
 * @author Rohit Karthik
 * @version 1.0
 */
public class ComplexNumber {

    /**
     * Double fields to represent the real and imaginary parts of a complex number.
     */
    private final double realPart;
    private final double complexPart;

    /**
     * Retrieves the imaginary part of the number
     * @return Imaginary part
     */
    public double getComplexPart() {
        return complexPart;
    }

    /**
     * Retrieves the real part of the number
     * @return Real part
     */
    public double getRealPart() {
        return realPart;
    }

    /**
     * Constructs a ComplexNumber object
     * @param realPart Real number part of the complex number
     * @param complexPart Imaginary part of the complex number
     */
    public ComplexNumber(double realPart, double complexPart) {
        this.realPart = realPart;
        this.complexPart = complexPart;
    }

    /**
     * Adds two complex numbers.
     * @param c2 Other complex number
     * @return ComplexNumber result
     */
    public ComplexNumber add(ComplexNumber c2) {
        return new ComplexNumber(realPart + c2.realPart, complexPart + c2.complexPart);
    }

    /**
     * Subtracts two complex numbers (current instance is first value).
     * @param c2 Other complex number
     * @return ComplexNumber result
     */
    public ComplexNumber subtract(ComplexNumber c2) {
        return new ComplexNumber(realPart - c2.realPart, complexPart - c2.complexPart);
    }

    /**
     * Multiplies two complex numbers.
     * @param c2 Other complex number
     * @return ComplexNumber result
     */
    public ComplexNumber multiply(ComplexNumber c2) {
        double real = realPart * c2.realPart; // -1
        double imaginary = (realPart * c2.complexPart) + (complexPart * c2.realPart);
        real += (complexPart * c2.complexPart) * -1;

        return new ComplexNumber(real, imaginary);
    }

    /**
     * Divides two complex numbers. Current instance is dividend and c2 is divisor.
     * @param c2 Other complex number
     * @return ComplexNumber result
     */
    public ComplexNumber divide(ComplexNumber c2) {

        double divider = Math.pow(c2.realPart, 2) + Math.pow(c2.complexPart, 2);

        double real = realPart * c2.realPart + complexPart * c2.complexPart;
        double imaginary = complexPart * c2.realPart - realPart * c2.complexPart;

        return new ComplexNumber(real / divider, imaginary / divider);
    }


    /**
     * toString method.
     * @return String result
     */
    @Override
    public String toString() {
        String toReturn = "";

        if (realPart != 0 || complexPart == 0) {
            toReturn += realPart;
        }

        if (complexPart != 0) {
            if (this.complexPart > 0 && realPart != 0) {
                toReturn += " " + "+" + " ";
            } else if (realPart != 0) {
                toReturn += " " + "-" + " ";
            } else if (this.complexPart < 0) {
                toReturn += "-";
            }

            toReturn += Math.abs(complexPart) + "i";
        }

        return toReturn;
    }
}
