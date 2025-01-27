package com.multilevel_inheritance;

import java.util.*;
public class Orderr {
    int orderId;
    String orderDate,orderStatus;
    Orderr(int orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
        this.orderStatus=orderStatus;

    }
    void getOrderStatus(){

            System.out.println("Order status:");
            System.out.println("Order Id: " + orderId);
            System.out.println("Order date: " + orderDate);

    }
}
class ShippedOrder extends Orderr{
    double trackingNumber;
    ShippedOrder(int orderId,String orderDate,double trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;

    }
    @Override
    void getOrderStatus() {

            System.out.println("Shipping status: ");
            System.out.println("Order Id: " + orderId);
            System.out.println("Order date: " + orderDate);
            System.out.println("Tracking number: " + trackingNumber);

    }
}
class DeliveredOrder extends  ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, double trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.orderDate=orderDate;
        this.deliveryDate=deliveryDate;

    }
    void getOrderStatus() {

            System.out.println("Delivery status: ");
            System.out.println("Order Id: " + orderId);
            System.out.println("Order date: " + orderDate);
            System.out.println("Tracking number: " + trackingNumber);
            System.out.println("Delivery date: " + deliveryDate);

    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       // System.out.println("Enter order status: ");
        //input.nextLine();
        //String OrderStatus= input.nextLine();
        DeliveredOrder delivery= new DeliveredOrder(2100,"23-01-2025",251162,"26-01-2025");
        ShippedOrder ship= new ShippedOrder(21,"23-01-2025",2516);
        Orderr order= new Orderr(23,"23-01-2025");
        //delivery.getOrderStatus();
        System.out.println("Enter order status: ");
        //input.nextLine();
        String OrderStatus= input.nextLine();
       if(OrderStatus.equals("Ordered")){
           order.getOrderStatus();
        }
        else if(OrderStatus.equals("Shipped")){
            ship.getOrderStatus();
        }
        else if(OrderStatus.equals("Delivered")){
            delivery.getOrderStatus();
        }

        //delivery.getOrderStatus();
        //ship.getOrderStatus();*/
    }
}
