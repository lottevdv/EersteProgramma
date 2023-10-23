import java.util.Scanner;

public class afronden2 {
    public static void main(String[] args) {
        System.out.println("Geef een getal in:");
        Scanner input = new Scanner(System.in);

        double pi = input.nextDouble();
        System.out.println(String.format("Pi op 2 cijfers nauwkeurig: %.2f", pi));
        System.out.println(String.format("Pi op 3 cijfers nauwkeurig: %.3f", pi));
    }
}
