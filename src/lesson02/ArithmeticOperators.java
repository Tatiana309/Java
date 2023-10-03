package lesson02;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int x=20,y=-1;
        int result=x+y;

        byte var01=89, var02=11;
        int byteResult01=var01+var02;
        byte byteResult02=(byte)(var01+var02);

        double bill=503;
        double halfBill=bill/2;
        System.out.println(halfBill);

        int number=101, divisor=10;
        int withoutLastDigit= number/divisor;
        System.out.println(withoutLastDigit);

        number =9;
        divisor=2;
        int evenOrOddResult =number%divisor;
        System.out.println(evenOrOddResult);

    }
}
