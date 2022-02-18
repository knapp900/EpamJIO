package working_with_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
//тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
//нельзя.
public class Task_2 {
	private final String textXmlString = "<notes>\n" + "<note id = \"1\">\n" + "<to>Вася</to>\n"
			+ "<from>Света</from>\n" + "<heading>Напоминание</heading>\n" + "<body>Позвони мне завтра!</body>\n"
			+ "</note>\n" + "<note id = \"2\">\n" + "<to>Петя</to>\n" + "<from>Маша</from>\n"
			+ "<heading>Важное напоминание</heading>\n" + "<body/>\n" + "</note>\n" + "</notes>";

	public static void main(String[] args) {
		Task_2 text = new Task_2();
		String[] textXml = text.textXmlString.split("\\n");
		StringBuilder sBuilder = new StringBuilder();
		Pattern tOpen = Pattern.compile("<[\\w=\"\"\\s]+>");
		Pattern tClose = Pattern.compile("</\\w+>");
		Pattern tContent = Pattern.compile("[а-яА-яЁё\\s]+[!.?,]?");
		Pattern tEmpyBody = Pattern.compile("<([\\w]+/)>");

		for (String s : textXml) {
			Matcher tOpenMatcher = tOpen.matcher(s);
			if (tOpenMatcher.find()) {
				sBuilder.append("Тег открыт->");
				sBuilder.append(tOpenMatcher.group());

			}
			Matcher tEmptyBodyMatcher = tEmpyBody.matcher(s);
			if (tEmptyBodyMatcher.find()) {
				sBuilder.append(tEmptyBodyMatcher.group());
				sBuilder.append("<-Tег без тела");

			}

			Matcher tContentMatcher = tContent.matcher(s);
			if (tContentMatcher.find() && !tContentMatcher.group().equals(" ")) {
				sBuilder.append("Cодержимое тега:");
				sBuilder.append(tContentMatcher.group());
				sBuilder.append(" ");

			}

			Matcher tCloseMatcher = tClose.matcher(s);
			if (tCloseMatcher.find()) {
				sBuilder.append(tCloseMatcher.group());
				sBuilder.append("<-Тег закрыт");
			}
			sBuilder.append("\n");
		}
		System.out.println(sBuilder);

	}
}
