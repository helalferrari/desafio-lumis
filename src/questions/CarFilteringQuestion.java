package questions;

import interfaces.CarOperation;
import logic.Carro;
import logic.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarFilteringQuestion {
    public void run(Scanner scanner) {
        System.out.println("\n");
        System.out.println("=== Car Filtering (Black Cars) ===");
        
        List<Carro> allCars = new ArrayList<>();
        allCars.add(new Carro("Fusca", "Preto"));
        allCars.add(new Carro("Civic", "Prata"));
        allCars.add(new Carro("Corolla", "Preto"));
        allCars.add(new Carro("Gol", "Branco"));
        allCars.add(new Carro("Ferrari", "Vermelho"));
        
        System.out.println("All cars in the list:");
        allCars.forEach(car -> System.out.println(" - " + car));
        
        CarOperation carService = new CarService();
        List<Carro> blackCars = carService.filterByColor(allCars, "Preto");
        
        System.out.println("\nFiltered black cars:");
        if (blackCars.isEmpty()) {
            System.out.println("No black cars found.");
        } else {
            blackCars.forEach(car -> System.out.println(" - " + car));
        }
        System.out.println("\n");
    }
}