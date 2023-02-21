import java.util.*;
import java.util.stream.Collectors;

public final class BankReport {
    /* Customer = Employee of the Business
       Business = a client of the Bank
       Customers of the Bank = all the Employees that work for the Businesses that are clients of the Bank */

    public static int getNumberOfCustomers(Bank bank) {
        // All the customers that have accounts at the bank
        // A customer is an Employee that works for a Business (client of the bank)

        return bank.getClients().stream()
                .map(Business::getEmployees)
                .flatMap(Collection::stream).toList()
                .size();
    }

    public static int getNumberOfAccounts(Bank bank) {
        // Accounts of all the customers of the bank

        return bank.getClients().stream()
                .map(Business::getEmployees)
                .flatMap(Collection::stream)
                .mapToInt(Employee::getNumberOfAccounts)
                .sum();
    }

    public static SortedSet<Employee> getCustomersSorted(Bank bank) {
        // Return the set of customers in alphabetical order

        return bank.getClients().stream()
                .map(Business::getEmployees)
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator
                        .comparing(Employee::getName))));
    }

    public static double getTotalSumInAccounts(Bank bank) {
        // Sum of all customers' accounts balances

        return bank.getClients().stream()
                .map(Business::getEmployees)
                .flatMap(Collection::stream)
                .flatMap(employee -> employee.getAccounts().stream())
                .mapToDouble(Account::getBalance)
                .sum();
    }

    public static SortedSet<Account> getAccountsSortedBySum(Bank bank) {
        // The set of all accounts, ordered by current account balance
        // and if the balance is equal, sort by id

        SortedSet<Account> accounts = new TreeSet<>(Comparator.comparingDouble(Account::getBalance)
                .thenComparing(Account::getId));

        bank.getClients().stream()
                .map(Business::getEmployees)
                .flatMap(Collection::stream)
                .flatMap(employee -> employee.getAccounts().stream())
                .forEach(accounts::add);

        return accounts;
    }

    public static Map<Employee, Collection<Account>> getCustomerAccounts(Bank bank) {
        // Return a map of all the customers with their respective accounts

        Map<Employee, Collection<Account>> customerAccounts = new HashMap<>();

        bank.getClients().stream()
                .map(Business::getEmployees)
                .flatMap(Collection::stream)
                .forEach(employee -> customerAccounts.put(employee, employee.getAccounts()));

        return customerAccounts;
    }

    public static Map<String, List<Employee>> getCustomersByCity(Bank bank) {
        // Map all the customers to their respective cities

        return bank.getClients().stream()
                .map(Business::getEmployees)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Employee::getCity));
    }
}
