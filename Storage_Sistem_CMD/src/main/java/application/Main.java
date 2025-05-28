package application;
import entities.Controller;
import entities.Product;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Controller con = new Controller();

        System.out.println("\n----Storage System----");
    try {
        boolean running = true;
        while (running) {
            System.out.println("-------------------------\n");
            System.out.println("Select Options");
            System.out.println("1 - Add Product");
            System.out.println("2 - Remove Product");
            System.out.println("3 - Locate Product");
            System.out.println("4 - List Products");
            System.out.println("5 - Exit");
            System.out.println("-------------------------");
            System.out.print("Enter option: ");

            int option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\n-------------------------\n");
                    System.out.print("Enter product ID: ");
                    int id = in.nextInt();
                    System.out.println("\n-------------------------\n");
                    System.out.print("Enter product name: ");
                    String name = in.next();
                    Product p = new Product(id, name);
                    System.out.println("\n-------------------------\n");
                    con.addProduct(p);
                    break;
                case 2:
                    System.out.println("\n-------------------------\n");
                    System.out.print("Enter product ID: ");
                    int numberID = in.nextInt();
                    System.out.println("\n-------------------------\n");
                    con.removeProduct(numberID);
                    break;
                case 3:
                    System.out.println("\n-------------------------\n");
                    System.out.print("Enter product ID: ");
                    int numberID2 = in.nextInt();
                    System.out.println("\n-------------------------\n");
                    con.localizeProduct(numberID2);
                    break;
                case 4:
                    System.out.println("\n-------------------------\n");
                    con.listProducts();
                    break;
                case 5:
                    running = false;
                    System.out.println("\n-------------------------\n");
                    System.out.println("Exiting system...");
                    System.out.println("Finish");
                    break;
                default:
                    System.out.println("\n-------------------------\n");
                    System.out.println("Invalid option!");
                    break;
            }

        }
        in.close();
            } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            in.nextLine();
        }
    }
}
