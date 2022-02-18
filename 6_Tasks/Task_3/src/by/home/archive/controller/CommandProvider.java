package by.home.archive.controller;

import java.util.HashMap;
import java.util.Map;

import by.home.archive.controller.impl.AddStudentToArchive;
import by.home.archive.controller.impl.GetAllArchive;
import by.home.archive.controller.impl.Logination;
import by.home.archive.controller.impl.RemoveStudentByID;

public class CommandProvider {
	
	private Map<String, Command> commands = new HashMap<>();

	public CommandProvider() {
		
		commands.put("logination", new Logination());
		commands.put("getAllArchive", new GetAllArchive());
		commands.put("addStudentToArchive", new AddStudentToArchive());
		commands.put("removeStudent", new RemoveStudentByID());
		
	}

	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);

		return command;
	}

}
