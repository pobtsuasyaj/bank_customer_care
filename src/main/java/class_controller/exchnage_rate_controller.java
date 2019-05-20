package class_controller;

import dbconnect.connectdb_banking;
import java.sql.ResultSet;

public class exchnage_rate_controller {

    connectdb_banking cn = new connectdb_banking("root", "");
    String sql = "";

    public ResultSet set_exchangerate() {
        try {
            sql = "Select exchange_rate_id,currency_1,currency_2,sale_rate,buy_rate,created_date from tb_exchange_rate";
        } catch (Exception e) {
        }
        return cn.get_result(sql);
    }

    public boolean insert_exchangerate(String id, String c1, String c2, String sale_r, String buy_r, String created) {
        boolean bl;
        try {
            sql = "";
            bl = cn.get_excute(sql);
        } catch (Exception e) {
        }
        return bl = false;
    }

    public boolean update_exchangrate(String c1, String c2, String sale_r, String buy_r, String created) {
        boolean bl;
        try {
            sql = "";
            bl = cn.get_excute(sql);
        } catch (Exception e) {
        }
        return bl = false;
    }

    public boolean delete_exchangerate(String id) {
        boolean bl;
        try {
            sql = "delete from tb_exchange_rate where exchange_rate_id ='" + id + "'";
            bl = cn.get_excute(sql);
        } catch (Exception e) {
        }
        return bl = false;
    }
    

}
