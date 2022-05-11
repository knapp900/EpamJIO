package by.home.multithreadingPort.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import by.home.multithreadingPort.entity.*;
import by.home.multithreadingPort.dao.*;
import by.home.multithreadingPort.service.*;

/**
 * Задание 4. Многопоточность. Порт . Корабли заходят в порт для
 * разгрузки/загрузки контейнеров.
 *  Число контейнеров, находящихся в текущий
 * момент в порту и на корабле, должно быть неотрицательным и превышающим
 * заданную грузоподъемность судна и вместимость порта.
 *  В порту работает несколько причалов.
 *  У одного причала может стоять один корабль.
 *  Корабль может загружаться у причала или разгружаться.
 *  * @author Atrhur Knapp
 */

public class Main {
    public static void main(String[] args) {
        List<Boat> waitingList = new ArrayList<>();
        waitingList.add(new Boat("AA1", 23));
        waitingList.add(new Boat("AA2", 43));
        waitingList.add(new Boat("AA3", 10));
        waitingList.add(new Boat("AA4", 53));
        waitingList.add(new Boat("AA5", 0));
        waitingList.add(new Boat("AA6", 20));
        waitingList.add(new Boat("AA1", 2));
        waitingList.add(new Boat("AA2", 3));
        waitingList.add(new Boat("AA3", 0));
        waitingList.add(new Boat("AA4", 5));
        waitingList.add(new Boat("AA5", 0));
        waitingList.add(new Boat("AA6", 12));


        BoatStorage boatStorage = new BoatStorage();
        PortStorage portStorage = new PortStorage();
        Shipment shipment = new Shipment();
        boatStorage.setBoatList(waitingList);


        Pier pier1 = new Pier();
        Pier pier2 = new Pier();
        Pier pier3 = new Pier();

        pier1.pietIsOpen(portStorage,boatStorage,shipment);
        pier2.pietIsOpen(portStorage,boatStorage,shipment);
        pier3.pietIsOpen(portStorage,boatStorage,shipment);


        System.out.println(shipment.getShipmentLog().toString());



    }
}





