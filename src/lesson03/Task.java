package lesson03;

public class Task {
    public static void main(String[] args) {

        int floorNumber = 5;
        int countflat = switch (floorNumber) {
            case 1, 2 -> 7;
            case 3, 4 -> 5;
            case 5 -> 2;
            default -> 0;
        };
        System.out.println("Количество квартир на этаже "+countflat);
    }
}
