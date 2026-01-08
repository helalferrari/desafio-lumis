package interfaces;

import logic.Carro;
import java.util.List;

public interface CarOperation {
    List<Carro> filterByColor(List<Carro> cars, String color);
}
