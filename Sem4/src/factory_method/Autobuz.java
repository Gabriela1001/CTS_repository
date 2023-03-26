package factory_method;

public class Autobuz  extends ITransportVehicleN{
    public Autobuz(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("Autobuzul are 6 locuri");
    }

    @Override
    public void movingType() {
        System.out.println("Autobuzul pe roti");

    }
}
