package com.company.intersegrega.service;

import java.util.HashMap;
import java.util.List;

import com.company.intersegrega.entity.Entity;
import com.company.intersegrega.entity.Order;


public class OrderPersistanceService implements PersistenceService<Order>{
	
	private static final HashMap<Long, Order> ORDERS = new HashMap<>();

	@Override
	public void save(Order entity) {
		synchronized (entity) {
			ORDERS.put(entity.getId(), entity);
		}
		
	}

	@Override
	public void delete(Order entity) {
		synchronized (entity) {
			ORDERS.remove(entity.getId());
		}
	}

	@Override
	public Order findById(Long id) {
		return ORDERS.get(id);
	}

}
