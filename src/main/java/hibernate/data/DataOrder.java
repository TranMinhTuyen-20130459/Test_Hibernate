package hibernate.data;

import hibernate.config.ConfigHibernate;
import hibernate.pojo.Order;
import hibernate.pojo.StatusOrder;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.util.Random;

public class DataOrder {

    public static String[] arr_email_customers = {"trantuyen.dev.1@gmail.com", "trantuyen.dev.2@gmail.com", "trantuyen.dev.3@gmail.com",
            "trantuyen.dev.4@gmail.com", "trantuyen.developer.981@gmail.com"};

    public static String[] arr_phone_receiver = {"0927042108", "1927142108", "2927242108", "3927342108", "4927442108"};

    public static String[] arr_address = {"256 LÊ VĂN QUỚI", "CƯ XÁ A KHU PHỐ 6", "TRƯỜNG ĐẠI HỌC NÔNG LÂM"};

    public static String[] arr_name_wards = {"PHƯỜNG 1", "PHƯỜNG 2", "PHƯỜNG 3", "PHƯỜNG 4", "PHƯỜNG 5",
            "PHƯỜNG 6", "PHƯỜNG 7", "PHƯỜNG 8", "PHƯỜNG 9", "PHƯỜNG 10",
            "PHƯỜNG 11", "PHƯỜNG 12", "PHƯỜNG 13", "PHƯỜNG 14", "PHƯỜNG 15"};

    public static String[] arr_id_wards = {"W1", "W2", "W3", "W4", "W5", "W6", "W7", "W8", "W9", "W10", "W11", "W12", "W13", "W14", "W15"};

    public static String[] arr_name_districts = {"QUẬN 1", "QUẬN 2", "QUẬN 3", "QUẬN 4", "QUẬN 5",
            "QUẬN 6", "QUẬN 7", "QUẬN 8", "QUẬN 9", "QUẬN 10",
            "QUẬN 11", "QUẬN 12", "QUẬN 13", "QUẬN 14", "QUẬN 15",};

    public static String[] arr_id_districts = {"D1", "D2", "D3", "D4", "D5",
            "D6", "D7", "D8", "D9", "D10",
            "D11", "D12", "D13", "D14", "D15"};

    public static String[] arr_name_provinces = {"THÀNH PHỐ 1", "THÀNH PHỐ 2", "THÀNH PHỐ 3", "THÀNH PHỐ 4", "THÀNH PHỐ 5",
            "THÀNH PHỐ 6", "THÀNH PHỐ 7", "THÀNH PHỐ 8", "THÀNH PHỐ 9", "THÀNH PHỐ 10",
            "THÀNH PHỐ 11", "THÀNH PHỐ 12", "THÀNH PHỐ 13", "THÀNH PHỐ 14", "THÀNH PHỐ 15"};

    public static String[] arr_id_provinces = {"P1", "P2", "P3", "P4", "P5",
            "P6", "P7", "P8", "P9", "P10",
            "P11", "P12", "P13", "P14", "P15"};

    public static String[] arr_phone_senders = {"0379342981", "1379442981", "2379542981", "3379642981", "4379742981"};

    public static void addDataToTable_Orders() {
        long executeTime = 0;
        long startTime = System.currentTimeMillis();
        Session session = ConfigHibernate.getFactory().openSession();
        Random random = new Random();
        try {
            session.beginTransaction();
            // tạo mới 10000 đơn hàng
            for (int i = 0; i < 10000; i++) {
                Order order = new Order();
                order.setFrom_phone(arr_phone_senders[random.nextInt(arr_phone_senders.length)]);
                order.setTo_phone(arr_phone_receiver[random.nextInt(arr_phone_receiver.length)]);
                order.setEmail_customer(arr_email_customers[random.nextInt(arr_email_customers.length)]);
                order.setFrom_address(arr_address[random.nextInt(arr_address.length)]);

                // thông tin phường/xã nơi gửi
                int random_index_ward_from = random.nextInt(arr_id_wards.length);
                order.setFrom_ward_id(arr_id_wards[random_index_ward_from]);
                order.setFrom_ward_name(arr_name_wards[random_index_ward_from]);

                // thông tin quận/huyện nơi gửi
                int random_index_district_from = random.nextInt(arr_id_districts.length);
                order.setFrom_district_id(arr_id_districts[random_index_district_from]);
                order.setFrom_district_name(arr_name_districts[random_index_district_from]);

                // thông tin tỉnh/thành nơi gửi
                int random_index_province_from = random.nextInt(arr_id_provinces.length);
                order.setFrom_province_id(arr_id_provinces[random_index_province_from]);
                order.setFrom_province_name(arr_name_provinces[random_index_province_from]);

                // thông tin phường/xã nơi nhận
                int random_index_ward_to = random.nextInt(arr_id_wards.length);
                order.setTo_ward_id(arr_id_wards[random_index_ward_to]);
                order.setTo_ward_name(arr_name_wards[random_index_ward_to]);

                // thông tin quận/huyện nơi nhận
                int random_index_district_to = random.nextInt(arr_id_districts.length);
                order.setTo_district_id(arr_id_districts[random_index_district_to]);
                order.setTo_district_name(arr_name_districts[random_index_district_to]);

                // thông tin tỉnh/thành nơi nhận
                int random_index_province_to = random.nextInt(arr_id_provinces.length);
                order.setTo_province_id(arr_id_provinces[random_index_province_to]);
                order.setTo_province_name(arr_name_provinces[random_index_province_to]);

                // phí ship từ 30 ngàn đến 500 ngàn đồng
                long ship_price = random.nextLong((long) (3 * Math.pow(10, 4)), (long) (5 * Math.pow(10, 5)));
                order.setShip_price(BigDecimal.valueOf(ship_price));

                // giá trị đơn hàng từ 500 ngàn đến 500 triệu đồng
                long order_value = random.nextLong((long) (5 * Math.pow(10, 5)), (long) (500 * Math.pow(10, 6)));
                order.setOrder_value(BigDecimal.valueOf(order_value));

                order.setTotal_price(BigDecimal.valueOf(ship_price + order_value));

                StatusOrder sttOrder = new StatusOrder();
                sttOrder.setId_status(random.nextInt(0, 7));

                order.setStatus_order(sttOrder);

                session.save(order);
            }
            session.getTransaction().commit();

            long endTime = System.currentTimeMillis();
            executeTime = endTime - startTime;

        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            if (session != null) session.close();
            System.out.println("Time: " + (double) executeTime / (60 * 1000) + " minute");
        }
    }

}
