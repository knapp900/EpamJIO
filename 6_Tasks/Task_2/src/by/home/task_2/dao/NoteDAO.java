package by.home.task_2.dao;

import java.util.List;

import by.home.task_2.entity.Note;

public interface NoteDAO {

	boolean saveToFile(List<Note>list) throws DAOException;

	List<Note> readFile() throws DAOException;

	List<Note> addNote(Note note) throws DAOException;

	List<Note> findByTopic(String topic) throws DAOException;

	List<Note> findByDate(String date) throws DAOException;

	List<Note> findByEMail(String email) throws DAOException;

	List<Note> findByText(String text) throws DAOException;

}
