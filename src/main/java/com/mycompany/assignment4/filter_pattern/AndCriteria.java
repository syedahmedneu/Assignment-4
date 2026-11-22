/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Criteria that combines two criteria with logical AND.
 *
 * @author syedahmed
 * @version 1.0
 */
public class AndCriteria implements Criteria {
        
   /** First criteria applied; kept as the {@link Criteria} interface so any filter can be combined. */
   private Criteria criteria;
    /** Second criteria applied to the first one's result, giving AND semantics. */
    private Criteria otherCriteria;
    
    /**
     * Creates a combined criteria.
     *
     * @param criteria first criteria to apply
     * @param otherCriteria second criteria to apply
     */
    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    
    /**
     * Applies the first criteria, then the second to its result.
     *
     * @param persons persons to filter
     * @return persons meeting both criteria
     */
    @Override
    public List<Person> meetCriteria (List<Person> persons) {
    List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
    
}
    

