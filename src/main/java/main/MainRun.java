package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import repository.DriverDao;
import repository.RouteDao;
import service.DriverService;

@Component
public class MainRun {
static DriverDao driverDao=new DriverDao();

  public static void main(String[] args) {
    System.out.println(driverDao.findById(10060).toString());
  }

}
