
package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getAll();
    public List<Customer> getByCompanyName();
    public List<Customer> getByContactName();
    public List<Customer> getByAddress();
    public Customer getByCustomerID();
    public void delete();
    public void add(Customer customer);
}

