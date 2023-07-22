package hibernate.data;

import hibernate.config.ConfigHibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<Long> getListIdProduct() {
        List<Long> listId = new ArrayList<>();
        String string_query = "SELECT id_product FROM Product";
        Session session = ConfigHibernate.getFactory().openSession();
        try {

            Query query = session.createQuery(string_query);
            listId = query.getResultList();

        } catch (Exception e) {
            listId = new ArrayList<>();
            System.out.println(e.getMessage());
        } finally {
            if (session != null) session.close();
        }
        return listId;
    }

    public static List<String> getListSize() {
        List<String> listSize = new ArrayList<>();
        String query_string = "SELECT name_size FROM Size";
        Session session = ConfigHibernate.getFactory().openSession();
        try {
            Query query = session.createQuery(query_string);
            listSize = query.getResultList();
        } catch (Exception e) {
            listSize = new ArrayList<>();
            System.out.println(e.getMessage());
        } finally {
            if (session != null) session.close();
        }
        return listSize;
    }

    public static void main(String[] args) {

        System.out.println(DataUtil.getListIdProduct());
        System.out.println(DataUtil.getListSize());
    }

}
