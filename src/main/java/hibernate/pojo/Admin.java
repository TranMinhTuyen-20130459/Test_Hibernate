package hibernate.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Admins")
public class Admin extends User {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status_admin")
    private StatusAdmin status_admin;

}
