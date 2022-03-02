package by.home.task_2.dao.impl;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.home.task_2.dao.DAOException;
import by.home.task_2.dao.NoteDAO;
import by.home.task_2.entity.Note;

public class DAONoteImpl implements NoteDAO {

	@Override
	public boolean saveToFile(List<Note> list) throws DAOException {

		ClassLoader loader = getClass().getClassLoader();

		String path = loader.getResource("resources/Notes.txt").getPath();

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

			oos.writeObject(list);

		} catch (IOException e) {

			throw new DAOException(e);
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Note> readFile() throws DAOException {

		ClassLoader loader = getClass().getClassLoader();

		String path = loader.getResource("resources/Notes.txt").getPath();

		List<Note> listNotes = new ArrayList<Note>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

			listNotes.addAll((List<Note>) ois.readObject());

			return listNotes;

		} catch (EOFException e) {

			throw new DAOException(e);

		} catch (IOException e) {

			throw new DAOException(e);

		} catch (ClassNotFoundException e) {

			throw new DAOException(e);

		}

	}

	@Override
	public List<Note> addNote(Note note) throws DAOException {

		List<Note> listnNotes = new ArrayList<Note>();

		listnNotes.addAll(readFile());
		listnNotes.add(note);

		saveToFile(listnNotes);

		return listnNotes;
	}

	@Override
	public List<Note> findByTopic(String topic) throws DAOException {

		String regex = "(" + topic + ")+";

		List<Note> inputList = new ArrayList<Note>();
		inputList.addAll(readFile());

		List<Note> outputList = new ArrayList<Note>();

		Pattern pattern = Pattern.compile(regex);

		for (Note note : inputList) {

			Matcher matcher = pattern.matcher(note.getTopic());

			if (matcher.find()) {

				outputList.add(note);
			}

		}

		return outputList;
	}

	@Override
	public List<Note> findByDate(String date) throws DAOException {

		String regex = "(" + date + ")+";

		List<Note> inputList = new ArrayList<Note>();

		inputList.addAll(readFile());

		List<Note> outputList = new ArrayList<Note>();

		Pattern pattern = Pattern.compile(regex);

		for (Note note : inputList) {

			String tmpStrings = note.getDateOfCreation().split("\\s")[0];

			Matcher matcher = pattern.matcher(tmpStrings);

			if (matcher.find()) {

				outputList.add(note);
			}

		}

		return outputList;
	}

	@Override
	public List<Note> findByEMail(String email) throws DAOException {

		String regex = "(" + email + ")+";

		List<Note> inputList = new ArrayList<Note>();
		inputList.addAll(readFile());

		List<Note> outputList = new ArrayList<Note>();

		Pattern pattern = Pattern.compile(regex);

		for (Note note : inputList) {

			Matcher matcher = pattern.matcher(note.getE_mail());

			if (matcher.find()) {

				outputList.add(note);
			}

		}

		return outputList;
	}

	@Override
	public List<Note> findByText(String text) throws DAOException {

		String regex = "(" + text + ")+";

		List<Note> inputList = new ArrayList<Note>();
		inputList.addAll(readFile());

		List<Note> outputList = new ArrayList<Note>();

		Pattern pattern = Pattern.compile(regex);

		for (Note note : inputList) {


			Matcher matcher = pattern.matcher(note.getMessage());

			if (matcher.find()) {

				outputList.add(note);
			}

		}

		return outputList;
	}

}
