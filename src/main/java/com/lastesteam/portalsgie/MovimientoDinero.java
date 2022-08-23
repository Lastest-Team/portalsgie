package com.lastesteam.portalsgie;

public class MovimientoDinero {
    private long id;
    private String concept;
    private double amount;
    /*private User user;
    private Enterprise enterprise;
    */
    public MovimientoDinero(long id, String concept, double amount /*,User user, Enterprise enterprise*/) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        /*
        this.user = user;
        this.enterprise = enterprise;W
        */
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    /*
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }*/

    public void showMovementMoney(){
        System.out.println("ID");
        System.out.println(getId());
        System.out.println("Concept");
        System.out.println(getConcept());
        System.out.println("Amount");
        System.out.println(getAmount());
        System.out.println("-------------");
    }
}
