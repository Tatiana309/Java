package lesson02;

public class DataType {
    public static void main(String[] args) {
        System.out.println("Консольный вывод");
        int yearOfBirth;
        int lenght,height;

        yearOfBirth=1990;
        lenght=19;
        height=20;

        yearOfBirth=2000;

        int numberOfPears=100;
        int numberOfApples=30,numberOfBananas=40;

        System.out.println(numberOfApples);
        System.out.println(numberOfBananas);

        byte readByte=56;
        short userAge=35;
        long team=12,planetAge=400_00000000L;
        System.out.println(planetAge);

        float outsideTemp=-12.5f, catAge=4.5f;
        double weight=200.5;
        System.out.println(outsideTemp);

        boolean isActive=true;
        boolean isConnected=false;

        System.out.println(isActive);

        char aLetter='a';
        System.out.println(aLetter);

        int numberOfStones01=12_000;
        long numberOfStones02 = numberOfStones01;
        System.out.println(numberOfStones01);
        System.out.println(numberOfStones02);

        int distant=100;
        byte smallDistance=(byte)distant;
        System.out.println(smallDistance);

        var version=123;
        var bigNumber=10L;
        var connected=true;
        var balance=4000.8;
        var numberOfHouse=50.8F;
        var price =(short)290;
    }
}
