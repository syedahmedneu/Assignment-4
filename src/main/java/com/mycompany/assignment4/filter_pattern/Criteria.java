/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

import java.util.List;

/**
 *
 * @author syedahmed
 */
public interface Criteria {
    
   public List<Person> meetCriteria(List<Person> list);
    
}
