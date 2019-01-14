package tdl.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import com.github.lgooddatepicker.components.CalendarPanel;

import tdl.view.calendar.initCalendar;
import tdl.view.log.initLog;
import tdl.view.memo.initMemo;
import tdl.view.menu.MenuBarSection;
import tdl.view.todo.initToDo;

public class View {
	MainFrame MFrame;
	public View(){
		MFrame = new MainFrame();
	}
}




