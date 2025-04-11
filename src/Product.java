import java.text.NumberFormat;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private static String storeName ="Kho Tổng ABC";
    private static int totalProduct=0;
    private static double totalInventoryValue=0;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProduct++;
        totalInventoryValue += this.getInventoryValue();
    }

    public void display() {
        System.out.println("|Mã sản phẩm: " + id + "|");
        System.out.println("|Tên sản phẩm: " + name + "|");
        System.out.println("|Giá: " + price + "|");
        System.out.println("|Số lượng: " + quantity + "|");
        System.out.println("|Giá trị tồn kho: "+ getInventoryValue()+"VND");
    }

    public double getInventoryValue() {
        return price*quantity;
    }

    public static double getAveragePrice() {
        return totalProduct ==0 ?0: totalInventoryValue/totalProduct;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static void setStoreName(String name) {
        storeName = name;
    }

    public static int getTotalProduct() {
        return totalProduct;
    }

    public static double getTotalInventoryValue() {
        return totalInventoryValue;
    }

    public static String formatCurrency(double amount) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(amount);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}