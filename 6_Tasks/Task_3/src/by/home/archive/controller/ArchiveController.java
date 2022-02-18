package by.home.archive.controller;

public class ArchiveController implements Controller {
	
	private CommandProvider provider = new CommandProvider();

	@Override
	public String doAction(String request) {
		
		String[] params;
        String commandName;

        params = request.split("\\s");
        commandName = params[0];

        Command currentCommand = provider.getCommand(commandName);
        String response;

        response = currentCommand.exequte(params);


        return response;
		
	}

}
