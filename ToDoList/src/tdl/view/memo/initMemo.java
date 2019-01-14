package tdl.view.memo;

import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

public class initMemo extends JScrollPane {
	JEditorPane memoTexttab;
	
	public initMemo(){
		memoTexttab = new JEditorPane();
		memoTexttab.setText("Launched a rocket for the PlaNet");
		memoTexttab.setVisible(true);
		this.setViewportView(memoTexttab);
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

	}

}
