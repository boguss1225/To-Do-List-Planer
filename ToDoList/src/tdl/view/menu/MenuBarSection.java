package tdl.view.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import tdl.controller.todo.todoCreationDialog;//clear after test



public class MenuBarSection{
	public MenuBarSection(JFrame f){
		/*Menu_bar*/
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu setting = new JMenu("Setting");
		JMenu help = new JMenu("Help");
		/*File Menu*/
		JMenuItem newfile = new JMenuItem("New");
		newfile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		JMenuItem open = new JMenuItem("Open");
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		JMenuItem save = new JMenuItem("Save");
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		JMenuItem saveAs = new JMenuItem("Save As..");		JMenuItem exit = new JMenuItem("Close");
		JMenuItem theme = new JMenuItem("Theme");
		JMenuItem helpwords = new JMenuItem("Help");
		JMenuItem about = new JMenuItem("About");
		JMenuItem Testing = new JMenuItem("Testing");
		file.add(newfile);
		file.add(open);
		file.add(save);
		file.add(saveAs);
		file.addSeparator();
		file.add(exit);
		//edit.add();
		setting.add(theme);
		help.add(helpwords);
		help.add(about);
		help.add(Testing);
		/*<Menu_SetUp>*/
		menubar.add(file);
		menubar.add(edit);
		menubar.add(setting);
		menubar.add(help);
		
		/*<MenuItem_Action>*/
		/*open*/
		class openEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				try {
					new openDialog(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}	
		open.addActionListener(new openEventHandler());
		/*save*/
		class saveEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				try {
					new saveDialog(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}	
		save.addActionListener(new saveEventHandler());
		/*종료 메뉴아이템*/
		class exitEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}}	
		exit.addActionListener(new exitEventHandler());
		/*theme menu item*/
		class themeEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new ThemeDialog(f);
			}}
		theme.addActionListener(new themeEventHandler());
		/*도움말 메뉴아이템*/
		class helpEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new HelpDialog(f);
			}}
		helpwords.addActionListener(new helpEventHandler());
		/*저작자 메뉴아이템*/
		class aboutEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new AboutDialog(f);
			}}	
		about.addActionListener(new aboutEventHandler());
		
		/*저작자 메뉴아이템*/
		class TestingEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				/*something want to test*/
				//new todoCreationDialog(f);
			}}	
		Testing.addActionListener(new TestingEventHandler());
		
		/*menubar.setOpaque(true);*/
		f.setJMenuBar(menubar);
		f.setVisible(true);
		
	}	
}
