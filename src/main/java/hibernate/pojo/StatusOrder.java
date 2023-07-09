package hibernate.pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Status_Orders")
@AttributeOverride(
        name = "id_status",
        column = @Column(name = "id_status_order")
)
public class StatusOrder extends Status{


}
