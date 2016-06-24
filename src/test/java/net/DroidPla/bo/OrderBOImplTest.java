package net.DroidPla.bo;

import net.DroidPla.dao.OrderDAO;
import net.DroidPla.dto.Order;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

import static org.mockito.Mockito.when;

/**
 * Created by Mindaugas Vidmantas on 2016-06-24.
 * email: minvidm@gmail.com, minvidm@ktu.lt
 */
public class OrderBOImplTest {

    @Mock
    OrderDAO dao;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void placeOrder_Should_Create_An_Order() throws SQLException{

        OrderBOImpl bo = new OrderBOImpl();
        bo.setDao(dao);


        Order order = new Order();
        when(dao.create(order)).thenReturn(new Integer((1)));
    }
}
