package pl.stp94.truckforwarder.models.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.SessionScope;
import pl.stp94.truckforwarder.interfaces.ITruck;
import pl.stp94.truckforwarder.models.trucks.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

@SessionScope

public class TrucksMarket {
    private List<ITruck> truckMarketList = new ArrayList<>();


    @Autowired
    public TrucksMarket(TiltTruck tiltTruck, StandardTruck standardTruck, SetTruck setTruck, TankTruck tankTruck, TipperTruck tipperTruck){

        truckMarketList.add(tiltTruck);
        truckMarketList.add(standardTruck);
        truckMarketList.add(setTruck);
        truckMarketList.add(tankTruck);
        truckMarketList.add(tipperTruck);



    }

    public List<ITruck> GenerateMarket(){

        return truckMarketList;


    }


        public ITruck getTiltTruck(){
            return truckMarketList.get(0);
        }
        public ITruck getStandardTruck(){
            return truckMarketList.get(1);
        }
        public ITruck getSetTruck(){
            return truckMarketList.get(2);
        }
        public ITruck getTankTruck(){
            return truckMarketList.get(3);
        }
        public ITruck getTipperTruck(){
            return truckMarketList.get(4);
        }







}
