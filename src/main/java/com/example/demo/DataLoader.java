package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    @Autowired
    CarRepository repository;

    @Override
    public void run (String...strings) throws Exception{

        Car car = new Car(1995, "Chevy", "Cruiser");
        repository.save(car);

        car= new Car(2005, "Nissan", "Ultima");
        repository.save(car);

        car= new Car(2039, "Tesla", "Auto-Truck");
        repository.save(car);
    }
}
