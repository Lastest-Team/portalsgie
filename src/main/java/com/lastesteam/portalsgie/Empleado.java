package com.lastesteam.portalsgie;

public class Empleado {
    private long id;
    private String profile;

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

    public Empleado(long id, String profile) {
        this.id = id;
        this.profile = profile;
    }
}
