package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        //create two Job objects using the empty constructor
        //use assertNotEquals to verify that the IDs of the
        //two objects are distinct
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertNotEquals("Ids should be distinct", test_job1.getId(), test_job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());

        assertTrue(test_job3.getName() instanceof String);
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job test_job4 = new Job("name1", new Employer("employer1"), new Location("location1"), new PositionType("position1"), new CoreCompetency("competency1"));
        Job test_job5 = new Job("name1", new Employer("employer1"), new Location("location1"), new PositionType("position1"), new CoreCompetency("competency1"));

        assertNotEquals("Jobs should not be equal if their IDs differ", test_job4, test_job5);
    }

    //when passed a Job object, it should return a string that contains
    //a blank line before and after the job info.

    //If a field is empty, the method should add "Data not available" after the label
    //Use assertEquals to verify that the characters are correct
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job6 = new Job("name2", new Employer("employer2"), new Location("location2"), new PositionType("position2"), new CoreCompetency("competency2"));
        String result = test_job6.toString();
        String lineSeparator = System.lineSeparator();

        //Checks that the first character is a new line
        assertEquals("The string should start with a new line", lineSeparator.charAt(0), result.charAt(0));

        //Checks that the last character is a new line
        assertEquals("The string should end with a new line", lineSeparator.charAt(lineSeparator.length() - 1), result.charAt(result.length() - 1));

    }

    //The string should contain a label for each field,
    //followed by the data stored in that field.
    //Each field should be on its own line
    //ex: ID: _____
    //ex: Name: _____
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job7 = new Job("name3", new Employer("employer3"), new Location("location3"), new PositionType("position3"), new CoreCompetency("competency3"));

        String result = test_job7.toString();

        String expected = System.lineSeparator() + "ID: " + test_job7.getId() + System.lineSeparator() +
                "Name: " + test_job7.getName() + System.lineSeparator() +
                "Employer: " + test_job7.getEmployer().getValue() + System.lineSeparator() +
                "Location: " + test_job7.getLocation().getValue() + System.lineSeparator() +
                "Position Type: " + test_job7.getPositionType().getValue() + System.lineSeparator() +
                "Core Competency: " + test_job7.getCoreCompetency().getValue() + System.lineSeparator();


        //Check that the string contains the right data for each field
        assertTrue("The string should contain the correct ID", result.contains("ID: " + test_job7.getId()));
        assertTrue("The string should contain the correct name", result.contains("Name: " + test_job7.getName()));
        assertTrue("The string should contain the correct employer", result.contains("Employer: " + test_job7.getEmployer().getValue()));
        assertTrue("The string should contain the correct location", result.contains("Location: " + test_job7.getLocation()));
        assertTrue("The string should contain the correct position type", result.contains("Position Type: " + test_job7.getPositionType().getValue()));
        assertTrue("The string should contain the correct core competency", result.contains("Core Competency: " + test_job7.getCoreCompetency().getValue()));

    }


    //If a field is empty, the method should add
    //"Data not available" after the label
    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job8 = new Job(
                "Software Developer",
                new Employer(""),
                null, // Location is null
                new PositionType(""),
                new CoreCompetency("")
        );

        String result = test_job8.toString();

        String expected = System.lineSeparator()
                + "ID: " + test_job8.getId() + System.lineSeparator()
                + "Name: Software Developer" + System.lineSeparator()
                + "Employer: Data not available" + System.lineSeparator()
                + "Location: Data not available" + System.lineSeparator()
                + "Position Type: Data not available" + System.lineSeparator()
                + "Core Competency: Data not available" + System.lineSeparator();

        assertEquals(expected, result);


    }
}
