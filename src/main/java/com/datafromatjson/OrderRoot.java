package com.datafromatjson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderRoot {
	@JsonProperty(required = true)
    protected Order order;

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
