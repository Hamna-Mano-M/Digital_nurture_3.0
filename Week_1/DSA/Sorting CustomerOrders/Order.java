/*
1.	Understand Sorting Algorithms:
    Explain different sorting algorithms (Bubble Sort, Insertion Sort, Quick Sort, Merge Sort).
        *BUBBLE SORT: It is a simple sorting algorithm that compares the adjacent elements repeatedly until order is created.
        The time complexity of bubble sort is O(n^2).
        *INSERTION SORT: Insertion sort builds the sorted array one item at a time. It is less efficient and takes more time than other algorithms.
        The time complexity for insertion sort is O(n^2)
        *QUICK SORT: Quick sort decides a pivot element which is used to divide the array into two parts and sort them.
        The time complexity of Quick sort is O(n log n)
2.	Setup:
       	Create a class Order with attributes like orderId, customerName, and totalPrice.

 */
public class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String orderId, String customerName, double totalPrice){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
