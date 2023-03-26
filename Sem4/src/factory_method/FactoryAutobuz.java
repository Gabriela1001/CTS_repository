package factory_method;

public class FactoryAutobuz implements Factory{
    @Override
    public ITransportVehicleN createObject(int noSeats) {
        return new Autobuz(noSeats);
    }
}
