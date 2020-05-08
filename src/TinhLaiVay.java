import java.util.Scanner;

public class TinhLaiVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double rate = 1.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter number of month: ");
        month = input.nextInt();

        System.out.println("Enter interest rate in percentage: ");
        rate = input.nextDouble();

        double total = 0;
        for (int i = 0; i < month; i++) {
            total =  money * (rate / 100)/12 * month;
        }

        System.out.println("Total of interest: " + total);
    }
}
