package ro.ase.simpleFactory;

public class Trolley implements ITransportVehicle {
    private int noSeats;

    public Trolley(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void movingType() {
        System.out.println(" On someth9ing les");
    }
}
