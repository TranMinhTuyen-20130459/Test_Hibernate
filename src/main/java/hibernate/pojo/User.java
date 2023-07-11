package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String full_name;
    private String email;
    private String path_img_avatar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPath_img_avatar() {
        return path_img_avatar;
    }

    public void setPath_img_avatar(String path_img_avatar) {
        this.path_img_avatar = path_img_avatar;
    }
}
