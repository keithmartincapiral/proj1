/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1;

/**
 *
 * @author PSHC-MC BATCH 2026
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "McDonalds";
        String name2 = "KFC";
        String name3 = "Krispy Kreme";
        int age1 = 68;
        int age2 = 70;
        int age3 = 86;
        double net1 = 206.74; //source: macrotrends.net/stocks/charts/MCD/mcdonalds/net-worth
        double net2 = 28; //source: theufcnews.com/kfc-net-worth
        double net3 = 2.24; //source: stockanalysis.com/stocks/dnut/market-cap/
        System.out.println("Restaurant 1");
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Net worth(in billion dollars): " + net1);
        System.out.println(" ");      
        
        System.out.println("Restaurant 2");
        System.out.println("Name: " + name2);
        System.out.println("Age: " + age2);
        System.out.println("Net worth(in billion dollars): " + net2);
        System.out.println(" ");
        
        System.out.println("Restaurant 3");
        System.out.println("Name: " + name3);
        System.out.println("Age: " + age3);
        System.out.println("Net worth(in billion dollars): " + net3);
        System.out.println(" ");
        
        if(age1 > age2 && age1 > age3){ //comparison of age
            System.out.println("Oldest Fast Food Resto: " + name1 + ", " + age1);
        } else if (age2 > age1 && age2 > age3){
            System.out.println("Oldest Fast Food Resto: " + name2 + ", " + age2);
        } else {
            System.out.println("Oldest Fast Food Resto: " + name3 + ", " + age3);
        }
        
        if(net1 > net2 && net1 > net3){ //comparison of net worth
            System.out.println("Richest Fast Food Resto: " + name1 + ", " + net1 + " billion dollars");
        } else if (net2 > net1 && net2 > net3){
            System.out.println("Oldest Fast Food Resto: " + name2 + ", " + net2 + " billion dollars");
        } else {
            System.out.println("Oldest Fast Food Resto: " + name3 + ", " + net3 + " billion dollars");
        }
        System.out.println("Total Net Worth: " + (net1 + net2 + net3) + " billion dollars"); //getting the sum
        
    }
    
}
