package ro.ase.simpleFactory;

public class VehicleFactory {
    //fabrica mea pt transport public
    public ITransportVehicle createVehicle(VehicleType type, int noSeats) throws Exception {
        switch (type) {
            case BUS:
                return new Bus(noSeats);
            case TRAM:
                return new Tram(noSeats);
            case TROLLEy:
                return new Trolley(noSeats);
            case SUBWAY:
                return new Subway(noSeats);
            default:
                throw new Exception("No such type found!");
        }
    }
}
