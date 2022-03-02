package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.RouteService;

import java.util.ArrayList;
@Controller
public class RouteController {

    @Autowired
    private RouteService routeService ;

}
