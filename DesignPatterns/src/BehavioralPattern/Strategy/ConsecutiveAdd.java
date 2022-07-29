package BehavioralPattern.Strategy;

public class ConsecutiveAdd implements Strategy{
	   @Override
	    public int Operation(int num) {
	        return num*(num+1)/ 2;
	    }
}
