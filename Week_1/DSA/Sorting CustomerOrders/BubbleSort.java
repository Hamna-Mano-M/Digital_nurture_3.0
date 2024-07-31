/*
3.	Implementation:
        Implement Bubble Sort to sort orders by totalPrice.
        Implement Quick Sort to sort orders by totalPrice

 */
public class BubbleSort {
    public static Order bubbleSort(Order[] orders){
        int n = orders.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(orders[j].getTotalPrice()>orders[j+1].getTotalPrice()){
                    Order temp = orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;
                }
            }
        }
        return null;
    }
}
