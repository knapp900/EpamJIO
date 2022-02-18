package by.home.task_2.controller.impl;

import by.home.task_2.controller.Command;
import by.home.task_2.controller.CommandProvider;
import by.home.task_2.controller.Controller;

public class NotepadController implements Controller{
	
	private CommandProvider provider = new CommandProvider();

	@Override
	public String doAction(String request) {
		
		String[] params = request.substring(1,request.length()-1).split("\\]\\[");
        String response;
        Command currentCommand = provider.getCommand(params[0]);
        response = currentCommand.execute(params);
        return response;
	}

}
