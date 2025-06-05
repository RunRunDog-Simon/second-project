package org.example.model;

public class Animal {
    protected String species;

    public Animal(String species){
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat(){
        System.out.println(species + "正在吃");
    }
}



