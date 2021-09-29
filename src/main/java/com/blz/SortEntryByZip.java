package com.blz;

import java.util.Comparator;

public class SortEntryByZip implements Comparator<Contacts> {
    public int compare(Contacts contact1, Contacts contact2) {
        return (int) (contact1.getZip() - contact2.getZip());
    }
}
