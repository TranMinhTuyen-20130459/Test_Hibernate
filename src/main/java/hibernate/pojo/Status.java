package hibernate.pojo;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class Status implements Serializable {
    @Id
    private int id_status;
    private String name;

    public int getId_status() {
        return id_status;
    }

    public void setId_status(int id_status) {
        this.id_status = id_status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
