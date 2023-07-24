package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.Order;
import hibernate.pojo.OrderDetail;
import hibernate.pojo.Product;
import hibernate.util.FunctionUtil;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class DataOrderDetail {

    public static void addDataToTable_OrderDetails() {
        long executeTime = 0;
        long startTime = System.currentTimeMillis();
        Session session = ConfigHibernate.getFactory().openSession();
        Random random = new Random();

        try {
            List<Long> listIdOrder = DataUtil.getListIdOrder();
            List<Long> listIdProduct = DataUtil.getListIdProduct();

            session.beginTransaction();
            listIdOrder.forEach(idOrder -> {
                System.out.println("-----------------------------------------------");
                Order order = new Order();
                order.setId_order(idOrder);

                Product product = new Product();

                List<Long> listIdProductRandom = FunctionUtil.getListElementRandom(listIdProduct, 3);
                System.out.println(listIdProductRandom);

                listIdProductRandom.forEach(idProduct -> {

                    OrderDetail orderDetail = new OrderDetail();
                    orderDetail.setOrder(order);

                    product.setId_product(idProduct);
                    orderDetail.setProduct(product);
                    // số lượng sản phẩm của một chi tiết đơn hàng từ 1 đến 1000
                    orderDetail.setQuantity(random.nextInt(1, 1000));
                    // giá bán của sản phẩm đó từ 0đ đến 5 triệu
                    orderDetail.setPrice(BigDecimal.valueOf(random.nextLong((long) (5 * Math.pow(10, 6)))));

                    System.out.println("IdProduct: " + idProduct+ " ,IdOrder: " + idOrder);
                    session.save(orderDetail);
                    session.flush();
                });


            });
            session.getTransaction().commit();

            long endTime = System.currentTimeMillis();
            executeTime = endTime - startTime;

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            if (session != null) session.close();
            System.out.println("Time: " + (double) executeTime / 1000 + "s");
        }
    }
}
