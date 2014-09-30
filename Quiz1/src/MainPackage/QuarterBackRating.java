package MainPackage;

import java.util.Scanner;

public class QuarterBackRating {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of passing attempts: ");
		double att = input.nextInt();

		System.out.println("Enter number of completions: ");
		double comp = input.nextInt();

		System.out.println("Enter passing yards: ");
		double yds = input.nextInt();

		System.out.println("Enter number of touchdown passes: ");
		double td = input.nextInt();

		System.out.println("Enter number of interceptions: ");
		double inter = input.nextInt();

		double a = (((comp / att) - .3) * 5);
		double b = (((yds / att) - 3) * .25);
		double c = ((td / att) * 20);
		double d = 2.375 - ((inter / att) * 25);

		double pass_constant = 2.375;

		if (a > pass_constant) {
			a = pass_constant;
		} else if (a < 0) {
			a = 0;
		} else {
			a = a;
		}

		if (b >= pass_constant) {
			b = pass_constant;
		} else if (b < 0) {
			b = 0;
		} else {
			b = b;
		}

		if (c >= pass_constant) {
			c = pass_constant;
		} else if (c < 0) {
			c = 0;
		} else {
			c = c;
		}

		if (d >= pass_constant) {
			d = pass_constant;
		} else if (d < 0) {
			d = 0;
		} else {
			d = d;
		}

		double passer_rating = (((a + b + c + d) / 6) * 100);

		System.out.println("The passer rating of this quarterback is" + " "
				+ passer_rating);

	}
}
