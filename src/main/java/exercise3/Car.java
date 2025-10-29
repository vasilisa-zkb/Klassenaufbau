package exercise3;

public class Car {
    private String licensePlate;
    private double fuelLevel;
    private double mileage;
    private double fuelConsumption;
    private int fuelCapacity;

    public Car(String licensePlate, double fuelLevel, int mileage, double fuelConsumption, int fuelCapacity) {
        this.licensePlate = licensePlate;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;

        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;
    }


    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    public void drive(int distance) {
        //do stuff
        double maxdistance = fuelLevel / fuelConsumption;
        //maxdistance = maxdistance;
        System.out.println("Max distance: " + maxdistance);

        if (distance > maxdistance) {
            fuelLevel = 0;
            this.mileage = Math.round((this.mileage + maxdistance) * 100.0) / 100.0;
        }
        else {
            this.fuelLevel -= (distance * this.fuelConsumption);
            this.mileage = Math.round((this.mileage + distance) * 100.0) / 100.0;
        }

        System.out.println(fuelLevel);
        System.out.println(mileage);
    }

    public void refuel(int amount) {
        //do stuff

        double newfuelLevel = fuelLevel + amount;

        if (newfuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity;
        } else {
            fuelLevel = newfuelLevel;
        }
    }
    //add toString
    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", mileage=" + mileage +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
