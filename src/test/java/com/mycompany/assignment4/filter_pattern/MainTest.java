/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment4.filter_pattern;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author syedahmed
 */
public class MainTest {

    private List<Person> persons;

    @BeforeEach
    public void setUp() {
        persons = new ArrayList<>();
        persons.add(new Person("Robert", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));
    }

    @Test
    public void testPersonGetters() {
        Person person = new Person("Robert", "Male", "Married");
        assertEquals("Robert", person.getName());
        assertEquals("Male", person.getGender());
        assertEquals("Married", person.getMaritalStatus());
    }

    @Test
    public void testCriteriaMale() {
        Criteria male = new CriteriaMale();
        List<Person> result = male.meetCriteria(persons);

        assertEquals(3, result.size());
        assertEquals(List.of("Robert", "Mike", "Bobby"),
                result.stream().map(Person::getName).toList());
    }

    @Test
    public void testCriteriaFemale() {
        Criteria female = new CriteriaFemale();
        List<Person> result = female.meetCriteria(persons);

        assertEquals(2, result.size());
        assertEquals(List.of("Laura", "Diana"),
                result.stream().map(Person::getName).toList());
    }

    @Test
    public void testCriteriaSingle() {
        Criteria single = new CriteriaSingle();
        List<Person> result = single.meetCriteria(persons);

        assertEquals(3, result.size());
        assertEquals(List.of("Diana", "Mike", "Bobby"),
                result.stream().map(Person::getName).toList());
    }
}
