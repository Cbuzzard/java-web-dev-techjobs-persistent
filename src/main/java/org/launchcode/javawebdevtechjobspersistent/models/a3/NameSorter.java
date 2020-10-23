package org.launchcode.javawebdevtechjobspersistent.models.a3;


import java.util.Comparator;

public class NameSorter implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().toLowerCase().compareTo(o2.toString().toLowerCase());
    }

}
