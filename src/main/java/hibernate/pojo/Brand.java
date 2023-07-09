package hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brands")
public class Brand {

    @Id
    private int id_brand;
    private String name;

}
