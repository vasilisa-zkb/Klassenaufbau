package exercise3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise3.Car;

class CarTest {
  private Car car;

  @BeforeEach
  public void setUp() {
      car = new Car("ZH420", 50, 62000, 0.077,60 );
    }

    @Test
    public void testRefuel() {
      car.refuel(10);
      assertEquals(60, car.getFuelLevel());
    }

    @Test
    public void testRefuelOverLimit() {
    car.refuel(30);
    assertEquals(60, car.getFuelLevel());
    }

    @Test
    public void testDrive() {
      car.drive(100);
      assertEquals(42.3, car.getFuelLevel());
      assertEquals(62100, car.getMileage());
    }

  @Test
  public void testDriveOverLimit() {
    car.drive(1000);
    assertEquals(0, car.getFuelLevel());
    assertEquals(62649.35, car.getMileage());
  }

  @Test
  public void testToString() {
    assertEquals("Car{" +
        "licensePlate='" + car.getLicensePlate() + '\'' +
        ", mileage=" + car.getMileage() +
        ", fuelConsumption=" + car.getFuelConsumption() +
        ", fuelCapacity=" + car.getFuelCapacity() +
        ", fuelLevel=" + car.getFuelLevel() +
        '}', car.toString());
  }

}