package by.home.task_1.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import by.home.task_1.dao.DAOException;
import by.home.task_1.dao.TreasureDAO;
import by.home.task_1.entity.Treasure;

public class DAOTreasureImpl implements TreasureDAO {
	// Метод возвращает весь список сокровищь.
	@Override
	public List<Treasure> getAll() throws DAOException {

		List<Treasure> list = new ArrayList<Treasure>();

		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/Treasure.txt")));

			String tmpString;

			while ((tmpString = br.readLine()) != null) {

				list.add(new Treasure(tmpString.split("[=\s]")[1], tmpString.split("[=\s]")[3],

						Double.parseDouble(tmpString.split("[=\s]")[6])));
			}
			br.close();

			return list;

		} catch (FileNotFoundException e) {

			throw new DAOException(e);

		} catch (IOException e) {

			throw new DAOException(e);

		} catch (NullPointerException e) {

			throw new DAOException(e);
		}

	}

	// Метод возвращает стоку из сокровищь.
	@Override
	public List<Treasure> getString(String searchAttribute) throws DAOException {

		List<Treasure> list = new ArrayList<Treasure>();

		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/Treasure.txt")));

			String tmpString;

			while ((tmpString = br.readLine()) != null) {

				if (tmpString.contains(searchAttribute)) {

					list.add(new Treasure(tmpString.split("[=\s]")[1], tmpString.split("[=\s]")[3],

							Double.parseDouble(tmpString.split("[=\s]")[6])));

				}
			}
			br.close();

			return list;

		} catch (FileNotFoundException e) {

			throw new DAOException(e);

		} catch (IOException e) {

			throw new DAOException(e);

		}

	}

	// Метод возвращает список по цене сокровищь.
	@Override
	public List<Treasure> getByPrice(String searchAttribute) throws DAOException {

		List<Treasure> list = new ArrayList<Treasure>();

		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/Treasure.txt")));

			String tmpString;

			while ((tmpString = br.readLine()) != null) {

				if (tmpString.split("[=\s]")[6].equals(searchAttribute.split("[=\s]")[6])) {

					list.add(new Treasure(tmpString.split("[=\s]")[1], tmpString.split("[=\s]")[3],

							Double.parseDouble(tmpString.split("[=\s]")[6])));
				}
			}
			br.close();
			return list;

		} catch (FileNotFoundException e) {

			throw new DAOException(e);

		} catch (IOException e) {

			throw new DAOException(e);

		}

	}

	// Метод возвращает список по имени сокровищь.
	@Override
	public List<Treasure> getByName(String searchAttribute) throws DAOException {

		List<Treasure> list = new ArrayList<Treasure>();

		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/Treasure.txt")));

			String tmpString;

			while ((tmpString = br.readLine()) != null) {

				if (tmpString.split("[=\s]")[3].equals(searchAttribute.split("[=\s]")[3])) {

					list.add(new Treasure(tmpString.split("[=\s]")[1], tmpString.split("[=\s]")[3],

							Double.parseDouble(tmpString.split("[=\s]")[6])));
				}
			}
			br.close();
			return list;

		} catch (FileNotFoundException e) {

			throw new DAOException(e);

		} catch (IOException e) {

			throw new DAOException(e);

		}
	}

	// Метод возвращает double максимальной цены одного из сокровищь.
	@Override
	public String getByMaxPrice() throws DAOException {

		double maxPrice = 0;

		String stringMaxPrice = null;

		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/Treasure.txt")));

			String tmpString;

			while ((tmpString = br.readLine()) != null) {

				double tmpMax1 = Double.parseDouble(tmpString.split("[=\s]")[6]);

				if (tmpMax1 > maxPrice) {

					maxPrice = tmpMax1;

					stringMaxPrice = tmpString;
				}

			}
			br.close();

			return stringMaxPrice;

		} catch (FileNotFoundException e) {

			throw new DAOException(e);

		} catch (IOException e) {

			throw new DAOException(e);
		}
	}

	// Метод возвращает список по заданному ценовому значению сокровищь.
	@Override
	public List<Treasure> getByGivenAmount(double amount) throws DAOException {

		List<Treasure> list = new ArrayList<Treasure>();

		double ammount = amount;

		try {

			BufferedReader br = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/Treasure.txt")));

			String tmpString;

			while ((tmpString = br.readLine()) != null) {

				double tmpMax1 = Double.parseDouble(tmpString.split("[=\s]")[6]);

				if (tmpMax1 < ammount) {

					list.add(new Treasure(tmpString.split("[=\s]")[1], tmpString.split("[=\s]")[3],

							Double.parseDouble(tmpString.split("[=\s]")[6])));
				}

			}
			br.close();

			return list;

		} catch (FileNotFoundException e) {

			throw new DAOException(e);

		} catch (IOException e) {

			throw new DAOException(e);
		}

	}

	// Метод добавляет в файл сокровище.
	@Override
	public boolean addString(Treasure treasure) {

		return false;
	}

	// Метод удаляет из файла сокровище.
	@Override
	public boolean removeString() {

		return false;
	}

}
