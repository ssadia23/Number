package numbers;

import java.util.Random;
import java.util.Scanner;

public class NthNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int smallest = 0, number = 0, integers = 0;

		System.out.println("Enter number of integers: ");
		integers = scanner.nextInt();

		for (int i = 1; i <= integers; i++) {

			System.out.println("Enter integer: ");
			number = scanner.nextInt();

			if (i == 1) {
				smallest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}

		System.out.println("Smallest number is : " + smallest);
	}

}
