package by.home.task_5.controller.validation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Logger;

public class ValidationImpl implements by.home.task_5.controller.Validation {
	
	private static final Logger loger = Logger.getGlobal();

	@Override
	public boolean validationGiftAdd(String request) {
		String r = request;

		boolean flag = true;

		try {
			BufferedReader reader = new BufferedReader(new StringReader(r));

			while (flag) {

				String t = reader.readLine();

				if (t != null) {

					if (t.matches("Candy [a-zA-Z&-]{1,} price [\\d]{1,}")
							^ t.matches("Packing [\\w]{1,} (true|false) [\\w]{1,} (true|false)")) {

					} else {

						flag = false;
						return false;
					}
				} else {

					flag = false;
					return true;
				}
			}

		} catch (FileNotFoundException e) {

			loger.info("ERROR");

		} catch (IOException e) {

			loger.info("ERROR");
		}
		return false;

	}

}
