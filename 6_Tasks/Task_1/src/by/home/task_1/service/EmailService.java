package by.home.task_1.service;

public interface EmailService {

	boolean sendMessage(String from, String pass, String to, String subject, String body) throws ServiceException;

}
