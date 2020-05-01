package pl.stp94.truckforwarder.api.trucks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.stp94.truckforwarder.interfaces.ITruck;
import pl.stp94.truckforwarder.models.market.TrucksMarket;

import java.util.List;

@RestController
@RequestMapping("/api/trucks/TrucksMarketApi")
public class TrucksMarketApi {

    private TrucksMarket trucksMarket;
    private ITruck ConcreteTruck;

        @Autowired
        public TrucksMarketApi(TrucksMarket trucksMarket){
            this.trucksMarket=trucksMarket;

        }

        public ITruck getByTypeMethod(String truckType)
        {
            if (truckType.contentEquals("tiltTruck")){
            ConcreteTruck = trucksMarket.getTiltTruck();}
            else if (truckType.contentEquals("standardTruck")){
            ConcreteTruck = trucksMarket.getStandardTruck();}
            else if (truckType.contentEquals("setTruck")){
            ConcreteTruck =  trucksMarket.getSetTruck();}
            else if (truckType.contentEquals("tankTruck")){
            ConcreteTruck = trucksMarket.getTankTruck();}
            else if (truckType.contentEquals("tipperTruck")){
            ConcreteTruck = trucksMarket.getTipperTruck();}

            return ConcreteTruck;
        }




    @GetMapping("/all")
    @ResponseBody
    public List<ITruck> getAll() {
        return trucksMarket.GenerateMarket();
    }

    @GetMapping
    @PostMapping("/add")

    public ITruck getByType(@RequestParam String truckType){


        System.out.println(getByTypeMethod(truckType));
        return  getByTypeMethod(truckType);
    }







}
