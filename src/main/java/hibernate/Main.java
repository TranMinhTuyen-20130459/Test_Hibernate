package hibernate;

import hibernate.config.ConfigHibernate;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = null;
        try {

            session = ConfigHibernate.getFactory().openSession();
            System.out.println("Kết nối đến database thành công");

        } catch (Exception e) {

            System.out.println("Đã có lỗi xảy ra");
            System.out.println(e.getMessage());

        } finally {

            if (session != null) session.close();

        }

    }
}