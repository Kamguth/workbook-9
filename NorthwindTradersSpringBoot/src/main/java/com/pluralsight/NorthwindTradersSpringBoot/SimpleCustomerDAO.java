package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleCustomerDAO implements CustomerDAO {
    private List<Customer> customers;

    public SimpleCustomerDAO() {
        this.customers = new ArrayList<>();
        this.customers.add(new Customer("1212", "Test Company", "Test Person 1", "Sir", "123 Test st.", "Test", "TS", "99999", "TSA", "8881112323", "000000000"));
        this.customers.add(new Customer("1213", "Test Company", "Test Person 2", "Mrs", "123 Test st.", "Test", "TS", "99999", "TSA", "8881112323", "000000000"));
        this.customers.add(new Customer("1214", "Test Company", "Test Person 3", "Dr.", "123 Test st.", "Test", "TS", "99999", "TSA", "8881112323", "000000000"));
    }

    @Override
    public List<Customer> getAll() {
        return this.customers;
    }

    @Override
    public List<Customer> getByCompanyName() {
        return null;
    }

    @Override
    public List<Customer> getByContactName() {
        return null;
    }

    @Override
    public List<Customer> getByAddress() {
        return null;
    }

    @Override
    public Customer getByCustomerID() {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public void add(Customer customer) {
        this.customers.add(customer);
    }
}