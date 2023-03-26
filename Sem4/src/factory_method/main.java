package factory_method;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Factory fAutobuze = new FactoryAutobuz();

        Factory fTroleibuze = new FactoryTroleibuz();

        List<ITransportVehicleN> mijlTrans = new ArrayList<>();
        mijlTrans.add(fAutobuze.createObject(10));
        mijlTrans.add(fTroleibuze.createObject(110));
        mijlTrans.add(fAutobuze.createObject(10));
        mijlTrans.add(fTroleibuze.createObject(110));
        mijlTrans.add(fAutobuze.createObject(101));
        mijlTrans.add(fTroleibuze.createObject(101));
        mijlTrans.add(fAutobuze.createObject(101));
        mijlTrans.add(fTroleibuze.createObject(110));
        for(ITransportVehicleN v: mijlTrans){
            v.showInfo();
            v.movingType();
        }
    }


}
