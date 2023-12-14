package org.felipecpdev.domain;

public class CarBuilder implements Builder {
    private Integer seats;
    private CarType carType;
    private Integer bigWheels;
    private Engine engine;
    private Boolean leatherSeats;
    private Integer batteries;
    private Boolean convertible;
    private Boolean electricCar;


    public CarBuilder setSeats(Integer seats) {
        this.seats = seats;
        return this;
    }


    public CarBuilder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }


    public CarBuilder setBigWheels(Integer bigWheels) {
        this.bigWheels = bigWheels;
        return this;
    }


    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }


    public CarBuilder setLeatherSeats(Boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
        return this;
    }


    public CarBuilder setBatteries(Integer batteries) {
        this.batteries = batteries;
        return this;
    }


    public CarBuilder setConvertible(Boolean convertible) {
        this.convertible = convertible;
        return this;
    }


    public CarBuilder setElectricCar(Boolean electricCar) {
        this.electricCar = electricCar;
        return this;
    }

    //usar este builder si deseo que el objeto tenga data por defecto
    public CarBuilder createSportCar() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORT);
        Engine engine = new Engine(5400);
        builder.setSeats(2);
        builder.setElectricCar(Boolean.TRUE);
        builder.setBatteries(2);
        builder.setConvertible(Boolean.TRUE);
        builder.setEngine(engine);
        return builder;
    }

    public CarBuilder createLuxuryCar() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.LUXURY);
        Engine engine = new Engine(2700);
        builder.setSeats(4);
        builder.setElectricCar(Boolean.TRUE);
        builder.setBatteries(2);
        builder.setConvertible(Boolean.TRUE);
        builder.setLeatherSeats(Boolean.TRUE);
        builder.setEngine(engine);
        return builder;
    }

    @Override
    public Car build() {
        return new Car(carType, seats, bigWheels,
                engine, leatherSeats, batteries, convertible,
                electricCar);
    }


    @Override
    public String toString() {
        return "CarBuilder{" +
                "seats=" + seats +
                ", carType=" + carType +
                ", bigWheels=" + bigWheels +
                ", engine=" + engine +
                ", leatherSeats=" + leatherSeats +
                ", batteries=" + batteries +
                ", convertible=" + convertible +
                ", electricCar=" + electricCar +
                '}';
    }
}
