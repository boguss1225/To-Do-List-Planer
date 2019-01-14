package tdl.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import tdl.view.calendar.initCalendar;
import tdl.view.log.initLog;
import tdl.view.memo.initMemo;
import tdl.view.todo.initToDo;

public class Taps{
	JTabbedPane tabPane;
	JScrollPane todotab;
	JScrollPane memotab;
	public static initLog logtab;
	JPanel calendartab;
	
	Taps(JFrame f){
		tabPane = new JTabbedPane();		

		todotab = new initToDo(f);
		memotab = new initMemo();
		logtab = new initLog();
		calendartab = new initCalendar();
		
		tabPane.addTab("ToDo", todotab);
		tabPane.addTab("Memo", memotab);
		tabPane.addTab("log", logtab);
		tabPane.addTab("", calendartab);
		tabPane.setIconAt(0, new ImageIcon("src/tdl/icon/checkbox.png"));
		tabPane.setIconAt(1, new ImageIcon("src/tdl/icon/notebook.png"));
		tabPane.setIconAt(2, new ImageIcon("src/tdl/icon/log.png"));
		tabPane.setIconAt(3, new ImageIcon("src/tdl/icon/calendar-icon.png"));
		f.add(tabPane, BorderLayout.CENTER);
		f.setVisible(true);
		
	}
}
