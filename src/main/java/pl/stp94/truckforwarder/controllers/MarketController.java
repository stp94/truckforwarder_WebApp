package pl.stp94.truckforwarder.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class MarketController {

    @ResponseBody
    @RequestMapping(value = "api/user/boughtTruck", method = RequestMethod.POST)

    //test


    public String getBoughtTruckFromJScript(String boughtTruck)
    {

        System.out.println(boughtTruck);
        return "boughTruck";
    }




}
