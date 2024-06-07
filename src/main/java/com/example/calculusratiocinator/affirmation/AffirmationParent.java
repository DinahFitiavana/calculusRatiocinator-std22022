package com.example.calculusratiocinator.affirmation;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AffirmationParent {
    private String affirmation;

    public AffirmationParent(String affirmation) {
        this.affirmation = affirmation;
    }

    public abstract Boolean evaluerAffirmation();
}
