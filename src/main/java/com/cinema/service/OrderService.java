package com.cinema.service;

import java.util.List;
import com.cinema.model.Order;
import com.cinema.model.ShoppingCart;
import com.cinema.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
