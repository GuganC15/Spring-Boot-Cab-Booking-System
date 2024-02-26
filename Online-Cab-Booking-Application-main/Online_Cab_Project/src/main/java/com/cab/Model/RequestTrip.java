package com.cab.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestTrip {

	private Integer tripBookingId;
	private String pickupLocation;
	private String fromDateTime;
	private String dropLocation;
	private String toDateTime;
	private float distanceInKm;
	private String carType;
	private String CabStatus;
	private String BookingStatus;
	
	
	@JsonIgnore
	private Cab RequestCab;


	public Integer getTripBookingId() {
		return tripBookingId;
	}


	public void setTripBookingId(Integer tripBookingId) {
		this.tripBookingId = tripBookingId;
	}


	public String getPickupLocation() {
		return pickupLocation;
	}


	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}


	public String getFromDateTime() {
		return fromDateTime;
	}


	public void setFromDateTime(String fromDateTime) {
		this.fromDateTime = fromDateTime;
	}


	public String getDropLocation() {
		return dropLocation;
	}


	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}


	public String getToDateTime() {
		return toDateTime;
	}


	public void setToDateTime(String toDateTime) {
		this.toDateTime = toDateTime;
	}


	public float getDistanceInKm() {
		return distanceInKm;
	}


	public void setDistanceInKm(float distanceInKm) {
		this.distanceInKm = distanceInKm;
	}


	public String getCarType() {
		return carType;
	}


	public void setCarType(String carType) {
		this.carType = carType;
	}


	public String getCabStatus() {
		return CabStatus;
	}


	public void setCabStatus(String cabStatus) {
		CabStatus = cabStatus;
	}


	public String getBookingStatus() {
		return BookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		BookingStatus = bookingStatus;
	}


	public Cab getRequestCab() {
		return RequestCab;
	}


	public void setRequestCab(Cab requestCab) {
		RequestCab = requestCab;
	}
	
	

	
}
