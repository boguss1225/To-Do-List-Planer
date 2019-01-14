package tdl.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import tdl.view.menu.MenuBarSection;

public class MainFrame extends JFrame{
	MenuBarSection MenuBar; 
	Taps taps;
    MainFrame() {
    	//set Title 
    	this.setTitle("To Do List 1.0 v");
		Image iPrintManager = Toolkit.getDefaultToolkit().getImage("src/tdl/icon/MainFrameicon"
				+ ".png");
	 	this.setIconImage(iPrintManager);
    	addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
    	setSize(300, 500);
		MenuBar = new MenuBarSection(this);
		taps = new Taps(this);
		//set position of the main frame in the middle of screen.			
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = 20;
		int ypos = (int) (screen.getHeight() / 4);
		setLocation(xpos, ypos);
		
		setVisible(true);				
	}
}