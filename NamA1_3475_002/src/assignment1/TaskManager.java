package assignment1;

import java.util.Random;
import java.util.Scanner;

public class TaskManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList<Task> taskList = new MyList<Task>();
		int programControl = 1;
		int option;
		int availableTaskNo = 1;
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Choose an option below:");
//		System.out.println("1. Add a task.");
//		System.out.println("2. View task.");
//		System.out.println("3. Remove a task.");
//		System.out.println("4. Remove all tasks.");
//		System.out.println("5. Exit.");
		while(programControl == 1) {
			System.out.println("Choose an option below:");
			System.out.println("1. Add a task.");
			System.out.println("2. View task.");
			System.out.println("3. Remove a task.");
			System.out.println("4. Remove all tasks.");
			System.out.println("5. Exit.");
			option = scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1:
				System.out.println("Enter task description:");
				Task newTask = new Task();
				String desInput = scanner.nextLine();
				newTask.setTaskDes(desInput);
				newTask.setTaskNo(availableTaskNo);
				taskList.add(newTask);
				availableTaskNo++;
				
				break;
			case 2:
				//System.out.println("option 2 selected");
				//Task[] taskArr = (Task[])taskList.toArray();
				if(taskList.isEmpty()) {
					System.out.println("Task list is empty!");
				} else {
					for(int i =1; i <=taskList.getLength(); i++) {
						System.out.println("Task no: "+ taskList.getEntry(i).getTaskNo()+" - Description: "+taskList.getEntry(i).getTaskDes());
						
					}
				}				
				System.out.println("------------");
				break;
			case 3:
				System.out.println("Enter task no you want to remove");
				int removeTaskNo = scanner.nextInt();
				scanner.nextLine();
				int found = -1;
				for(int i =1; i<=taskList.getLength();i++) {
					if(removeTaskNo == taskList.getEntry(i).getTaskNo()) {
						found = 1;
					}
				}
				if(found != -1) {
					taskList.remove(removeTaskNo);
					//availableTaskNo = removeTaskNo;
				} else {
					System.out.println("Task no does not existed in the list!");
				}
				break;
			case 4:
				taskList.clear();
				if(taskList.isEmpty()) {
					System.out.println("Task list is empty now!");
				}
				availableTaskNo = 1;
				break;
			case 5:
				System.out.println("Thank you for using!");
				programControl = -1;
				break;
			}
		}
				

	}
	
	

}
