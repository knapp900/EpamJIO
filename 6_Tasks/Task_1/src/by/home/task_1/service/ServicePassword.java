package by.home.task_1.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ServicePassword {

	public String encryptString(String input) throws ServiceException {

		try {

			MessageDigest md = MessageDigest.getInstance("SHA-224");

			byte[] messageDigest = md.digest(input.getBytes());

			BigInteger bigInteger = new BigInteger(1, messageDigest);

			return bigInteger.toString(16);

		} catch (NoSuchAlgorithmException e) {

			throw new ServiceException(e);
		}
	}

}
