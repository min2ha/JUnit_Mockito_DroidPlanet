package net.DroidPla.bo.exception;

import java.sql.SQLException;

/**
 * Created by Mindaugas Vidmantas on 2016-06-24.
 * email: minvidm@gmail.com, minvidm@ktu.lt
 */
public class BOException extends Exception {

    public BOException(SQLException e) {
        super(e);
    }
}
