package com.cg.onlinebookstoremanagementsysapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.onlinebookstoremanagementsysapp.entity.*;
import com.cg.onlinebookstoremanagementsysapp.repository.*;
import com.cg.onlinebookstoremanagementsysapp.exception.*;




@Service
public class OrderService implements IOrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

//	@Override
//	public ResponseEntity<Order> updateOrder(Long orderId, Order orderDetails) throws ResourceNotFoundException {
//		 Order order = orderRepository.findById(orderId)
//			        .orElseThrow(() -> new ResourceNotFoundException("Order not found for this id :: " + orderId));
//
////			        
////			        order.setOrderStatus(orderDetails.getOrderStatus());
////			        order.setOrderDate(orderDetails.getOrderDate());
//			        
//			        final Order updatedOrder = orderRepository.save(order);
//			        return ResponseEntity.ok(updatedOrder);
//	}


	
}