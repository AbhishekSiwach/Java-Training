package Assignments;
import java.util.ArrayList;
import java.util.Scanner;

class Item{
    private int item_code;
    private String item_name;
    private float unit_price;
    private int quantity;
    private double total_price;

    Item(){

    }

    public int getItem_code() {
        return item_code;
    }

    public void setItem_code(int item_code) {
        this.item_code = item_code;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public Item(int item_code, String item_name, float unit_price, int quantity, double total_price) {
        this.item_code = item_code;
        this.item_name = item_name;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.total_price = total_price;
    }
}

class Order{
    private int order_id;
    private String customer_name;
    private ArrayList<Item> item_list = new ArrayList<Item>();
    private double net_price;

    Order(){

    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public ArrayList<Item> getItem_list() {
        return item_list;
    }

    public void setItem_list(ArrayList<Item> item_list) {
        this.item_list = item_list;
    }

    public double getNet_price() {
        return net_price;
    }

    public void setNet_price(double net_price) {
        this.net_price = net_price;
    }

    public Order(int order_id, String customer_name, ArrayList<Item> item_list, double net_price) {
        this.order_id = order_id;
        this.customer_name = customer_name;
        this.item_list = item_list;
        this.net_price = net_price;
    }
}
public class Orderprocessing {
    static ArrayList<ArrayList<Item>> orders = new ArrayList<ArrayList<Item>>();
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Process an order");
            System.out.println("2. View all orders");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            if(choice == 1){
                char more = 'Y';
                ArrayList<Item> items = new ArrayList<Item>();
                while(more=='Y' || more=='y') {
                    System.out.println("Enter the details");
                    System.out.println("Enter item code=");
                    int item_code = sc.nextInt();
                    sc.next();
                    System.out.println("Enter item name=");
                    String item_name = sc.nextLine();
                    System.out.println("Enter unit price=");
                    float unit_price = sc.nextFloat();
                    System.out.println("Enter quantity=");
                    int qty = sc.nextInt();
                    double total_price = unit_price * qty;
                    Item item = new Item(item_code, item_name, unit_price, qty, total_price);
                    items.add(item);

                    System.out.println("Want to add more item?");
                    more = sc.next().charAt(0);
                }

                double net_total = 0.0;
                System.out.println("Order Id: "+orders.size());
                System.out.println("___________________________");
                ArrayList<Item> temp = orders.get(orders.size()-1);
                System.out.println("Item Name                   Qty     Unit Prce");
                for(Item item : temp){
                    System.out.println(item.getItem_name()+"  "+item.getQuantity()+ "   "+ item.getUnit_price());
                    net_total += item.getTotal_price();
                }
                System.out.println("___________________________");
                System.out.println("Net Total: "+net_total);
            }
            else if(choice==2){
                System.out.println("Order Id    File name");
                System.out.println("___________________________");
                for(int i = 0; i<orders.size(); i++){
                    System.out.println((i+1) + "    " +"order-"+(i+1));
                }
                System.out.println("___________________________");

                int order_no;
                System.out.println("Enter the order number you want ot view=");
                order_no = sc.nextInt();

                double net_total = 0.0;
                ArrayList<Item> temp = orders.get(order_no-1);
                System.out.println("Item Name                   Qty     Unit Prce");
                for(Item item : temp){
                    System.out.println(item.getItem_name()+"  "+item.getQuantity()+ "   "+ item.getUnit_price());
                    net_total += item.getTotal_price();
                }
                System.out.println("___________________________");
                System.out.println("Net Total: "+net_total);

            }
            else if(choice==3){
                System.exit(0);
            }
            else{
                System.out.println("Wrong choice");
            }
        }
    }
}