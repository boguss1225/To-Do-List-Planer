package tdl.view.calendar;

import javax.swing.JPanel;

import com.github.lgooddatepicker.components.CalendarPanel;

public class initCalendar extends JPanel{
	CalendarPanel calendar1;
	public initCalendar(){
		calendar1 = new CalendarPanel();
		this.add(calendar1);
	}
}
