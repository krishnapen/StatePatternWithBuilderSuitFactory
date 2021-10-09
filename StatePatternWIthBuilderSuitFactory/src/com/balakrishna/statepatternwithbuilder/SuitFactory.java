package com.balakrishna.statepatternwithbuilder;

public class SuitFactory {
	
	private int size;
    private String color;
    private String deliveryAddress;
	
	StateInterface selectSuitSize;
	StateInterface selectSuitColor;
	StateInterface selectSuitDeliveryAddress;
	StateInterface placeSuitOrder;
	StateInterface trackSuitdelivery;
	
	StateInterface stateInterface;
	
	public SuitFactory() {
		selectSuitSize = new SelectSuitSizeState(this);
		selectSuitColor = new SelectSuitColorState(this);
		selectSuitDeliveryAddress = new SelectSuitDeliveryAddressState(this);
		placeSuitOrder = new PlaceSuitOrderState(this);
		trackSuitdelivery = new TrackSuitDeliveryState(this);
	}
	
	public void selectSuitSize(int size) {
		this.size = size;
		stateInterface = selectSuitSize; 
		stateInterface.selectSuitSize(size);
		
	}

	public void selectSuitColor(String color) {
		this.color = color;
		
		stateInterface = selectSuitColor;
		if(this.size > 0) {
		stateInterface.selectSuitColor(color);
		}
	}

	public void selectSuitDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
		
		stateInterface = selectSuitDeliveryAddress;
		
		if(this.size > 0 && this.color != null) {
		stateInterface.selectSuitDeliveryAddress(deliveryAddress);
		}
	}

	public void placeSuitOrder() {
		stateInterface = placeSuitOrder;
		if(this.size > 0 && this.color != null && this.deliveryAddress != null) {
		stateInterface.placeSuitOrder();
		}
	}

	public void trackSuitdelivery() {
		stateInterface = trackSuitdelivery;
		if(this.size > 0 && this.color != null && this.deliveryAddress != null) {
		stateInterface.trackSuitdelivery(this.size, this.color, this.deliveryAddress);
		}
		
	}

	public StateInterface getStateInterface() {
		return stateInterface;
	}

	public void setStateInterface(StateInterface stateInterface) {
		this.stateInterface = stateInterface;
	}

	public StateInterface getSelectSuitSize() {
		return selectSuitSize;
	}

	public StateInterface getSelectSuitColor() {
		return selectSuitColor;
	}

	public StateInterface getSelectSuitDeliveryAddress() {
		return selectSuitDeliveryAddress;
	}

	public StateInterface getPlaceSuitOrder() {
		return placeSuitOrder;
	}

	public StateInterface getTrackSuitdelivery() {
		return trackSuitdelivery;
	}
	
	
	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	public String toString() {
		return "Suit Factory:";
	}

	

}
