package hibernate.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Status_Admins")
@AttributeOverride(
        name = "id_status",
        column = @Column(name = "id_status_admin")
)
public class StatusAdmin extends Status {

}
