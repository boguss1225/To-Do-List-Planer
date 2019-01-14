package tdl.model.todoelements;

import java.time.LocalDate;

public class ToDoElementStruct implements Comparable<ToDoElementStruct>{
		private String todoText;
		private int priority;
		private LocalDate Dday;
		private boolean checkValue;
		public ToDoElementStruct(){
			this.todoText = "studying philosophy...!";
			this.priority = 5;
			this.Dday = LocalDate.now().plusDays(7);
			this.checkValue = false;
		}
		public ToDoElementStruct(String txt, int prio , LocalDate da, boolean bool){
			this.todoText = txt;
			this.priority = prio;
			this.Dday = da;
			this.checkValue = bool;
		}
		public String getToDoText(){
			return this.todoText;
		}
		public int getPriority(){
			return this.priority;
		}
		public LocalDate getDDay(){
			return this.Dday;
		}
		public boolean getCheckValue(){
			return this.checkValue;
		}
		public void setToDoText(String s){
			this.todoText = s;
		}
		public void setPriority(int i){
			this.priority = i;
		}
		public void setDday(LocalDate iDday){
			this.Dday = iDday;
		}
		public void setCheckValue(boolean bool){
			this.checkValue = bool;
		}
		
		public void printThis(){
			System.out.println("to do : "+this.todoText +"/ priority : " + this.priority + "/ Dday : " + this.Dday);
		}
		@Override
		public int compareTo(ToDoElementStruct target) {
			if (this.priority > target.priority) {
	            return 1;
	        } else if (this.priority < target.priority) {
	            return -1;
	        }
			return 0;
		}
}
