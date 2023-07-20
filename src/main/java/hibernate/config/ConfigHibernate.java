package hibernate.config;

import hibernate.pojo.*;
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
        props.put(Environment.HBM2DDL_AUTO, "create"); // tự động tạo table nếu chưa tồn tại
        props.put(Environment.HBM2DDL_AUTO, "update"); // tự động cập nhật table khi có sự thay đổi
        conf.setProperties(props);

        conf.addAnnotatedClass(LevelLog.class);
        conf.addAnnotatedClass(Log.class);
        conf.addAnnotatedClass(StatusProduct.class);
        conf.addAnnotatedClass(StatusOrder.class);
        conf.addAnnotatedClass(PriceRange.class);

        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Size.class);
        conf.addAnnotatedClass(Brand.class);
        conf.addAnnotatedClass(HistoryPriceProduct.class);

        conf.addAnnotatedClass(ImageProduct.class);
        conf.addAnnotatedClass(SizeProduct.class);

        conf.addAnnotatedClass(Order.class);
        conf.addAnnotatedClass(OrderDetail.class);

        conf.addAnnotatedClass(StatusAdmin.class);
        conf.addAnnotatedClass(Role.class);
        conf.addAnnotatedClass(Admin.class);

        conf.addAnnotatedClass(TypeProduct.class);

        /* ServiceRegistry là một interface của Hibernate, được sử dụng để quản lý các service. */
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

        FACTORY = conf.buildSessionFactory(registry);
    }

    public static SessionFactory getFactory() {
        return FACTORY;
    }

}
