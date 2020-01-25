package redischool.Lesson16;

import java.util.Objects;

public class Customer {
    final String firstName;
    final String lastName;
    final String dateOfBirth;
    final String address;
    final String tel;

    public Customer(String firstName, String lastName, String dateOfBirth, String address, String tel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return  Objects.equals(lastName, customer.lastName) &&
                Objects.equals(dateOfBirth, customer.dateOfBirth);

    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
