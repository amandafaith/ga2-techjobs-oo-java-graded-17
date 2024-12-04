package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

 
    @Override
    public String toString() {
        String result = System.lineSeparator();
        result += "ID: " + getId() + System.lineSeparator();
        result += "Name: " + (name == null || name.isBlank() ? "Data not available" : name) + System.lineSeparator();
        result += "Employer: " + (employer == null || employer.getValue() == null || employer.getValue().isBlank() ? "Data not available" : employer.getValue()) + System.lineSeparator();
        result += "Location: " + (location == null || location.getValue() == null || location.getValue().isBlank() ? "Data not available" : location.getValue()) + System.lineSeparator();
        result += "Position Type: " + (positionType == null || positionType.getValue() == null || positionType.getValue().isBlank() ? "Data not available" : positionType.getValue()) + System.lineSeparator();
        result += "Core Competency: " + (coreCompetency == null || coreCompetency.getValue() == null || coreCompetency.getValue().isBlank() ? "Data not available" : coreCompetency.getValue()) + System.lineSeparator();
        return result;

    }

    
}
