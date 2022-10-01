import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" + "\nthe menu but we need to decide on pricing");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake?" + "\n(Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        Double cakePrice = Double.parseDouble(priceText);
        redVelvet.setPrice(cakePrice);

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake?" + "\n(Input a number with two decimal places");
        priceText = input.nextLine();
        double velvetPrice = Double.parseDouble(priceText);

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake?" + "\n(Input a number with two decimal places)");
        priceText = input.nextLine();
        double chocPrice = Double.parseDouble(priceText);
        chocolate.setPrice(chocPrice);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the drink menu. We currently have three types of drinks on" + "\nthe menu but we need to decide on pricing");

        System.out.println("We are deciding on the price for our bottle water. Here is the description: ");
        water.type();
        System.out.println("How much would you like to charge for the water bottle?" + "\n(Input a number with two decimal places)");
        priceText = input.nextLine();
        double waterPrice = Double.parseDouble(priceText);
        water.setPrice(waterPrice);

        System.out.println("We are deciding on the price for our bottle of soda. Here is the description: ");
        soda.type();
        System.out.println("How much would you like to charge for the bottled soda?" + "\n(Input a number with two decimal places)");
        priceText = input.nextLine();
        double sodaPrice = Double.parseDouble(priceText);
        soda.setPrice(sodaPrice);

        System.out.println("We are deciding on the price for our bottle of milk. Here is the description: ");
        milk.type();
        System.out.println("How much would you like to charge for the bottled milk?" + "\n(Input a number with two decimal places");
        priceText = input.nextLine();
        double milkPrice = Double.parseDouble(priceText);
        milk.setPrice(milkPrice);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);


    }





    static class Cupcake {
        public double price;


        public double getPrice () {
            return price;
        }
        public void setPrice (double price) {
            this.price = price;
        }
        public void type () {
            System.out.println("A basic, generic cupcake, with vanilla frosting");
        }
    }

    static class RedVelvet extends Cupcake {
        public void type () {
            System.out.println("A red velvet based cupcake, with cream cheese frosting");
        }
    }

    static class Chocolate extends Cupcake {
        public void type () {
            System.out.println("A chocolate based cupcake, with chocolate frosting");
        }
    }

    static class Drink {
        public double price;

        public double getPrice () {
            return price;
        }
        public void setPrice (double price) {
            this.price = price;
        }
        public void type () {
            System.out.println("A bottle of water");
        }
    }

    static class Soda extends Drink {
        public void type() {
            System.out.println("A bottle of soda");
        }
    }

    static class Milk extends Drink {
        public void type() {
            System.out.println("A bottle of milk");
        }
    }



}