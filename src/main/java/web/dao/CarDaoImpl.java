package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao{
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes", 5, "super"));
        carList.add(new Car("Hyundai", 3, "base"));
        carList.add(new Car("Renault", 6, "drive"));
        carList.add(new Car("Lada", 7, "base"));
        carList.add(new Car("Volkswagen", 3, "style"));
    }

    @Override
    public List<Car> getCar(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
