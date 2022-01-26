package com.company;

public class Client {
    private String cname;
    private int id;
    //Constructs a Client with the given name and ID number
    public Client(String name, int idnum){
        cname = name;
        id = idnum;
    }
    // returns the Client's name
    public String getName(){
        return cname;
    }
    // returns the Client's id
    public int getID(){
        return id;
    }
    public String toString(){
        return cname + " " + id;
    }
    // returns 0 when this Client is equal to the other;
    //   a positive integer when this Client is greater than the other;
    //   a negative integer when this Client is less than the other
    //   Clients are first compared by name, then if the names
    //   are the same, by id
    public int compareClient(Client other){
        int c = cname.compareTo(other.cname);
        if(c != 0) return c;
        return id-other.id;
    }
}
