/*package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.dao.ProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Scanner;

@Component
public class NorthwindApplication implements CommandLineRunner {

    @Autowired
    private ProductDAO productDAO;

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run(String... args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Product Menu ---");
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Update Product");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    productDAO.getAll().forEach(System.out::println);
                    break;

                case "2":
                    try {
                        System.out.print("Enter product ID: ");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter category: ");
                        int category = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter price: ");
                        double price = Double.parseDouble(scanner.nextLine());

                        productDAO.add(new Product(id, name, category, price));
                        System.out.println("Product added!");

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number entered. Please try again.");
                    }
                    break;

                case "3":
                    try {
                        System.out.print("Enter the product ID to delete: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());
                        productDAO.delete(deleteId);
                        System.out.println("Product deleted if it existed.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Must be a number.");
                    }
                    break;

                case "4":
                    try {
                        System.out.print("Enter the product ID to update: ");
                        int updateId = Integer.parseInt(scanner.nextLine());
                        Product existing = productDAO.getById(updateId);

                        if (existing != null) {
                            System.out.print("Enter new name [" + existing.getName() + "]: ");
                            String name = scanner.nextLine();
                            name = name.isEmpty() ? existing.getName() : name; //condition ? valueIfTrue : valueIfFalse;
                            //if (name.isEmpty()) {
                            //    name = existing.getName();
                            //} else {
                            //    name = name;
                            //}

                            System.out.print("Enter new category [" + existing.getCategory() + "]: ");
                            Serializable category = scanner.nextLine();
                            category = (boolean) category ? existing.getCategory() : category;

                            System.out.print("Enter new price [" + existing.getPrice() + "]: ");
                            String priceStr = scanner.nextLine();
                            double price = priceStr.isEmpty() ? existing.getPrice() : Double.parseDouble(priceStr);

                            Product updated = new Product(updateId, name, (Integer) category, price);
                            productDAO.update(updated);
                            System.out.println("Product updated.");
                        } else {
                            System.out.println("Product ID not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter numeric values where appropriate.");
                    }
                    break;

                case "0":
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please enter 0, 1, 2, 3, or 4.");
            }
        }
    }
}*/
