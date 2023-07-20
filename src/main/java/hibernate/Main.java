package hibernate;

import hibernate.data.*;

public class Main {
    public static void main(String[] args) {

        try {

//            DataStatusProduct.addDataToTable_StatusProducts();
//            DataStatusOrder.addDataToTable_StatusOrders();
//            DataBrand.addDataToTable_Brands();
//            DataSize.addDataToTable_Sizes();
//            DataPriceRange.addDataToTable_PriceRanges();
            DataTypeProduct.addDataToTable_TypeProducts();

        } catch (Exception e) {

            System.out.println("Đã có lỗi xảy ra");
            System.out.println(e.getMessage());

        }

    }
}