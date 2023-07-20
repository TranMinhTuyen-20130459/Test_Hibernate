package hibernate;

import hibernate.data.DataStatusOrder;
import hibernate.data.DataStatusProduct;

public class Main {
    public static void main(String[] args) {

        try {

//            DataStatusProduct.addDataToTable_StatusProducts();
            DataStatusOrder.addDataToTable_StatusOrders();

        } catch (Exception e) {

            System.out.println("Đã có lỗi xảy ra");
            System.out.println(e.getMessage());

        }

    }
}