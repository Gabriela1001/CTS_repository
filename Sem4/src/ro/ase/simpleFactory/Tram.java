package ro.ase.simpleFactory;

public class Tram implements ITransportVehicle {

    public int noSeats;

    public Tram(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {

        System.out.println("Total number of seats in Tram" + this.noSeats);
    }

    @Override
    public void movingType() {
        System.out.println("Moving rails");
    }
}
