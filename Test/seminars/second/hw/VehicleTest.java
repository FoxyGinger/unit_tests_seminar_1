package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    /**
     * 1. "Экземпляр объекта Car также является экземпляром транспортного средства
     * (используя оператор instanceof)
     * <br><b>Ожидаемый результат:</b>
     * Car является экземпляром Vehicle
     */
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Лада", "2106", 1990);
        assertTrue(car instanceof Vehicle);
    }

    /**
     * 2. "Объект Car создается с 4-мя колесами
     * <br><b>Ожидаемый результат:</b>
     * у Car 4 колеса
     */
    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Москвич", "412", 1975);
        assertEquals(car.getNumWheels(), 4);
    }

    /**
     * 2. "Объект Motorcycle создается с 2-мя колесами
     * <br><b>Ожидаемый результат:</b>
     * у Motorcycle 2 колеса
     */
    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Урал", "Волк", 2000);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    /**
     * 2. "Объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     * <br><b>Ожидаемый результат:</b>
     * Скорость равна 60
     */
    @Test
    public void testCarSpeed() {
        Car car = new Car("Лада", "2106", 1990);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    /**
     * 2. "Объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     * <br><b>Ожидаемый результат:</b>
     * Скорость равна 75
     */
    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Урал", "Волк", 2000);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    /**
     * 2. "В режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * машина останавливается (speed = 0).
     * <br><b>Ожидаемый результат:</b>
     * Скорость равна 0
     */
    @Test
    public void testCarPark() {
        Car car = new Car("Лада", "2106", 1990);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    /**
     * 2. "В режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * мотоцикл останавливается (speed = 0).
     * <br><b>Ожидаемый результат:</b>
     * Скорость равна 0
     */
    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Урал", "Волк", 2000);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}