package by.home.archive.mainServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetClient extends Thread {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Socket socket = null;
		PrintStream out = null;
		BufferedReader in = null;

		try {
			// установка соединения с сервером
			socket = new Socket(InetAddress.getLocalHost(), 8000);
			out = new PrintStream(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("Press any key");
			while (true) {
				
				System.out.print("Client: ");
				out.println(scanner.nextLine());

				String response;
				while ((response = in.readLine()) != null) {

					System.out.println("Server: " + response);
					Thread.sleep(1_00);

					if (!in.ready()) {
						break;
					}

				}

			}

		} catch (UnknownHostException e) {
			System.err.println("адрес недоступен" + e);
		} catch (IOException e) {
			System.err.println("ошибка I/О потока" + e);
		} catch (InterruptedException e) {
			System.err.println("ошибка потока выполнения" + e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
