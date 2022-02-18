package by.home.task_2.dao;

import by.home.task_2.dao.impl.DAONoteImpl;

public class DAOProvider {
	
	private static final DAOProvider instance = new DAOProvider();
	
	private NoteDAO noteDAO = new DAONoteImpl();
	
	private DAOProvider() {
		
	}
	
	public static DAOProvider getInstance() {
		
		return instance;
	}
	
	public NoteDAO getNotepadDAO() {
		
		return noteDAO;
	}

	public void setNotepadDAO(NoteDAO notepadDAO) {
		this.noteDAO = notepadDAO;
	}
	
	
}
