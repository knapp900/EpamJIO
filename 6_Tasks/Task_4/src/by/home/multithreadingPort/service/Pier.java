package by.home.multithreadingPort.service;

import by.home.multithreadingPort.dao.*;
import by.home.multithreadingPort.entity.*;
import java.util.ArrayList;
import java.util.List;

public class Pier {

	private static final int LIMIT = 1000; // Лимит грузов в порту.
	
	/**
	 * Метод pietIsOpen запускает поток "открывает причал".
	 * 
	 * @param portStorage
	 * @param boatStorage
	 * @param shipment
	 */

	public void pietIsOpen(PortStorage portStorage, BoatStorage boatStorage, Shipment shipment) { 

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				
				boolean flag = true;
				while (flag) {

					Boat boat = boatStorage.getBoatFromList(); // Получаем объект Boat 
					List<Boat> list = new ArrayList<>();

					if (boat != null) {

						if (checkCargoStorageForAdd(boat, portStorage) && boat != null) { // Разгрузка корабля.
							
							boat.setName("Добавил: " + Thread.currentThread().getName());
							portStorage.addCargo((boat));
							list.addAll(portStorage.getCargoList());

							System.out.println("Склад: " + list);                    

						} else if (boat.getCargo() == 0) { // Загрузка корабля.
							
							boat.setCargo(portStorage.getCargoFromList());
							shipment.setShipment(boat);
							System.out.println("Отгрузил: " + Thread.currentThread().getName() + " " + boat + '\n'
									+ shipment.getShipmentLog().toString());


						}

					} else { 
						
						flag = false; //Список кораблей закончился.Закрываем причал.
					}

				}
				System.out.println("Порт " + Thread.currentThread().getName() + " закрыт.");

			}
		});
		thread.start();

	}

	/**
	 * Проверка на соответствие для добавления в portStorage.
	 * 
	 * @param boat
	 * @param portStorage
	 * @return
	 */
	boolean checkCargoStorageForAdd(Boat boat, PortStorage portStorage) {

		if (boat != null && boat.getCargo() != 0) {
			
			if ((portStorage.listSize() + boat.getCargo()) <= LIMIT) {
				
				return true;
				
			} else {

				return false;
			}
		} else {

			return false;
		}

	}

}
