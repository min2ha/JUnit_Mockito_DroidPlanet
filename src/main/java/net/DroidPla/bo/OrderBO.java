package net.DroidPla.bo;

/**
 * Created by Mindaugas Vidmantas on 2016-06-24.
 * email: minvidm@gmail.com, minvidm@ktu.lt
 */

import net.DroidPla.bo.exception.BOException;
import net.DroidPla.dto.Order;

/**
 * Business Object
 * */
public interface OrderBO {

    boolean placeOrder(Order order) throws BOException;
    boolean cancelOrder(int id) throws BOException;
    boolean deleteOrder(int id) throws BOException;
}
