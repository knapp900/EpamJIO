package by.home.task_2.controller;

import java.util.HashMap;
import java.util.Map;

import by.home.task_2.controller.impl.AddNoteCommand;
import by.home.task_2.controller.impl.GetNoteByDate;
import by.home.task_2.controller.impl.GetNoteByText;
import by.home.task_2.controller.impl.GetNotepad;
import by.home.task_2.controller.impl.GetNotesByEmail;
import by.home.task_2.controller.impl.GetNotesByTopic;

public class CommandProvider {

	private Map<String, Command> commands = new HashMap<String, Command>();

	public CommandProvider() {

		commands.put("getNotepad", new GetNotepad());
		commands.put("addNote", new AddNoteCommand());
		commands.put("topicSearch", new GetNotesByTopic());
		commands.put("emailSearch", new GetNotesByEmail());
		commands.put("dateSearch", new GetNoteByDate());
		commands.put("textSearch", new GetNoteByText());
	}

	public Command getCommand(String commandName) {
		return commands.get(commandName);
	}

}
