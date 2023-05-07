package com.cinema.dao;

import java.util.List;
import com.cinema.model.Order;
import com.cinema.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
