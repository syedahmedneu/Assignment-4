/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author syedahmed
 */
public class Main {
    
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
    
    public static void printPersons(List<Person > persons){
    for (Person person : persons) {
        System.out.println("Person : [ Name : " + person.getName () + ", Gender : " + person.getGender () + ", Marital Status : " + person.getMaritalStatus() + " ]"); 
    } 
}
    
}
