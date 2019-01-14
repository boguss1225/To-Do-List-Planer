package tdl.view;

import java.awt.Dialog;

import javax.swing.JFrame;

public class AdjustDialog{
	public AdjustDialog( JFrame f, Dialog dia){
		int xpos = (int) (f.getX() + f.getWidth()/2 - dia.getWidth()/2);
		int ypos = (int) (f.getY() + f.getHeight()/2 - dia.getHeight()/2);
		dia.setLocation(xpos,ypos);
	}
}
