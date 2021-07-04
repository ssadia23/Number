package numbers;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		Random randomNUmber = new Random();
	
		for (int i = 1; i <= 500; i++) {
			
			System.out.println(randomNUmber.nextInt(999));

		}

	}

}
