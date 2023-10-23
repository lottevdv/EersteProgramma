import java.util.Scanner;

public class afronden {
    public static void main(String[] args) {

        System.out.println("Geef een getal in:");
        Scanner keyb = new Scanner(System.in);
        double input = keyb.nextDouble();

        System.out.println("Salary: " + input);
        double Salary = Math.round(input);
        System.out.println("Salary: " + Salary);

    }
}
