
//import ArrayList
import java.util.ArrayList;

class CafeUtil {
    // Streak Goal
    public int getStreakGoal(){
        int sum = 0;
        for(int week = 1; week <= 10; week++){
            sum = sum + week;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;

        for(int i = 0; i < prices.length; i++){
            total = total + prices[i];
    }
    return total;
    }

    void displayMenu(ArrayList<String> menuItems){

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
    
        }
    }
    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people ahead of you.");
        customers.add(userName);
    }
}