package com.training.testdriveapp.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServicesImpl implements AdminServices {

    @Autowired
    private CarRepository carsRepository;
    @Override
    public Car addNewCar(Car newCars) throws AdminException{
        if(newCars == null)
        {
            throw new AdminException("Car details cannot be null");
        }
        return this.carsRepository.save(newCars);
    }

    @Override
    public List<Car> getCarDetailsByModelName(String modelName) throws AdminException {
        return this.carsRepository.findBymodelName(modelName);
    }

    @Override
    public Car updateCarDetails(Car updateCar) throws AdminException {
        return this.carsRepository.save(updateCar);
    }

}
