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
        System.out.println("Kho hàng: " + Product.getStoreName());
        System.out.println("------------------------------------");
        for (Product p : products) {
            p.display();
        }

        System.out.println("\nTHỐNG KÊ KHO HÀNG");
        System.out.println("Tổng số sản phẩm: " + Product.getTotalProduct());
        System.out.println("Tổng giá trị tồn kho: " + Product.formatCurrency(Product.getTotalInventoryValue()) + " VND");
        System.out.println("Giá trung bình: " + Product.formatCurrency(Product.getAveragePrice()) + " VND");


        Product.setStoreName("Kho Tổng ABC");
        System.out.println("\nTên kho mặc định: " + Product.getStoreName());

        System.out.println("\nTOÀN BỘ DANH SÁCH SẢN PHẨM:");
        for (Product p : products) {
            p.display();
            System.out.println("-------------------");
        }

        String searchName = "Macbook Ari M1";
        boolean found = false;
        System.out.println("\nTÌM KIẾM SẢN PHẨM: " + searchName);
        for (Product p : products) {
            if (p.getName().equals(searchName)) {
                p.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy");
        }

        System.out.println("\nSẢN PHẨM CÓ GIÁ > 1.000.000 VND:");
        for (Product p : products) {
            if (p.getPrice() > 1000000) {
                p.display();
                System.out.println("-------------------");
            }
        }

        Product maxQuantityProduct = products[0];
        for (Product p : products) {
            if (p.getQuantity() > maxQuantityProduct.getQuantity()) {
                maxQuantityProduct = p;
            }
        }
        System.out.println("\nSẢN PHẨM CÓ SỐ LƯỢNG TỒN KHO LỚN NHẤT:");
        maxQuantityProduct.display();

        System.out.println("\nTHỐNG KÊ:");
        System.out.println("Tổng số sản phẩm: " + Product.getTotalProduct());
        System.out.println("Tổng giá trị tồn kho: " + Product.formatCurrency(Product.getTotalInventoryValue()));
        System.out.println("Giá trung bình: " + Product.formatCurrency(Product.getAveragePrice()));

        Product.setStoreName("Kho miền Nam");
        System.out.println("\nTên kho mới: " + Product.getStoreName());
    }
}