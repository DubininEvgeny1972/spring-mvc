package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(HttpServletRequest hsr, Model model) {
        String counter = hsr.getParameter("count");
        if(counter == null){
            counter = "0";
        }
        model.addAttribute("autos", carService.getCar(Integer.parseInt(counter)));
        return "cars";
    }
}
