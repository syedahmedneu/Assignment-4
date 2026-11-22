/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Criteria selecting female persons.
 *
 * @author syedahmed
 * @version 1.0
 */
public class CriteriaFemale  implements Criteria {
    /**
     * Selects persons whose gender is female (case-insensitive).
     *
     * @param persons persons to filter
     * @return the female persons
     */
    @Override
    public List<Person> meetCriteria (List<Person> persons) { 
        List<Person> femalePersons = new ArrayList<Person>();
        
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE") ){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
    
}
