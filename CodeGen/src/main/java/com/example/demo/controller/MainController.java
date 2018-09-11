package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.example.generated.api.ParkingApi;
import com.example.generated.model.Parking;
import com.example.generated.model.Parkings;
import com.example.generated.model.Vehicle;
import com.example.generated.model.Vehicles;

@Controller
public class MainController implements ParkingApi {

	@Override
	public ResponseEntity<Parkings> parkingGet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> parkingParkingIdDelete(String parkingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Parking> parkingParkingIdGet(String parkingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Parking> parkingParkingIdPut(String parkingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Vehicles> parkingParkingIdVehiclesGet(String parkingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> parkingParkingIdVehiclesPost(String parkingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> parkingParkingIdVehiclesVehicleIdDelete(String parkingId, String vehicleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Vehicle> parkingParkingIdVehiclesVehicleIdGet(String parkingId, String vehicleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Vehicle> parkingParkingIdVehiclesVehicleIdPut(String parkingId, String vehicleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> parkingPost(Parking parking) {
		// TODO Auto-generated method stub
		return null;
	}

}
