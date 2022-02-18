package by.home.task_4.view;

import by.home.task_4.entity.*;

import java.util.List;


public class View {
	
	public void print(String message, Customer customer) {
		System.out.println(message + customer);
	}
	
	public void print(String message, List <Customer> list) {
		System.out.println(message + list);
	}
	
	public void print(String message, Double list) {
		System.out.println(message + list);
	}
	

}
