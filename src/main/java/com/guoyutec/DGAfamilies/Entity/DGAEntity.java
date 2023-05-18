package com.guoyutec.DGAfamilies.Entity;

public class DGAEntity {
    private int id;
    private String name;
    private String period;
    private String credits;
    private String description;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPeriod() {
        return this.period;
    }

    public String getCredits() {
        return this.credits;
    }

    public String getDescription() {
        return this.description;
    }
}
