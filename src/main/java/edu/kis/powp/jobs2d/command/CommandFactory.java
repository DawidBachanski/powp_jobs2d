package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {
	
	public static DriverCommand drawRectangle(Job2dDriver driver)
	{
		ComplexCommand commands = new ComplexCommand();
		
		commands.AddNewCommand(new SetPositionCommand(driver,-120,-120));
		
		commands.AddNewCommand(new OperateToCommand(driver,-120,120));
		commands.AddNewCommand(new OperateToCommand(driver,120,120));
		commands.AddNewCommand(new OperateToCommand(driver,120,-120));
		commands.AddNewCommand(new OperateToCommand(driver,-120,-120));
		
		return commands;
	}
	
	public static DriverCommand drawTriangle(Job2dDriver driver)
	{
		ComplexCommand commands = new ComplexCommand();
		
		commands.AddNewCommand(new SetPositionCommand(driver,-120,-120));
		
		commands.AddNewCommand(new OperateToCommand(driver,120,120));
		commands.AddNewCommand(new OperateToCommand(driver,120,-120));
		commands.AddNewCommand(new OperateToCommand(driver,-120,-120));
		
		
		return commands;
	}

}
