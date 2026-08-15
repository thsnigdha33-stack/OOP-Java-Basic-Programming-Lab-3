import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a octal number : ");
        String octal = input.nextLine();

        int decimal = Integer.parseInt(octal, 8);

        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("Equivalent hexadecimal number: " + hexadecimal.toUpperCase());
    }
}
