package class_controller;

import dbconnect.connectdb_banking;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class customer_controller {

    connectdb_banking cn = new connectdb_banking("root", "");
    String sql = "";

    public ResultSet get_customer() {
        sql = "Select *from v_customer order by customer_id DESC";
        return cn.get_result(sql);
    }

    public ResultSet get_province() {
        sql = "Select *from tb_province";
        return cn.get_result(sql);
    }

    public ResultSet check_distric(String id) {
        sql = "select *from tb_district where province_id ='" + id + "'";
        return cn.get_result(sql);
    }

    public boolean insert_customer(String id, String name, String gender, String datebirth, String village, String district, String pic,  LocalDateTime create) {
        boolean bl;
        sql = "insert into tb_customer values ()";
        bl = cn.get_excute(sql);
        return bl = false;
    }

    public boolean update_customer(String name, String gender, String datebirth, String village, String district, String pic, LocalDateTime create, String id) {
        boolean bl;
        sql = "update tb_customer set full_name";
        bl = cn.get_excute(sql);
        return bl = false;
    }

    public boolean delete_customer(String id) {
        boolean bl;
        sql = "delete from tb_customer where customer_id ='" + id + "'";
        bl = cn.get_excute(sql);
        return bl = false;
    }

}
