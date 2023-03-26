package factory_method;

public abstract class ITransportVehicleN {
    private int noSeats;

    public ITransportVehicleN(int noSeats) {
        this.noSeats = noSeats;
    }

    public abstract void showInfo();

    public abstract void movingType();

    @Override
    public String toString() {
        return "ITransportVehicleN{" +
                "noSeats=" + noSeats +
                '}';
    }
}
