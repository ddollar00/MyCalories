package mycalories;

import java.util.*;
import javax.swing.*;


public class MyCalories {

    private static String gen;
    private static int cal;

    public static void main(String[] args) {
       ArrayList<String>q=new ArrayList<>();
      
  char e = 'p';
      
      while(e != 'e'){
        Calculate c = new Calculate();
        gen = JOptionPane.showInputDialog(null, "Male of female(M/W):  ");

        if ("M".equals(gen) || "m".equals(gen)) {
            cal = Integer.parseInt(JOptionPane.showInputDialog("Enter then number of calories you have eaten today:  "));

            JOptionPane.showMessageDialog(null, c.CalorresM(cal));
            q.add(c.CalorresM(cal));

        }

        if ("W".equals(gen) || "w".equals(gen)) {
            cal = Integer.parseInt(JOptionPane.showInputDialog("Enter then number of calories you have eaten today:  "));

            JOptionPane.showMessageDialog(null, c.CalorresW(cal));
            q.add(c.CalorresM(cal));
        }
        System.out.println(q);

        System.out.println("Type any letter to calculate another amount next another User,Type e to exit");
        
        Scanner kb=new Scanner(System.in);
        e =kb.next().charAt(0);
      }
      
        

    }

}

class Calories {

    private int calorieM = 2500;
    private int calorieW = 2000;

    public Calories() {
        this.calorieM = calorieM;
        this.calorieW = calorieW;
    }
   

    public int getCalorieM() {
        return calorieM;
    }

    public int getCalorieW() {
        return calorieW;
    }
}

class Calculate {

    public String CalorresM(int n) {
        Calories c = new Calories();
        int difference = n - c.getCalorieM();
        int dec = c.getCalorieM() - n;
        if (c.getCalorieM() == n) {
            return ("You have eaten all your calories for the day");
        } else if (n > c.getCalorieM()) {
            return (" You over your daily caloric intake amount by:  " + difference);
        } else if (n < c.getCalorieM()) {
            return ("you have " + dec + " calories left");
        }
        return "";
    }

    public String CalorresW(int n) {
        Calories c = new Calories();
        int difference = n - c.getCalorieW();
        int dec = c.getCalorieM() - n;
        if (c.getCalorieW() == n) {
            return ("You have eaten all calories for the day");
        } else if (n > c.getCalorieW()) {
            return (" You over your daily caloric intake amount:  " + difference);
        } else if (n < c.getCalorieW()) {
            return ("you have " + dec + " calories left");
        }
        return "";
    }

}

