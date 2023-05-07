package com.cinema.dao.impl;

import java.util.List;
import com.cinema.dao.AbstractDao;
import com.cinema.dao.OrderDao;
import com.cinema.exception.DataProcessingException;
import com.cinema.model.Order;
import com.cinema.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl extends AbstractDao<Order> implements OrderDao {
    public OrderDaoImpl(SessionFactory factory) {
        super(factory, Order.class);
    }

    @Override
    public List<Order> getOrdersHistory(User user) {
        try (Session session = factory.openSession()) {
            Query<Order> getByUser = session.createQuery(
                    "SELECT DISTINCT o FROM Order o "
                            + "join fetch o.tickets t "
                            + "join fetch t.movieSession ms "
                            + "join fetch ms.cinemaHall "
                            + "join fetch ms.movie "
                            + "WHERE o.user = :user", Order.class);
            getByUser.setParameter("user", user);
            return getByUser.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Not found shopping cart for user " + user, e);
        }
    }
}
