package com.addressbook;

public class Contact {
    public Contact(String firstName, String lastName, String address, String city, String state, int zip,
                   long phoneNumber, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Usecase 7
     * Check whether the two contacts are same or not on the basis of their names
     *
     */
    @Override
    public boolean equals(Object object) {
        boolean result = false;
        if(object == this) {
            return true;
        }
        Contact contact = (Contact)object;
        if(contact.firstName.equals(this.firstName) && contact.lastName.equals(this.lastName)) {
            result = true;
        }
        return result;
    }
    @Override
    public String toString() {
        return this.getFirstName() + this.getLastName() + "," + this.getAddress() + "," + this.getState() + "," + this.getCity() + "," + this.getZip() + "," + this.getPhoneNumber() + "," + this.getEmail();
    }
}
