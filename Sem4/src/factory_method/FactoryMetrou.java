package factory_method;

public class FactoryMetrou implements Factory{
    @Override
    public ITransportVehicleN createObject(int noSeats) {
        return new Metrou(noSeats);
    }
}
