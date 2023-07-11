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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public StatusAdmin getStatus_admin() {
        return status_admin;
    }

    public void setStatus_admin(StatusAdmin status_admin) {
        this.status_admin = status_admin;
    }
}
