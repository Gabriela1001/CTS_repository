package ro.ase.simpleFactory.main;

import ro.ase.simpleFactory.Bus;
import ro.ase.simpleFactory.ITransportVehicle;
import ro.ase.simpleFactory.VehicleFactory;
import ro.ase.simpleFactory.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  ITransportVehicle bus = new Bus(20);//  wrong, ne creeam o fabrica

        //cream fabrica
        VehicleFactory factory = new VehicleFactory();
        //obiectele le cream prin fabrica

        //un principiu open close incalcat...more info about it

        //o alta facbrica pentru transportul privat. Cele 2 fabrici pot lucra independent, dar si cu tipul abstract general

        //cum rezolvam open close? fara enum, ca aici incalcam

        // e mai tricky cu mai multe atribute, ori o alta metoda unde sunt si alea ori prin setari
        try {
            ITransportVehicle bus = factory.createVehicle(VehicleType.BUS, 21);
            ITransportVehicle tram = factory.createVehicle(VehicleType.TRAM, 30);
            ITransportVehicle trolley = factory.createVehicle(VehicleType.TROLLEy, 40);
            ITransportVehicle subway = factory.createVehicle(VehicleType.SUBWAY, 100);

            List<ITransportVehicle> vehicles = new ArrayList<>();
            vehicles.add(bus);
            vehicles.add(tram);
            vehicles.add(trolley);
            vehicles.add(subway);

            vehicles.add(factory.createVehicle(VehicleType.BUS, 10));
            vehicles.add(factory.createVehicle(VehicleType.TRAM, 11));

            for (ITransportVehicle vehicle : vehicles) {
                vehicle.showInfo();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}