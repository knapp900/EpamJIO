package by.home.task_2.presentation;

public class View {
	
	public String print(Object o) {
		
		return o.toString();
	}

	public String addNoteView (String response) {
		
		if(response.equals("1")) {
			
			return "Заметка добавлена";
			
		}if (response.equals("2")) {
			
			return "Проверьте правильность адреса электронной почты";
			
		} else {
			
			return "Что-то пошло не так!";

		}

	}

}
