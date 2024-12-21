package edu.kis.powp.jobs2d.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand{
	
	private ArrayList<DriverCommand> commands;
	
	public ComplexCommand()
	{
		commands = new ArrayList<>();
	}

	
	public void AddNewCommand(DriverCommand command)
	{
		commands.add(command);
	}


	@Override
	public void execute() {
		
		for(DriverCommand command : commands)
		{
			command.execute();
		}
		
	}
	
	
}
