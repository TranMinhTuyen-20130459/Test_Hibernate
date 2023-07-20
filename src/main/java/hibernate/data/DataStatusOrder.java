package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.StatusOrder;
import org.hibernate.Session;

public class DataStatusOrder {

    public static String[] arr_status_orders = {"CHỜ XÁC NHẬN", "ĐÃ XÁC NHẬN", "CHỜ LẤY HÀNG", "ĐANG GIAO HÀNG", "ĐÃ GIAO HÀNG", "TRẢ HÀNG", "HỦY ĐƠN HÀNG"};

    public static void addDataToTable_StatusOrders() {

        Session session = ConfigHibernate.getFactory().openSession();

        try {

            session.beginTransaction();

            for (int i = 0; i < arr_status_orders.length; i++) {
                StatusOrder sttOrder = new StatusOrder();
                sttOrder.setId_status(i);
                sttOrder.setName(arr_status_orders[i]);

                session.save(sttOrder);
            }

            session.getTransaction().commit();

        } catch (Exception e) {

            session.getTransaction().rollback();
            System.out.println(e.getMessage());

        } finally {
            session.close();
        }


    }
}
