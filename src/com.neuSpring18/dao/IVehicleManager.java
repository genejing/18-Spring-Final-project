package com.neuSpring18.dao;

import com.neuSpring18.dto.Dealer;
import com.neuSpring18.dto.Filter;
import com.neuSpring18.dto.Vehicle;

import java.util.Collection;

public interface IVehicleManager {
    Collection<Vehicle> getVehicleFromDealer(Filter filter); // We do not do any sort or paging in this layer, just simply return all valid results.
    Collection<Vehicle> getVehicleFromDealer();
    String addVehicle(Vehicle v);
    boolean editVehicle(Vehicle v);
    boolean deleteVehicle(String vehicleID);
}
