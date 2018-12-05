/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Supplier.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Order {
    private List<Product> order;
    private Customer customer;
    private Employee employee;
    
    public Order(){
        order = new ArrayList<>();
        customer = new Customer();
        employee = new Employee();
    }

    public List<Product> getOrder() {
        return order;
    }

    public void setOrder(List<Product> order) {
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
