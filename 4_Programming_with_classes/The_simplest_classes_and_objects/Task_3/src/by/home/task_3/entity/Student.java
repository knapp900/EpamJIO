package by.home.task_3.entity;

public class Student {
	
	private String name;
	private int [] progress;
	private int groupNumber;
	
	public Student (String name,int[] progress,int groupNumber) {
		this.name = name;
		this.progress = progress;
		this.groupNumber = groupNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getProgress() {
		return progress;
	}

	public void setProgress(int[] progress) {
		this.progress = progress;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

}
