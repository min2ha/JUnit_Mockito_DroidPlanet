package net.DroidPla.bo;

import net.DroidPla.bo.exception.BOException;
import net.DroidPla.dao.OrderDAO;
import net.DroidPla.dto.Order;

import java.sql.SQLException;

/**
 * Created by Mindaugas Vidmantas on 2016-06-24.
 * email: minvidm@gmail.com, minvidm@ktu.lt
 */
public class OrderBOImpl implements OrderBO {

    private OrderDAO dao;

    public boolean placeOrder(Order order) throws BOException {
        try {
            int result = dao.create(order);

            if (result == 0)
                return false;

        } catch (SQLException e) {
            throw new BOException(e);
        }
        return false;
    }

    public boolean cancelOrder(int id) throws BOException {

        Order order = null;
        try {
            order = dao.read(id);
            order.setStatus("cancelled");
            int result = dao.update(order);
            if (result==0)
                return false;
        } catch (SQLException e) {
            throw new BOException(e);
        }

        return true;
    }

    public boolean deleteOrder(int id) throws BOException {
        try {
            int result = dao.delete(id);
            if (result==0)
                return false;
        } catch (SQLException e) {
            throw new BOException(e);
        }
        return true;
    }

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }
}
