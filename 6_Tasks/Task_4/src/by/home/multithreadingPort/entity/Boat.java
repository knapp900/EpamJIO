package by.home.multithreadingPort.entity;

import java.util.Objects;

public class Boat {
    private String name;
    private int cargo;

    public Boat(String name, int cargo) {
        this.name = name;
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boat boat = (Boat) o;
        return cargo == boat.cargo && Objects.equals(name, boat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cargo);
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                ", груз = " + cargo +
                " ";
    }
}