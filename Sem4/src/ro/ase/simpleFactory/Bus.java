package ro.ase.simpleFactory;

public class Bus implements ITransportVehicle {
    private int noSeats;

    public Bus(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("Total number of seats" + this.noSeats);
    }

    @Override
    public void movingType() {
        System.out.println("Moving on roti ");
    }
}
