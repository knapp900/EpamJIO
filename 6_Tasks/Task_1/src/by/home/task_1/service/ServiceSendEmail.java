package by.home.task_1.service;

import java.util.Date;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

public class ServiceSendEmail {

	boolean SendEmail(String from, String pass, String to, String subject, String body) throws ServiceException {

		Properties props = new Properties();
		props.put("mail.smtp.host", "my-mail-server");
		props.put("mail.from", "me@example.com");
		Session session = Session.getInstance(props, null);

		try {
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom();
			msg.setRecipients(Message.RecipientType.TO, "you@example.com");
			msg.setSubject("JavaMail hello world example");
			msg.setSentDate(new Date());
			msg.setText("Hello, world!\n");
			
			Transport transport = session.getTransport();
			transport.connect();
			Transport.send(msg);
			
			

			return true;

		} catch (MessagingException mex) {

			throw new ServiceException(mex);
		}

	}

}
