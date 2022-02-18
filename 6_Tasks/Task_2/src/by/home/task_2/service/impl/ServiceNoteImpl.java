package by.home.task_2.service.impl;

import by.home.task_2.dao.DAOException;
import by.home.task_2.dao.DAOProvider;
import by.home.task_2.entity.Note;
import by.home.task_2.entity.Notepad;
import by.home.task_2.service.NoteService;
import by.home.task_2.service.ServiceException;

public class ServiceNoteImpl implements NoteService {

	DAOProvider provider = DAOProvider.getInstance();

	@Override
	public Notepad getNotepad() throws ServiceException {

		Notepad notepads;

		try {

			notepads = new Notepad(provider.getNotepadDAO().readFile());

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

		return notepads;
	}

	@Override
	public boolean addNote(String topic, String email, String text) throws ServiceException {

		Note note = new Note(topic, email, text);

		try {

			provider.getNotepadDAO().addNote(note);

			return true;

		} catch (DAOException e) {

			throw new ServiceException(e);
		}
	}

	@Override
	public Notepad findByTopic(String topic) throws ServiceException {

		Notepad notepad;

		try {

			notepad = new Notepad(provider.getNotepadDAO().findByTopic(topic));

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

		return notepad;

	}

	@Override
	public Notepad findByData(String date) throws ServiceException {
		Notepad notepad;

		try {

			notepad = new Notepad(provider.getNotepadDAO().findByDate(date));

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

		return notepad;
	}

	@Override
	public Notepad findByEmail(String email) throws ServiceException {

		Notepad notepad;

		try {

			notepad = new Notepad(provider.getNotepadDAO().findByEMail(email));

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

		return notepad;
	}

	@Override
	public Notepad findByText(String text) throws ServiceException {
		Notepad notepad;

		try {

			notepad = new Notepad(provider.getNotepadDAO().findByText(text));

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

		return notepad;
	}

}
