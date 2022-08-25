package com.lastesteam.portalsgie;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private long id;
    private Profile profile;
    private RoleName role;
    private List<Transaction> Transactions;

    public Employee(long id, Profile profile, List<Transaction> transactions, RoleName role) {
        this.id = id;
        this.profile = new Profile(profile.getImg(), profile.getPhone(),profile.getUser());
        Transactions = new ArrayList<Transaction>(transactions);
        this.role = role;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }


}
