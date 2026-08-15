import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        String binary = input.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("HexaDecimal value: " + hexadecimal.toUpperCase());
    }
}
