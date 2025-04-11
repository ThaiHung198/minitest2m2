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

        // New functionality added below

        // 1. Gán tên kho mặc định là "Kho Tổng ABC"
        Product.setStoreName("Kho Tổng ABC");
        System.out.println("\nTên kho mặc định: " + Product.getStoreName());

        // 2. Hiển thị toàn bộ danh sách sản phẩm trong mảng
        System.out.println("\nTOÀN BỘ DANH SÁCH SẢN PHẨM:");
        for (Product p : products) {
            p.display();
            System.out.println("-------------------");
        }

        // 3. Tìm kiếm sản phẩm theo tên chính xác
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

        // 4. In danh sách các sản phẩm có giá > 1.000.000 đồng
        System.out.println("\nSẢN PHẨM CÓ GIÁ > 1.000.000 VND:");
        for (Product p : products) {
            if (p.getPrice() > 1000000) {
                p.display();
                System.out.println("-------------------");
            }
        }

        // 5. Tìm sản phẩm có số lượng tồn kho lớn nhất
        Product maxQuantityProduct = products[0];
        for (Product p : products) {
            if (p.getQuantity() > maxQuantityProduct.getQuantity()) {
                maxQuantityProduct = p;
            }
        }
        System.out.println("\nSẢN PHẨM CÓ SỐ LƯỢNG TỒN KHO LỚN NHẤT:");
        maxQuantityProduct.display();

        // 6. In tổng số sản phẩm, tổng giá trị tồn kho và giá trung bình
        System.out.println("\nTHỐNG KÊ:");
        System.out.println("Tổng số sản phẩm: " + Product.getTotalProduct());
        System.out.println("Tổng giá trị tồn kho: " + Product.formatCurrency(Product.getTotalInventoryValue()));
        System.out.println("Giá trung bình: " + Product.formatCurrency(Product.getAveragePrice()));

        // 7. Thay đổi tên kho thành "Kho miền Nam" và in lại tên kho mới
        Product.setStoreName("Kho miền Nam");
        System.out.println("\nTên kho mới: " + Product.getStoreName());
    }
}