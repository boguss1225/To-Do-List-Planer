package tdl.model;

import java.util.PriorityQueue;

import tdl.model.todoelements.ToDoElementStruct;

public class Model {
	public static PriorityQueue<ToDoElementStruct> priorityQueue;
	public static String logTextContents="log start...";
	public static String FilePath = null;
	public Model(){
		priorityQueue = new PriorityQueue<ToDoElementStruct>();
		
	}
}
