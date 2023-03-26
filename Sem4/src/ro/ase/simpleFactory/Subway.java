package ro.ase.simpleFactory;

public class Subway implements ITransportVehicle {
    private int noSeats;

    @Override
    public void showInfo() {
        System.out.println("Total number of seats in Subway" + this.noSeats);

    }

    public Subway(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void movingType() {
        System.out.println("Moving underground");

    }
}
