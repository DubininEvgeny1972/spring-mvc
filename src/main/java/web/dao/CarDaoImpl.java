package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes", 5, "super"));
        carList.add(new Car("Hyundai", 3, "base"));
        carList.add(new Car("Renault", 6, "drive"));
        carList.add(new Car("Lada", 7, "base"));
        carList.add(new Car("Volkswagen", 3, "style"));
    }

    public List<Car> getCars(int count) {
        List<Car> tmp = new ArrayList<>();
        if (count == 0) {
            return carList;
        }
        for (int i = 0; i < carList.size(); i++){
            tmp.add(carList.get(i));
        }
        return tmp;
    }




    @Override
    public List<Car> getCar(int count) {
        return null;
    }
}
