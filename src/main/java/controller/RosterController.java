package controller;

import entity.Driver;
import entity.Roster;
import entity.Route;
import main.MainRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.DriverService;
import service.RosterService;
import service.RouteService;
import util.validate.ValidateRoster;

import java.util.*;
@Controller
public class RosterController {
    @Autowired
    private RosterService rosterService ;
    @Autowired
    private DriverService driverService ;

}

