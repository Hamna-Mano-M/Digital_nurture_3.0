import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String targetName){
        Arrays.sort(products, Comparator.comparing(Product :: getProductName));
        int left =0;
        int right = products.length -1;

        while(left<=right){
            int mid = left + (right-left)/2;
            int comparision;
            comparision = products[mid].getProductName().compareTo(targetName);

            if (comparision==0){
                return products[mid];

            }
            else if (comparision<0){
                left = mid+1;

            }
            else {
                right = mid-1;
            }
        }
        return null;
    }
}
