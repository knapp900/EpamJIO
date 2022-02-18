package by.home.archive.dao.Impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import by.home.archive.dao.ArchiveDAO;
import by.home.archive.dao.DAOException;
import by.home.archive.entity.Student;


public class DAOArchiveImpl implements ArchiveDAO {

	@Override
	public List<Student> getAllListInToXML() throws DAOException {

		ClassLoader loader = getClass().getClassLoader();

		String path = loader.getResource("resourse/archive.xml").getPath();

		SAXBuilder builder = new SAXBuilder();
		// распознавание XML-документа
		Document document;
		
		try {
			
			document = builder.build(path);

			Element root = document.getRootElement();

			// получение списка дочерних элементов <student>
			@SuppressWarnings("unchecked")
			List<Element> studElem = root.getChildren();

			Iterator<Element> studentIterator = studElem.iterator();
			// создание пустого списка объектов типа Student
			ArrayList<Student> students = new ArrayList<Student>();

			while (studentIterator.hasNext()) {
				Element studentElement = (Element) studentIterator.next();
				Student student = new Student();
				// заполнение объекта student
				student.setId(studentElement.getAttributeValue("ID"));
				student.setFirstName(studentElement.getChild("first_name").getText());
				student.setAge(Integer.valueOf(studentElement.getChild("age").getText()));
				student.setLastName(studentElement.getChild("last_name").getText());
				student.setFaculty(studentElement.getChild("faculty").getText());
				student.setCourse(Integer.valueOf(studentElement.getChild("course").getText()));

				students.add(student);
				
				
			}
			
			return students;
			
		} catch (JDOMException | IOException e) {
			
			throw new DAOException(e);

		}

	}

	@Override
	public boolean addToArchiveInXML(List<Student> list) throws DAOException {

		boolean complete = true;

		Document document = new Document();

		Element root = new Element("students");

		Iterator<Student> studentIterator = list.iterator();

		while (studentIterator.hasNext()) {

			Student student = studentIterator.next();
			// создание элемента <student> и его содержимого
			Element studentElement = new Element("student");
			// создание атрибутов и передача им значений
			studentElement.setAttribute("ID", student.getId());

			Element firstNameElement = new Element("first_name");
			firstNameElement.setText(student.getFirstName());
			studentElement.addContent(firstNameElement);

			Element lastNameElement = new Element("last_name");
			lastNameElement.setText(student.getLastName());
			studentElement.addContent(lastNameElement);

			Element ageElement = new Element("age");
			String age = String.valueOf(student.getAge());
			ageElement.setText(age);
			studentElement.addContent(ageElement);

			Element facultyElement = new Element("faculty");
			facultyElement.setText(student.getFaculty());
			studentElement.addContent(facultyElement);

			Element courseElement = new Element("course");
			String course = String.valueOf(student.getCourse());
			courseElement.setText(course);
			studentElement.addContent(courseElement);

			document.setRootElement(root);

			root.addContent(studentElement);
		}

		XMLOutputter outputted = new XMLOutputter();

		ClassLoader loader = getClass().getClassLoader();

		String path = loader.getResource("resourse/archive.xml").getPath();

		try {

			outputted.output(document, new FileOutputStream(path));
			return complete;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			complete = false;
		} catch (IOException e) {
			e.printStackTrace();
			complete = false;
		}

		return false;

	}

	@Override
	public boolean delStudent(String id) throws DAOException {

		List<Student> inList = new ArrayList<>();

		try {

			inList.addAll(getAllListInToXML());

		} catch (DAOException e) {

			throw new DAOException(e);
			
		}
		for (Student student : inList) {

			if (student.getId().equals(id)) {

				inList.remove(student);
			}

		}
		try {
			addToArchiveInXML(inList);
			
			return true;
			
		} catch (DAOException e) {

			throw new DAOException(e);
		}
	

	}
}
