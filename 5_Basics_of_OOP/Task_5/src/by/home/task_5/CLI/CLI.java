package by.home.task_5.CLI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import by.home.task_5.controller.GiftController;
import by.home.task_5.controller.impl.ControllerGiftImpl;

public class CLI {

	public void start() throws IOException {

		GiftController controller = new ControllerGiftImpl();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		String request;
		boolean flag = true;
		boolean responce;

		while (flag) {

			System.out.println("Whrite title candy:");

			sb.append("Candy " + reader.readLine());

			System.out.println("Whrite price candy");

			sb.append(" price " + reader.readLine() + '\n');

			System.out.println("Do you want add more candy?\n Y/N");

			if (reader.readLine().equalsIgnoreCase("n")) {

				System.out.println(
						"Select packaging.\n If you want package cardboard  press 1\n If you want package plasticBag press 2\n");
				if (reader.readLine().equals("1")) {

					sb.append("Packing cardboard true plasticBag false");

				} else if (reader.readLine().equals("2")) {

					sb.append("Packing cardboard false plasticBag true");
				}

				flag = false;
				reader.close();

				request = sb.toString();

				responce = controller.giftAddController(request);

				if (responce) {

					System.out.println("\nGift added successfully!");

				} else {

					System.out.println("Something went wrong!");
				}

			}

		}
	}

}
