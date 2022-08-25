package com.lastesteam.portalsgie;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private long id;
    private String profile;

    private List<Transaction> Transactions;

    public Employee(long id, String profile, List<Transaction> transactions) {
        this.id = id;
        this.profile = profile;
        Transactions = new ArrayList<Transaction>(transactions);
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }


}
