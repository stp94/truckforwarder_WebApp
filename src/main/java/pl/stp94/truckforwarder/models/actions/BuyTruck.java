package pl.stp94.truckforwarder.models.actions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pl.stp94.truckforwarder.interfaces.ITruck;
import pl.stp94.truckforwarder.models.market.TrucksMarket;

import java.util.List;

@SessionScope
@Component
public class BuyTruck {
    private ITruck boughtTruck;


    BuyTruck(TrucksMarket trucksMarket)
    {


    }
    @Autowired
    protected ITruck BuyTiltTruck(TrucksMarket trucksMarket)
    {
        boughtTruck = trucksMarket.getTiltTruck();
        return boughtTruck;
    }

}
