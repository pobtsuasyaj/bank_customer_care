package dbconnect;

import java.sql.*;

public class connectdb_banking {

    Connection cn;
    Statement stm;
    String diver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/bank_customer_care";
    private String username = "root";
    private String password = "";

    public connectdb_banking(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void connection() {
        try {
            Class.forName(diver);
            cn = DriverManager.getConnection(url, username, password);
            stm = cn.createStatement();
        } catch (Exception e) {
        }
    }

    public Connection get_connect() {
        return cn;
    }

    public Statement get_statement() {
        return stm;
    }

    public ResultSet get_result(String sql) {
        ResultSet rs;
        connection();
        try {
            rs = stm.executeQuery(sql);
        } catch (Exception e) {
            rs = null;
        }
        return rs;
    }

    public boolean get_excute(String sql) {
        boolean bl;
        connection();
        try {
            stm.execute(sql);
            bl = true;
        } catch (Exception e) {
            bl = false;
//            e.printStackTrace();
        }
        return bl;
    }

    public void closeconnect() throws SQLException {
        cn.close();
        stm.close();
    }

}
