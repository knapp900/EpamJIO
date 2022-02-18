package by.home.task_3.view;

import by.home.task_3.entity.*;

import java.util.List;

public class View {

	public void print(String message, List<Country> list) {

		System.out.println(message + list);

	}
	
	public void print(String message, int value) {
		
		System.out.println(message + value);
		
	}
	public void print(String message, double value) {
		
		System.out.println(message + value);
		
	}

	public void printString(String message, List<String> list) {
		
		System.out.println(message + list);
		
		
	}

}
