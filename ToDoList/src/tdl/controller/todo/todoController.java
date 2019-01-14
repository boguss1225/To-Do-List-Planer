package tdl.controller.todo;

import java.util.PriorityQueue;

import tdl.model.Model;
import tdl.model.todoelements.ToDoElementStruct;

public class todoController {
	public PriorityQueue<ToDoElementStruct> PQCopy;
	public todoController(){
		PQCopy = new PriorityQueue<>(Model.priorityQueue);
	}
	public void iterator(){
		while (!PQCopy.isEmpty()) {
				ToDoElementStruct todoData = PQCopy.poll();
	            System.out.println(todoData.getToDoText());
		}
	}
	public void deleteE(ToDoElementStruct todoE){
		Model.priorityQueue.poll();
	}
}
