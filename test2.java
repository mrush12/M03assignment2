public class test2 {
    public static void main(String[] args) {
        // Enter two Rational numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rational number1 with numerator and denominator seperated by a space: ");
        String BI1 = input.next();
        String BT1 = input.next();

        System.out.print("Enter rational number2 with numerator and denominator seperated by a space: ");
        String BI2 = input.next();
        String BT2 = input.next();

        Rational r1 = new Rational(new BigInteger(BI1), new BigInteger(BT1));
        Rational r2 = new Rational(new BigInteger(BI2), new BigInteger(BT2));

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }

}
