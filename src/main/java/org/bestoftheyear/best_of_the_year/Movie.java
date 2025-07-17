package org.bestoftheyear.best_of_the_year;

import java.io.Serializable;

public class Movie implements Serializable {

    private String id; 
    
    private String name;
   
    public Movie (){}

    public Movie (String id, String name){

        setId(id);
        setName(name);
        
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
    
    @Override

    public String toString(){

        return "Questo film ha id: " + id + " e titolo: " + name; 

    }

}
