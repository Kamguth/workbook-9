
package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class NorthwindTradersCLI implements CommandLineRunner {

    private final Scanner scanner;
    private final CustomerDAO customerDAO;

    @Autowired
    public NorthwindTradersCLI(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.customerDAO.getAll());
        userScreen();
    }

    private void userScreen() {
        System.out.println("ADD USER SCREEN");
    }
}
