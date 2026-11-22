/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

/**
 * Immutable person record used by the filter pattern demo.
 *
 * @author syedahmed
 * @version 1.0
 */

public class Person {
    /** Person's name; identifies the person in output. */
    private String name; 
    /** Gender, used by gender-based criteria. */
    private String gender;
    /** Marital status, used by status-based criteria. */
    private String maritalStatus;
    
    /**
     * Creates a person.
     *
     * @param name the name
     * @param gender the gender
     * @param maritalStatus the marital status
     */
    public Person(String name, String gender, String maritalStatus){
    this.name = name;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
    }
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Gets the gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * Gets the marital status.
     *
     * @return the marital status
     */
    public String getMaritalStatus () {
        return maritalStatus;
    }
}
