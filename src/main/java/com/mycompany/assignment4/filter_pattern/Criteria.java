/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

import java.util.List;

/**
 * Filter contract: selects the persons that satisfy a rule.
 *
 * @author syedahmed
 * @version 1.0
 */
public interface Criteria {
    
   /**
    * Filters a list of persons.
    *
    * @param list persons to filter
    * @return the persons that meet the criteria
    */
   public List<Person> meetCriteria(List<Person> list);
    
}
