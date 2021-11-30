package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {
    String description;

    public String getDescription() {
        return description;
    }

    public Skill() {}
}