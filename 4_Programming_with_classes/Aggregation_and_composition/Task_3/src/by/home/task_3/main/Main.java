package by.home.task_3.main;

import by.home.task_3.entity.*;
import by.home.task_3.logic.*;
import by.home.task_3.view.*;

import java.util.List;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные
 * центры.
 * 
 * @author knapp
 *
 */

public class Main {
	
	public static void main(String[] args) {
		CountryLogic countryLogic = new CountryLogic();
		CountryStorage countryStorage = new CountryStorage();
		View view = new View();
		
		countryStorage.addCountries(new Country("Belarus", 375, "Могилевская", 125, "Могилевский", "Могилев", "Могилев", false));
		countryStorage.addCountries(new Country("Belarus", 375, "Минская", 125, "Минский", "Минск", "Минск", true));
		countryStorage.addCountries(new Country("Belarus", 375, "Гомельская", 125, "Гомельский", "Гомель", "Гомель", false));
		countryStorage.addCountries(new Country("Belarus", 375, "Брестская", 125, "Брестский", "Брест", "Брест", false));
		countryStorage.addCountries(new Country("Belarus", 375, "Гродненская", 125, "Гродненский", "Гродно", "Гродно", false));
		countryStorage.addCountries(new Country("Belarus", 375, "Витебская", 125, "Витебский", "Витебск", "Витебск", false));
		
		
		//Вывести на консоль столицу.
		List<Country> getCapitaList;
		getCapitaList = countryLogic.getCapital(countryStorage.getCountries());
		view.print("Вывести на консоль столицу:" + '\n', getCapitaList);
	
		
		//Вывести на консоль количество областей.
		view.print("Вывести на консоль количество областей:" + '\n', countryLogic.numberOfRegions(countryStorage.getCountries()));
		
		//Вывести на консоль площадь.
		view.print("Вывести на консоль площадь:" + '\n',countryLogic.square(countryStorage.getCountries()));
		
		//Вывести на консол областные центры.
		List<String> findDistrictCenter;
		findDistrictCenter = countryLogic.findDistrictСenter(countryStorage.getCountries());
		view.printString("Вывести на консол областные центры:" + '\n', findDistrictCenter);
		
		
	}

}
