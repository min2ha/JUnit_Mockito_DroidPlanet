package net.DroidPla.dao;

import net.DroidPla.dto.Order;

import java.sql.SQLException;

/**
 * Created by Mindaugas Vidmantas on 2016-06-24.
 * email: minvidm@gmail.com, minvidm@ktu.lt
 */
public interface OrderDAO {
    int create (Order order) throws SQLException;
    Order read(int id) throws  SQLException;
    int update (Order order) throws SQLException;
    int delete (int id) throws SQLException;
}
