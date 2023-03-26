package factory_method;

public class FactoryTroleibuz implements Factory{
    @Override
    public ITransportVehicleN createObject(int noSeats) {
        return new Troleu(noSeats);
    }
}
