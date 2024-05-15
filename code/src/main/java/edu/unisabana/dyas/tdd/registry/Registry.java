package edu.unisabana.dyas.tdd.registry;

import java.util.ArrayList;

public class Registry {
    private ArrayList<Person> people = new ArrayList<Person>();


    public RegisterResult registerVoter(Person p) {
        if(p.getAge() > 120 || p.getAge() < 0) {
            return RegisterResult.INVALID_AGE;
        }

        if(p.getAge() > 0 && p.getAge() < 18) {
            return RegisterResult.UNDERAGE;
        }

        if (!p.isAlive()) {
            return RegisterResult.DEAD;
        }

        if (searchPerson(p)){
            return RegisterResult.DUPLICATED;
        }

        people.add(p);
        return RegisterResult.VALID;
    }

    private boolean searchPerson(Person newPerson) {
        for(Person person : people){
            if(person.getId() == newPerson.getId()) {
                return true;
            }
        }

        return false;
    }
}