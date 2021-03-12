package com.company.model.database; //interface to show the connection between Intellij and sql

import java.sql.Connection; //import "must have" things
import java.sql.SQLException;

public interface IDB {

    Connection getConnection() throws SQLException, ClassNotFoundException; //connection
}
