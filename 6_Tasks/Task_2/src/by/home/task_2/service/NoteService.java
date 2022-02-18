package by.home.task_2.service;


import by.home.task_2.entity.Notepad;

public interface NoteService {

	Notepad getNotepad() throws ServiceException;

	boolean addNote(String topic, String email, String text) throws ServiceException;

	Notepad findByTopic(String topic) throws ServiceException;

	Notepad findByData(String date) throws ServiceException;
	
	Notepad findByEmail(String email) throws ServiceException;
	
	Notepad findByText(String text) throws ServiceException;






}
