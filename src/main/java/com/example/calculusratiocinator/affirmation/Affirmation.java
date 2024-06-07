package com.example.calculusratiocinator.affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Affirmation extends AffirmationParent{
    private Boolean statut;

    public Affirmation(String affirmation, Boolean statut) {
        super(affirmation);
        this.statut = statut;
    }

    @Override
    public Boolean evaluerAffirmation() {
        return statut;
    }
}
