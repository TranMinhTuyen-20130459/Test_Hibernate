package hibernate.pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Status_Products")
@AttributeOverride(
        name = "id_status",
        column = @Column(name = "id_status_product")
)
public class StatusProduct extends Status{


}
