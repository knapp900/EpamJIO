package by.home.task_1.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.home.task_1.dao.DAOException;
import by.home.task_1.dao.DAOProvider;
import by.home.task_1.entity.Book;
import by.home.task_1.service.EmailService;
import by.home.task_1.service.LibraryService;
import by.home.task_1.service.ServiceException;

public class ServiceLibraryImpl implements LibraryService {

	DAOProvider provider = DAOProvider.getInstance();

	@Override
	public String getBooks() throws ServiceException {

		try {

			return provider.getBookDAO().getAllBooks();

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

	}

	@Override
	public boolean addBook(String title,String description,boolean eBook) throws ServiceException {
		
		Book book = new Book(title, description, eBook);
		

		try {

			if (provider.getBookDAO().addBook(book)) {

				EmailService emailService = new ServiceGmailSenderImpl();

				List<String> email = new ArrayList<String>();
				
				email.addAll(provider.getUserDAO().getAllEmail());

				for (String string : email) {

					emailService.sendMessage("test@gmail.com", "123", string,
							"Добавлена новая книга.", "Название: " + title + '\n' + "Описание: " + description);

				}
				System.out.println("Все пользователи уведомлены.");

			}
			return true;

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

	}

	@Override
	public boolean delBook(String book) throws ServiceException {

		try {

			return provider.getBookDAO().delBook(book);

		} catch (DAOException e) {

			throw new ServiceException(e);
		}
	}

	@Override
	public String findByTitle(String title) throws ServiceException {

		try {

			return provider.getBookDAO().findByTitle(title);

		} catch (DAOException e) {

			throw new ServiceException(e);

		}

	}

	@Override
	public boolean offerBook(String title, String description) throws ServiceException {

		EmailService emailService = new ServiceGmailSenderImpl();

		try {

			emailService.sendMessage("testSender2022@gmail.com", "1234567890ABC", provider.getUserDAO().getAdminEmail(),
					"Предложена новая книга.", "Название: " + title + '\n' + "Описание: " + description);

			return true;

		} catch (ServiceException | DAOException e) {

			throw new ServiceException(e);
		}

	}

}
