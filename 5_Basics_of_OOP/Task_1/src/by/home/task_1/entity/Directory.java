package by.home.task_1.entity;

public class Directory {

	static String dir;

	public Directory() {
		super();

	}

	public Directory(String dir) {
		Directory.dir = dir;

	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		Directory.dir = dir;
	}

}