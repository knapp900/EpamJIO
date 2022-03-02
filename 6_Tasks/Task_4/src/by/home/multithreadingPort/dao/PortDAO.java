package by.home.multithreadingPort.dao;

import java.util.List;

import by.home.multithreadingPort.entity.Cargo;

public interface PortDAO {

	List<String> addСargo(Cargo cargo);

	List<String> removeСargo(String name);

}
