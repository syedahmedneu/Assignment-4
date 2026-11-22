/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

import java.util.ArrayList;
import java.util.List;
/**
 * Criteria selecting single persons.
 *
 * @author syedahmed
 * @version 1.0
 */
public class CriteriaSingle implements Criteria {
    /**
     * Selects persons whose marital status is single (case-insensitive).
     *
     * @param persons persons to filter
     * @return the single persons
     */
    @Override
    public List<Person> meetCriteria (List<Person> persons) { 
        List<Person> malePersons = new ArrayList<Person>();
        
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE") ){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}