package by.home.task_2.service;

import by.home.task_2.service.impl.ServiceNoteImpl;

public class ServiceProvider {

	private final static ServiceProvider instance = new ServiceProvider();

	private NoteService noteService = new ServiceNoteImpl();

	public NoteService getNoteService() {
		return noteService;
	}

	public void setNoteService(NoteService noteService) {
		this.noteService = noteService;
	}

	private ServiceProvider() {

	}

	public static ServiceProvider getInstance() {
		return instance;

	}

}
