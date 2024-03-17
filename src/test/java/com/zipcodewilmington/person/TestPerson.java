package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedEyeColor = "";
        String expectedCityBorn = "";
        String expectedPetsName = "";
        Integer expectedHeight = Integer.MAX_VALUE;
        Integer expectedYearBorn = Integer.MAX_VALUE;


        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualEyeColor = person.getEyeColor();
        String actualCityBorn = person.getCityBorn();
        String actualPetsName = person.getPetsName();;
        Integer actualHeight = person.getHeight();
        Integer actualYearBorn = person.getYearBorn();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedEyeColor,actualEyeColor);
        Assert.assertEquals(expectedCityBorn, actualCityBorn);
        Assert.assertEquals(expectedPetsName, actualPetsName);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedYearBorn, actualYearBorn);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCityBorn() {
        //Given
        Person person = new Person();
        String expected = "Wilmington";

        //When
        person.setCityBorn(expected);
        String actual = person.getCityBorn();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        //Given
        Person person = new Person();
        String expected = "Brown";

        //When
        person.setEyeColor(expected);
        String actual = person.getEyeColor();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPetsName() {
        //Given
        Person person = new Person();
        String expected = "Lexi";

        //When
        person.setPetsName(expected);
        String actual = person.getPetsName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetYearBorn() {
        //Given
        Person person = new Person();
        Integer expected = 1992;

        //When
        person.setYearBorn(expected);

        //Then
        Integer actual = person.getYearBorn();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        //Given
        Person person = new Person();
        Integer expected = 175;

        //When
        person.setHeight(expected);

        //Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }
}
