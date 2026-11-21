/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

/**
 *
 * @author syedahmed
 */
import java.util.ArrayList;
import java.util.List;
public class CriteriaSingle implements Criteria {
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