package tdl.view.todo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import tdl.controller.todo.todoController;
import tdl.model.Model;

public class initToDoElements extends JScrollPane{
	JPanel toDoElementsP1;
	JFrame f1;
	initToDoElements(JFrame f){
		f1 = f;
		toDoElementsP1 = new JPanel();
		toDoElementsP1.setLayout(new ModifiedFlowLayout(ModifiedFlowLayout.CENTER));
		this.setViewportView(toDoElementsP1);
		this.setVisible(true);
	}	
	
	public void UpdateToDoView(){
		if(Model.priorityQueue.peek()==null){//nothing to do
			toDoElementsP1.removeAll();
			//초기이미지
			BufferedImage myPicture;
			try {
				myPicture = ImageIO.read(new File("src/tdl/icon/toDoInitImage.png"));
				JLabel picLabel = new JLabel(new ImageIcon(myPicture));
				toDoElementsP1.add(picLabel);
			} catch (IOException e) {
				e.printStackTrace();
			}

			toDoElementsP1.revalidate();
		}else{
			todoController ctr = new todoController();
			toDoElementsP1.removeAll();
			while (!ctr.PQCopy.isEmpty()) {
				new addToDoElement(toDoElementsP1,ctr.PQCopy.poll(),f1);
			}
			toDoElementsP1.revalidate();
			toDoElementsP1.repaint();
		}				
	}

	
	@Override
    public Dimension getMinimumSize(){
        return new Dimension(150, 30);
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(230, 30);
    }

    @Override
    public Dimension getMaximumSize(){
        return new Dimension(1000, 99990);
    }

}
