package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Sizes")
public class Size implements Serializable {

    @Id
    private String name_size;

    public String getName_size() {
        return name_size;
    }

    public void setName_size(String name_size) {
        this.name_size = name_size;
    }
}
