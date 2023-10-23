import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hallo Daar !");
        System.out.println("Ik zal voor jou twee getallen optellen");
        System.out.println("Geef twee getallen op, lijn per lijn:");
        int n1, n2;
        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        System.out.println("De som van de twee getallen is");
        System.out.println(n1 + n2);
    }
}