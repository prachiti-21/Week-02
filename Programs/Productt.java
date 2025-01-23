import java.util.ArrayList;

class Customerr{
    public String customername;

    private ArrayList<Order>orders=new ArrayList<>();
    Customerr(String customername){
        this.customername=customername;
    }
    String display_customername(){
        return customername;
    }

    void addOrders(Order order){
        orders.add(order);
    }
    void display_orderdetails(){
        System.out.println("Customer Name: "+display_customername());
        System.out.println("Orders: ");
        for(Order order: orders){
            System.out.println(order+ " "+order.display_orderid());
        }
        //System.out.println(order.display_orderId());

    }
    void removeOrder(Order order){
        orders.remove(order);
    }
}
class Order{
    int orderId;
    public ArrayList<Productt>products= new ArrayList<>();
    Order(int orderId){
        this.orderId=orderId;
    }
    int display_orderid(){
        return orderId;
    }
    void addProducts(Productt product){
        products.add(product);
    }
    String  display_product(Productt product){
        return product.productname;
    }
    void display_Productdetails(){
        for(Productt product: products){
            System.out.println(display_product(product));
        }
    }
    void remove_product(Productt product){

        products.remove(product);
    }
}
 class Productt {
    String productname;
    int productId;
    int quantity;
    Productt(String productname,int productId,int quantity){
        this.productname=productname;
        this.productId=productId;
        this.quantity=quantity;
    }

     public static void main(String[] args) {
         Customerr customer=new Customerr("Prachiti");

         //creating order objects
         Order order1= new Order(01);
         Order order2= new Order(02);
         Order order3 = new Order(03);

         //creating product objects
         Productt product1= new Productt("Book",001,1);
         Productt product2= new Productt("Shirt",002,2);
         Productt product3= new Productt("cream",003,1);

         //adding orders
         customer.addOrders(order1);
         customer.addOrders(order2);
         customer.addOrders(order3);

         //adding products
         order1.addProducts(product1);
         order1.addProducts(product2);
         order2.addProducts(product2);
         order3.addProducts(product3);

         //order details
         customer.display_orderdetails();

         //product details
         order1.display_Productdetails();
         order2.display_Productdetails();
         order3.display_Productdetails();

         //remove product
         System.out.println("product removed from order1: ");
         order1.remove_product(product1);
         System.out.println(order1.display_product(product1));
         System.out.println("Order 1 after removing product1: ");
         customer.display_orderdetails();

     }

}
