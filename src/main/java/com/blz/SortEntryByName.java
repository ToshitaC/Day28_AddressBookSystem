package com.blz;

import java.util.Comparator;

public class SortEntryByName {
    public int compare(Contact contact1, Contact contact2) {
        return (contact1.getFirstName() + " " + contact1.getLastName())
                .compareTo(contact2.getFirstName() + " " + contact2.getLastName());
    }
}
