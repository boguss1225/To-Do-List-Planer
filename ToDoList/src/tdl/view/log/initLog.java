package tdl.view.log;

import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

import tdl.model.Model;

public class initLog extends JScrollPane{
	JEditorPane logTexttab;
	public initLog(){
		logTexttab = new JEditorPane();
		logTexttab.setEditable(false);
		logTexttab.setText(Model.logTextContents);
		logTexttab.setVisible(true);
		this.setViewportView(logTexttab);
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	public void UpdateLogView(){
		logTexttab.setText(Model.logTextContents);
		this.revalidate();
		this.repaint();
	}
	
}
