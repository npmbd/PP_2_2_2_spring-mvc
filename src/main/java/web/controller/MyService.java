package web.controller;

import java.util.ArrayList;
import java.util.List;

public class MyService {

    public static List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<Car>();

        if (count <= 0) {
            return cars;
        }

        cars.add(new Car("brand 1", "model 1", 2021));
        cars.add(new Car("brand 2", "model 2", 2022));
        cars.add(new Car("brand 3", "model 3", 2023));
        cars.add(new Car("brand 4", "model 4", 2024));
        cars.add(new Car("brand 5", "model 5", 2025));

        switch (count) {
            case 1:
                return cars.subList(0, 1);
            case 2:
                return cars.subList(0, 2);
            case 3:
                return cars.subList(0, 3);
            case 4:
                return cars.subList(0, 4);
            case 5:
                return cars.subList(0, 5);
            default:
                return cars;
        }
    }
}
