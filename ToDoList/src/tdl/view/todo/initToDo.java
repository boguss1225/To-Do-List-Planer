package tdl.view.todo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Scrollable;

import tdl.controller.todo.PopupMenuExample;
import tdl.controller.todo.todoController;
import tdl.controller.todo.todoCreationDialog;
import tdl.model.Model;
import tdl.model.todoelements.ToDoElementStruct;

public class initToDo extends JScrollPane{
	JPanel ToDoPanel;
	private initCreationButton creationButtonPanel;
	public static initToDoElements inittoDoElements;
	public initToDo(JFrame f){
		ToDoPanel = new JPanel();
		ToDoPanel.setLayout(new BoxLayout(ToDoPanel, BoxLayout.Y_AXIS));
		creationButtonPanel = new initCreationButton(f);
		inittoDoElements = new initToDoElements(f);
		ToDoPanel.add(inittoDoElements);
		ToDoPanel.add(creationButtonPanel,BorderLayout.PAGE_END);
		inittoDoElements.UpdateToDoView();
		this.setViewportView(ToDoPanel);
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
}

class initCreationButton extends JPanel implements MouseListener{
	JButton b1;
	initCreationButton(JFrame f){
		b1 = new JButton("Add New",new ImageIcon("src/tdl/icon/add_Circle.png"));
		
		class b1EventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new todoCreationDialog(f);
			}}
		b1.addActionListener(new b1EventHandler());
		b1.addMouseListener(this);
		this.setBorder(BorderFactory.createRaisedBevelBorder());
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		
		this.setLayout(new BorderLayout());
		this.add(b1);
		this.setVisible(true);
	}
	@Override
    public Dimension getMinimumSize() {
        return new Dimension(150, 35);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(230, 35);
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(1000, 35);
    }
    @Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
		this.setBorder(BorderFactory.createLoweredBevelBorder());
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		this.setBorder(BorderFactory.createRaisedBevelBorder());
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}




