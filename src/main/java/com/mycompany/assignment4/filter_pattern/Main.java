/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo of the filter pattern: filters a sample list of persons.
 *
 * @author syedahmed
 * @version 1.0
 */
public class Main {
    
    /**
     * Builds sample persons and prints males, females and single males.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
    List<Person> persons = new ArrayList<Person> () ;
    persons.add(new Person("Robert", "Male","Married"));
    persons.add (new Person ("Laura","Female","Married") ) ;
    persons.add (new Person ("Diana", "Female", "Single")) ; 
    persons.add (new Person ("Mike", "Male", "Single")); 
    persons.add (new Person ("Bobby", "Male", "Single"));
    
    Criteria male = new CriteriaMale () ;
    Criteria female = new CriteriaFemale ();
    Criteria single = new CriteriaSingle();
    Criteria singleMale = new AndCriteria (single,male);
    
    System.out.println ("Males: "); 
    printPersons (male.meetCriteria (persons) );
    System.out.println("\nFemales: "); 
    printPersons (female.meetCriteria (persons) );
    System.out.println("\nSingle Males: ") ; 
    printPersons (singleMale.meetCriteria (persons));
    }
    
    /**
     * Prints each person on its own line.
     *
     * @param persons persons to print
     */
    public static void printPersons(List<Person > persons){
    for (Person person : persons) {
        System.out.println("Person : [ Name : " + person.getName () + ", Gender : " + person.getGender () + ", Marital Status : " + person.getMaritalStatus() + " ]"); 
    } 
}
    
}
