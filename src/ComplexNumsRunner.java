public class ComplexNumsRunner {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(1, -3);
        System.out.println("Number 1: " + c1);

        ComplexNumber c2 = new ComplexNumber(-1, -2);
        System.out.println("Number 2: " + c2);

        System.out.println();

        System.out.println("Addition: " + c1.add(c2));
        System.out.println("Subtraction: " + c1.subtract(c2));
        System.out.println("Multiplication: " + c1.multiply(c2));
        System.out.println("Division: " + c1.divide(c2));

        /*
        Output for the above:

        Number 1: 1.0 - 3.0i
        Number 2: -1.0 - 2.0i

        Addition: -5.0i
        Subtraction: 2.0 - 1.0i
        Multiplication: -7.0 + 1.0i
        Division: 1.0 + 1.0i

         */
    }
}
