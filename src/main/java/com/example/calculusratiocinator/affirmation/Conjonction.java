package com.example.calculusratiocinator.affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conjonction extends AffirmationParent{
    private AffirmationParent premièreAffirmationParent;
    private AffirmationParent deuxièmeAffirmationParent;

    public Conjonction(String affirmation, AffirmationParent premièreAffirmationParent,
                       AffirmationParent deuxièmeAffirmationParent) {
        super(affirmation);
        this.premièreAffirmationParent = premièreAffirmationParent;
        this.deuxièmeAffirmationParent = deuxièmeAffirmationParent;
    }
}
