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
public class AndCriteria implements Criteria {
        
   private Criteria criteria;
    private Criteria otherCriteria;
    
    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    
    @Override
    public List<Person> meetCriteria (List<Person> persons) {
    List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
    
}
    

