package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.CommandFactory;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String selectedFigure = e.getActionCommand().toString().toLowerCase();
		
		
		if(selectedFigure.equals("figure joe 1"))
		{
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}else if(selectedFigure.equals("figure joe 1")){
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}else if(selectedFigure.equals("factory triangle")) {
			DriverCommand drawTriangle = CommandFactory.drawTriangle(driverManager.getCurrentDriver());
			drawTriangle.execute();
		}else{
			DriverCommand drawRectangle = CommandFactory.drawRectangle(driverManager.getCurrentDriver());
			drawRectangle.execute();
		}
		
		
	}
}
