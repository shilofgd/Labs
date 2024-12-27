package Lab10m;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int orderid;
    private String customerName;
    private LocalDate orderDate;
    private String status;
    private int amount;

    public Order(int orderid, String customerDate, LocalDate orderDate, String status, int amount){
        this.orderid = orderid;
        this.customerName = customerDate;
        this.orderDate = orderDate;
        this.status = status;
        this.amount = amount;
    }

    public int getOrderid() {
        return orderid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderid + ", customerName=" + customerName + ", orderDate=" + orderDate + ", status=" + status + ", amount=" + amount + "}";
    }
}
