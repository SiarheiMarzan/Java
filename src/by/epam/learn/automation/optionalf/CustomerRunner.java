package by.epam.learn.automation.optionalf;

import java.util.*;


/*  Массив объектов с паарметрами   id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
    Создать массив объектов. Вывести:
        a) список покупателей в алфавитном порядке;
        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
*/


public class CustomerRunner {
    public static void main(String[] args) {


        Customer customer1 = new Customer.Builder("Ivanov")
                .setName("Ivan")
                .setAccountNumber("40702810555501")
                .setAdress("Sokola 7")
                .setCardNumber(414901).build();

        Customer customer2 = new Customer.Builder("Petrov")
                .setName("Ivan")
                .setAccountNumber("40702810555502")
                .setAdress("Sokola 8")
                .setCardNumber(414902).build();

        Customer customer3 = new Customer.Builder("Sidorov")
                .setName("Ivan")
                .setAccountNumber("40702810555503")
                .setAdress("Sokola 9")
                .setCardNumber(414903).build();

        Customer customer4 = new Customer.Builder("Bill")
                .setName("Ivan")
                .setAccountNumber("40702810555504")
                .setAdress("Sokola 10")
                .setCardNumber(414904).build();

        List<Customer> customers = new ArrayList<Customer>();

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);


        UtilMethods utilMethods = new UtilMethods();

        utilMethods.printCustomersAll(customers);

        // UtilMethod.printCustomersAll(customers);

        List<Customer> customersDiap = utilMethods.getCustomersDiap(customers, 414902, 414904);
        utilMethods.printCustomersAll(customersDiap);


        utilMethods.sortCustomersSurNameABS(customers);
        utilMethods.printCustomersAll(customers);


    }
}


class Customers {
    private List<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}


class Customer {
    private static int ids;
    private final int id;
    private String surName;
    private String name;
    private String patronymic;
    private String adress;
    private int cardNumber;
    private String accountNumber;


    //Builder Pattern
    public static class Builder {
        {
            ++ids;
        }

        private final int id = ids;

        private String surName;
        private String name = "";
        private String patronymic = "";
        private String adress = "";
        private int cardNumber;
        private String accountNumber;

        public Builder(String surName) {
            this.surName = surName;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPatronymic(String patronymic) {
            this.patronymic = patronymic;
            return this;
        }

        public Builder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public Builder setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Customer build() {

            return new Customer(this);
        }


    }

    private Customer(Builder builder) {
        id = builder.id;
        surName = builder.surName;
        name = builder.name;
        patronymic = builder.patronymic;
        adress = builder.adress;
        cardNumber = builder.cardNumber;
        accountNumber = builder.accountNumber;
    }


    public String getSurName() {
        return surName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n");
        sb.append("NAME: ").append(surName).append(" ").append(name).append(" ").append(patronymic).append("\n");
        sb.append("Adress: ").append(adress).append("\n");
        sb.append("Number Card: ").append(cardNumber).append("\n");
        sb.append("Number Account: ").append(accountNumber).append("\n");
        return sb.toString();
    }

}


class UtilMethods {


    public List<Customer> getCustomersDiap(List<Customer> customers, int first, int last) {
        List<Customer> customersClone = new ArrayList<Customer>();

        for (Customer customer : customers) {
            if (customer.getCardNumber() >= first && customer.getCardNumber() <= last) {
                customersClone.add(customer);
            }
        }
        return customersClone;
    }

    public void printCustomersAll(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }

    }

    public void sortCustomersSurNameABS(List<Customer> customers) {

        Collections.sort(customers, new Comparator<Customer>() {
            public int compare(Customer fullName1, Customer fullName2) {
                return fullName1.getSurName().compareToIgnoreCase(fullName2.getSurName());
            }
        });


    }

}
