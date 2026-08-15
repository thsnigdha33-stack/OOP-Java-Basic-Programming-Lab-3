import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input any octal number: ");
        String octal = input.nextLine();

        int decimal = Integer.parseInt(octal, 8);

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Equivalent binary number: " + binary);
    }
}
