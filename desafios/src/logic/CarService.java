package logic;

import interfaces.CarOperation;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService implements CarOperation {
    @Override
    public List<Carro> filterByColor(List<Carro> cars, String color) {
        if (cars == null || color == null) {
            return new ArrayList<>();
        }
        
        return cars.stream()
                .filter(car -> color.equalsIgnoreCase(car.getCor()))
                .collect(Collectors.toList());
    }
}
