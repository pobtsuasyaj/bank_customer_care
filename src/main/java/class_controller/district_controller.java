package class_controller;

import dbconnect.connectdb_banking;
import java.sql.ResultSet;
import java.sql.SQLException;

public class district_controller {

    connectdb_banking cn = new connectdb_banking("root", "");
    String sql = "";

    public ResultSet get_province() {
        try {
            sql = "Select *from tb_province";

        } catch (Exception e) {
        }
        return cn.get_result(sql);
    }

    public ResultSet set_district() {
        try {
            sql = "Select district_id,district_name,province_name from v_district order by district_id desc";
        } catch (Exception e) {
        }
        return cn.get_result(sql);
    }

    public boolean insert_district(String id, String name, String province) {
        boolean bl = false;
        try {
            sql = "insert into tb_district values ('" + id.toUpperCase() + "','" + name + "','" + province + "')";
            bl = cn.get_excute(sql);
            if (bl) {

            } else {

            }
        } catch (Exception e) {
        }
        return bl;
    }

    public boolean update_district(String name, String province, String id) {
        boolean bl = false;
        try {
            sql = "update tb_district set district_name='" + name + "',province_id ='" + province + "' where district_id= " + id + "')";
            bl = cn.get_excute(sql);
            if (bl) {

            } else {

            }
        } catch (Exception e) {
        }

        return bl;
    }

    public boolean delete_district(String id) {
        boolean bl = false;
        try {
            sql = "delete from tb_district where district_id ='" + id + "'";
            bl = cn.get_excute(sql);
            if (bl) {

            } else {

            }
        } catch (Exception e) {
        }
        return bl;
    }

}
