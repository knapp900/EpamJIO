package by.home.task_1.entity;

public class File extends Directory {

	private String fileName;

	public File() {
	}

	public File(String fileName, String Dir) {
		super(Dir);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
