import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int number = input.nextInt();

        String hexadecimal = Integer.toHexString(number);

        System.out.println("Hexadecimal number is : " + hexadecimal.toUpperCase());
    }
}
