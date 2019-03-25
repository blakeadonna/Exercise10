package com.blakey.exercise10;
import java.util.*;


class Contact{
    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact: " +
                "Name: " + name +
                ", Email: " + email;
    }
}

class Collection implements  Iterable<Contact>{

    List<Contact> contactCollection;
    public Collection(List<Contact> contactCollection){
        this.contactCollection = contactCollection;
    }

    @Override
    public Iterator<Contact> iterator(){
        return contactCollection.iterator();
    }
}
class Main{
    public static void main(String[] args) {
        List<Contact> contactCollection
                = Arrays.asList(new Contact("Kaede Takagaki","infinote@chaldea.net"),
                new Contact("Yui Ootsuki","yomnrkms@chaldea.net"),
                new Contact("Shiki Ichinose","jeonghee1414@chaldea.net"));
        Collection collection1 = new Collection(contactCollection);

        for(Contact num: collection1){
            System.out.println("Name: " + num.getName()+ " | Email: "+ num.getEmail());

        }
    }
}