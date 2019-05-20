
package module_controller;

public class card_type_module {
    String id;
    String name;
    String date;
    
    public card_type_module(String id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
