import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number : ");
        String hexadecimal = input.nextLine();

        int decimal = Integer.parseInt(hexadecimal, 16);

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Equivalent Binary Number is: " + binary);
    }
}
