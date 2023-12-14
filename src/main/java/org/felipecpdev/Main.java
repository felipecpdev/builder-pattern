package org.felipecpdev;


import org.felipecpdev.domain.Car;
import org.felipecpdev.domain.CarBuilder;
import org.felipecpdev.domain.CarType;

//ejemplo de https://refactorizando.com/patron-builder-java/
// pero mejorado
//TIP usar @Builder de lombok en proyecto Spring para evitar escribir código repetitivo
public class Main {
    public static void main(String[] args) {

        Car car = new CarBuilder()
                .setCarType(CarType.LUXURY)
                .setSeats(4)
                .setConvertible(false)
                .setElectricCar(Boolean.FALSE)
                .build();
        System.out.println(car);
    }
}