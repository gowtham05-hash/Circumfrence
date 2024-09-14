import java.util.Scanner;
import java.text.*;
public class Circumference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		double circle = 2*3.142*r;
		DecimalFormat ai = new DecimalFormat("0.00");
		System.out.println(ai.format(circle));

	}

}