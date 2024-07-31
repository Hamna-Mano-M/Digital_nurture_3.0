public class QuickSort {
    public static void quickSort(Order[] orders , int low, int high){
        if(low<high){
            int part = partition(orders,low,high);

            quickSort(orders,low,part-1);
            quickSort(orders,part+1,high);
        }
    }
    public static int partition(Order[] orders, int low, int high){
        double pivot = orders[high].getTotalPrice();
        int i = low-1;
        for(int j=low;j<high;j++){
            if(orders[j].getTotalPrice()<=pivot){
                i++;

                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i+1];
        orders[i+1] = orders[high];
        orders[high] = temp;

        return i+1;
    }
}


/*
4.	Analysis:
    Compare the performance (time complexity) of Bubble Sort and Quick Sort.
        *The time complexity of the best Case of bubble sort is O(n) whereas for the Quick sort it is only O(nlog n).
        It implies that the Quick sort is much faster than Bubble sort algorithm
    Discuss why Quick Sort is generally preferred over Bubble Sort.
        *As the Quick sort algorithm is more efficient time wisa(it consumes less time than the Bubble sort),
        it is preferred more than other algorithms.

 */