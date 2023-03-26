package factory_method;

public class Tramvai extends  ITransportVehicleN{


    public Tramvai(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("Autobuzul are  locuri: ");
    }

    @Override
    public void movingType() {
        System.out.println("Tramvai pe sine");

    }
}
