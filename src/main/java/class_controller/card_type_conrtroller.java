package class_controller;

import dbconnect.connectdb_banking;
import java.sql.ResultSet;
import java.time.LocalDateTime;

public class card_type_conrtroller {

    connectdb_banking cntrl = new connectdb_banking("root", "");
    String sql;

    public ResultSet set_cardtype() {
        try {
            sql = "select card_type_id,card_type_name,created_date from tb_card_type";
        } catch (Exception e) {

        }
        return cntrl.get_result(sql);
    }

    public boolean insert_cardtype(String id, String name, LocalDateTime create) {
        boolean bl = false;
        try {
            sql = "insert into tb_card_type values ('" + id.toUpperCase().trim() + "','" + name + "','" + create + "')";
            bl = cntrl.get_excute(sql);
//            System.out.println(id);
//            System.out.println(name);
//            System.out.println(create);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bl;
        
    }

    public boolean update_cardtype(String name, String id) {
        boolean bl = false;
        try {
            sql = "update tb_card_type set card_type_name='" + name + "' where card_type_id='" + id + "'";
            bl = cntrl.get_excute(sql);
        } catch (Exception e) {
        }
        return bl;
    }

    public boolean delete_cardtype(String id) {
        boolean bl = false;
        try {
            sql = "delete from tb_card_type where card_type_id ='" + id + "'";
            bl = cntrl.get_excute(sql);
        } catch (Exception e) {
        }
        return bl;
    }
}
