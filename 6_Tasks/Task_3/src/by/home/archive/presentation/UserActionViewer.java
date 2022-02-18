package by.home.archive.presentation;

import by.home.archive.entity.user.Role;

public class UserActionViewer {

	public static String loginationAnswer(boolean result) {

		

		if (result) {

			return "1";

		} else {

			return  "0";
		}

	}

	public static String roleAnswer(Role result) {

		

		if (result.equals(Role.ADMIN)) {

			return "2";


		} else {

			return "3";
		}

	}

}
