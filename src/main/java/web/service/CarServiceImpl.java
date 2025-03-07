package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<Car>();

    public CarServiceImpl() {
        cars.add(new Car("brand 1", "model 1", 2021));
        cars.add(new Car("brand 2", "model 2", 2022));
        cars.add(new Car("brand 3", "model 3", 2023));
        cars.add(new Car("brand 4", "model 4", 2024));
        cars.add(new Car("brand 5", "model 5", 2025));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0) {
            return cars.subList(0, 0);
        } else if (cars.size() < count) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
