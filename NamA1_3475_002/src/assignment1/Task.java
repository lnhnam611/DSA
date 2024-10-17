package assignment1;

public class Task {
	
	private int taskNo;
	private String taskDes;
	
	
	
	public Task() {}
	public Task(int taskNo, String taskDes) {
		super();
		this.taskNo = taskNo;
		this.taskDes = taskDes;
	}
	public int getTaskNo() {
		return taskNo;
	}
	public void setTaskNo(int taskNo) {
		this.taskNo = taskNo;
	}
	public String getTaskDes() {
		return taskDes;
	}
	public void setTaskDes(String taskDes) {
		this.taskDes = taskDes;
	}
	
	

}
