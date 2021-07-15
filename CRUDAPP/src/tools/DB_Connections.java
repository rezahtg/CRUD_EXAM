/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author rezar
 */
public class DB_Connections {
    private Connection connection;

    public Connection getConnection() {
        try {
            OracleDataSource ods = new OracleDataSource();
            ods.setDriverType("thin");
            ods.setServerName("localhost");
            ods.setPortNumber(1521);
            ods.setUser("system");
            ods.setServiceName("XE");
            ods.setPassword("mcc53");
            this.connection = ods.getConnection();
            this.connection.createStatement().execute("alter session set current_schema=HR");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return connection;
        }
    }
}
