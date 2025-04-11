//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product.setStoreName("Kho hàng điện tử trung tâm");
        Product[] products = {
                new Product(1, "laptop TUF GAMING F15", 15000000, 15),
                new Product(2, "Iphone 15 Promax", 21000000, 30),
                new Product(3, "Samsung Galaxy S24", 20000000, 20),
                new Product(4, "Macbook Ari M4", 54000000, 10),
                new Product(5, "Macbook Ari M1", 38000000, 27)
        };
        System.out.println("DANH SÁCH SẢN PHẨM");
        System.out.println("Kho hàng: "+ Product.getStoreName());
        System.out.println("------------------------------------");
        for (Product p : products) {
            p.display();
        }
        System.out.println("\nTHỐNG KÊ KHO HÀNG");
        System.out.println("Tổng số sản phẩm: "+Product.getTotalProduct());
        System.out.println("Tổng giá trị tồn kho: "+ Product.formatCurrency(Product.getTotalInventoryValue()) + " VND");
        System.out.println("Giá trung bình: "+ Product.formatCurrency(Product.getAveragePrice()) + " VND");

    }
}