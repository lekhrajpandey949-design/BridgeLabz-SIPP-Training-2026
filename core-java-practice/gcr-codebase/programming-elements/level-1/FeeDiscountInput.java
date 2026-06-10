import java.util.Scanner;

public class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("Discount Amount = INR " + discount);
        System.out.println("Final Fee to Pay = INR " + finalFee);

        input.close();
    }
}