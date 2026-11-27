package com.marvellous.Marvellous_Portal.Entity;

public class BatchEntry
{
    private long id;
    private String name;
    private int fees;

    public long getId()
    { return id; }
    public void setId(long id)
    { this.id = id; }

    public String getName()
    { return name; }
    public void setName(String name)
    { this.name = name; }

    public int getFees()    //getter Method
    { return fees; }
    public void setFees(int fees)   // setter Method
    { this.fees = fees; }
}
