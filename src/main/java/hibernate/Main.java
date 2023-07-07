package hibernate;

import hibernate.pojo.Log;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = null;
        try {

            session = ConfigHibernate.getFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Log log = new Log();
            log.setContent("Welcome");
            session.save(log);

            transaction.commit();

        } catch (Exception e) {

            System.out.println("Đã có lỗi xảy ra");
            System.out.println(e.getMessage());

        } finally {

            if (session != null) session.close();

        }

    }
}