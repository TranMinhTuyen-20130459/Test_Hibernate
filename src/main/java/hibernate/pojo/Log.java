package hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "Logs")
public class Log implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_log;
    private Long id_user;
    private String src;
    private String content;
    private String ip_address;
    private String web_browser;
    private Timestamp create_at;
    private String status;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "id_level")
    private LevelLog level_log;

    public Long getId_log() {
        return id_log;
    }

    public void setId_log(Long id_log) {
        this.id_log = id_log;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getWeb_browser() {
        return web_browser;
    }

    public void setWeb_browser(String web_browser) {
        this.web_browser = web_browser;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LevelLog getLevel_log() {
        return level_log;
    }

    public void setLevel_log(LevelLog level_log) {
        this.level_log = level_log;
    }
}
