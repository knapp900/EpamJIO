package by.home.archive.mainServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.Date;

import by.home.archive.controller.ArchiveController;


public class MainServer {

	public static void main(String[] args) {

		try (ServerSocket server = new ServerSocket(8000)) {

			System.out.println("Server running...");
			while (true) {
				// ожидание клиента
				Socket socket = server.accept();
				System.out.println("Connected: " + socket.getInetAddress().getHostName() + " port: " + socket.getPort()
						+ " date: " + new Date());
				//создание отдельного потока для обмена данными с * соединившимся клиентом.
				ServerThread thread = new ServerThread(socket);
				// запуск потока
				thread.start();
			}
		} catch (IOException e) {

			System.err.println(e);
		}
	}
}

class ServerThread extends Thread implements Runnable {

	ArchiveController controller = new ArchiveController();

	private PrintStream out; // передача
	private BufferedReader in; // прием
	private InetAddress addr; // адрес клиента

	public ServerThread(Socket s) throws IOException {
		out = new PrintStream(s.getOutputStream());
		in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		addr = s.getInetAddress();
	}

	@Override
	public void run() {
		String str;
//		out.println("Press any key");
		try {
			while ((str = in.readLine()) != null) {
				
				

				boolean startFlag = true;

				while (startFlag) {

					out.print("""
							\n1.Вход в архив.
							2.Выход.\n
							""");

					if (in.readLine().equals("1")) {

						out.println("Введите логин:");
						String login = in.readLine();
						out.println("Введите пароль:");
						String password = in.readLine();
						str = "logination login=" + login + " password=" + password;

						if (controller.doAction(str).equals("2")) {
							boolean flag = true;

							while (flag) {

								out.print("""
										\n1.Показать весь архив.
										2.Добавить студента в архив.
										3.Удалить студента из архива.
										4.Выйти в меню выбора пользователя.\n
										""");

								switch (in.readLine()) {
								case "1" -> out.println(controller.doAction("getAllArchive"));
								case "2" -> {
									out.println("Введите имя:");
									String firstName = in.readLine();
									out.println("Введите фамилию:");
									String lastName = in.readLine();
									out.println("Введите возраст:");
									String age = in.readLine();
									out.println("Введите факультет:");
									String faculty = in.readLine();
									out.println("Введите курс:");
									String course = in.readLine();

									String request = "addStudentToArchive " + firstName + " " + lastName + " " + age
											+ " " + faculty + " " + course;

									out.println(controller.doAction(request));
									break;

								}
								case "3" -> {
									out.println("Введите ID студента которого нужно удалить.");
									String id = in.readLine();
									out.println(controller.doAction("removeStudent " + id));
									break;
								}
								case "4" -> flag = false;

								}
							}

						}
						if (controller.doAction(str).equals("3")) {
							boolean flag = true;

							while (flag) {

								out.print("""
										\n1.Показать весь архив.
										2.Выйти в меню выбора пользователя.\n
										""");

								switch (in.readLine()) {
								case "1" -> out.println(controller.doAction("getAllArchive"));
								case "2" -> flag = false;

								}
							}

						} 
						
						else if (controller.doAction(str).equals("0")) {
							out.println("\nТакого пользователя нет в системе!\n"
									+ "Пожалуйста проверьте правельность ввода\n"
									+ "логина и пороля и попробуйте еще раз.");
						}
					}

					else {
						startFlag = false;
						disconnect();
					}
				}
			}

		} catch (IOException e) {
			// если клиент не отвечает, соединение с ним разрывается
			System.err.println("Disconnect");
		}

		finally {
			disconnect(); // уничтожение потока
		}
	}

	public void disconnect() {
		try {
			if (out != null) {
				out.close();
			}
			if (in != null) {
				in.close();
			}

			System.out.println("Disconnected: " + addr.getHostName() + " date: " + new Date());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			this.interrupt();
		}
	}

}
