/*
1.	Understand Recursive Algorithms:
	Explain the concept of recursion and how it can simplify certain problems.
	    *The recursion concept is used when the same method has to be used many number of times.
	    *The method basically calls itself again and again until a specific stage is reached.
2.	Setup:
	Create a method to calculate the future value using a recursive approach.
3.	Implementation:
	Implement a recursive algorithm to predict future values based on past growth rates.

 */
public class FinancialForecast {
    public double predictValues(double current, double rate, int time){
        if(time == 0){
            return current;
        }
        else {
            return predictValues(current*(1+rate),rate,time-1);
        }
    }

    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();
        double current = 10000.00;
        double rate = 0.1;
        int time = 5;


        double predictedValue = forecast.predictValues(current,rate,time);

        System.out.println("The predicted future value is "+predictedValue);
    }
}
/*
4.	Analysis:
	Discuss the time complexity of your recursive algorithm.
	    *The time complexity of recursive algorithm is O(n) where n is the time period.
	Explain how to optimize the recursive solution to avoid excessive computation.
	    *The recursive algorithm can be optimised by using the iterative approach where the recursive solution is turned into an iterative one.
	    This step helps when the input size is considerably large.
*/

