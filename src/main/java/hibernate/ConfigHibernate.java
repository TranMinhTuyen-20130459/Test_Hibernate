package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;


public class ConfigHibernate {

    private static final SessionFactory FACTORY;

    // khối static được gọi duy nhất một lần duy nhất khi class này được nạp lên
    static {
        Configuration conf = new Configuration(); // được sử dụng để cấu hình các thông số cho hibernate
        Properties props = new Properties(); // dùng để lưu trữ các cặp key-value

        /*  Environment là một lớp của Hibernate, được sử dụng để định nghĩa các thuộc tính cho Hibernate */
        props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        props.put(Environment.URL, "jdbc:mysql://localhost:3306/web_ban_giay");
        props.put(Environment.USER, "root");
        props.put(Environment.PASS, "");
        props.put(Environment.SHOW_SQL, "true");
        conf.setProperties(props);

        /* ServiceRegistry là một interface của Hibernate, được sử dụng để quản lý các service. */
        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();

        FACTORY = conf.buildSessionFactory(registry);
    }

    public static SessionFactory getFactory() {
        return FACTORY;
    }

}
