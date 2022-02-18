package by.home.task_1.service.impl;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import by.home.task_1.service.EmailService;
import by.home.task_1.service.ServiceException;

public class ServiceGmailSenderImpl implements EmailService {

	@Override
	public boolean sendMessage(String from, String pass, String to, String subject, String body)
			throws ServiceException {

		try {

			String SMTP_AUTH_USER = from;
			String SMTP_AUTH_PSW = pass;
//			String SMTP_AUTH_USER = "testSender2022@gmail.com";
//			String SMTP_AUTH_PSW = "1234567890ABC";

			Properties properties = new Properties();

			properties.put("mail.transport.protocol", "smtps");
			properties.put("mail.smtps.host", SMTP_AUTH_USER);
			properties.put("mail.smtps.auth", "true");
			properties.put("mail.smtp.sendpartial", "true");

			Session session = Session.getDefaultInstance(properties);

			Transport transport = session.getTransport();
			transport.connect("smtp.gmail.com", 465, SMTP_AUTH_USER, SMTP_AUTH_PSW);

			MimeMessage message = new MimeMessage(session);

			message.setSubject(subject);
			message.setText(body);
			message.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(to)));
			message.setSentDate(new Date());

			transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));

			return true;

		} catch (MessagingException e) {

			throw new ServiceException(e);

		}

	}

}
