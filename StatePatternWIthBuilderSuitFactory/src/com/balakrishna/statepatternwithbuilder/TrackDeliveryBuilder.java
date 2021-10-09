package com.balakrishna.statepatternwithbuilder;

public class TrackDeliveryBuilder {
	
	private int size;
	private String color;
	private String deliveryAddress;
	
	public TrackDeliveryBuilder(int size, String color, String deliveryAddress) {
		this.size = size;
		this.color = color;
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public String toString() {
		return "Delivery Address Changed to [deliveryAddress=" + deliveryAddress + "]";
	}
	
	

}
