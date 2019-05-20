package class_controller;

import dbconnect.connectdb_banking;
import java.sql.ResultSet;
import java.time.LocalDateTime;

public class account_type_controller {

    connectdb_banking cn = new connectdb_banking("root", "");
    String sql = "";

    public ResultSet set_accounttype() {
        try {
            sql = "Select account_type_id,account_type_name,created_date from tb_account_type ";
        } catch (Exception e) {
        }
        return cn.get_result(sql);
    }

    public boolean insert_accounttype(String id, String name, LocalDateTime create) {
        boolean bl = false;
        try {
            sql = "insert into tb_account_type (account_type_id,account_type_name,created_date) values ('" + id.toUpperCase() + "','" + name + "','" + create + "')";
            bl = cn.get_excute(sql);
        } catch (Exception e) {
        }
        return bl;
    }

    public boolean update_accounttype(String name, LocalDateTime update, String id) {
        boolean bl = false;
        try {
            sql = "update tb_account_type set account_type_name= '" + name + "',updated_date='" + update + "'where account_type_id= '" + id + "'";
            bl = cn.get_excute(sql);
        } catch (Exception e) {
        }
        return bl;
    }

    public boolean delete_accounttype(String id) {
        boolean bl = false;
        try {
            sql = "delete from tb_account_type where account_type_id ='" + id + "'";
            bl = cn.get_excute(sql);
        } catch (Exception e) {
        }
        return bl;
    }
}
