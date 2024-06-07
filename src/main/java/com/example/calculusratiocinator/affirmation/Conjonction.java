package com.example.calculusratiocinator.affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conjonction extends AffirmationParent{
    private AffirmationParent premièreAffirmationParent;
    private AffirmationParent deuxièmeAffirmationParent;
    private String conjonction;

    public Conjonction(AffirmationParent premièreAffirmationParent,
                       AffirmationParent deuxièmeAffirmationParent, String conjonction) {
        super(premièreAffirmationParent.getAffirmation()+" "+conjonction+" "+deuxièmeAffirmationParent.getAffirmation());
        this.premièreAffirmationParent = premièreAffirmationParent;
        this.deuxièmeAffirmationParent = deuxièmeAffirmationParent;
        this.conjonction = conjonction;
    }

    @Override
    public Boolean evaluerAffirmation() {
        Boolean valeurPremièreAffirmation = premièreAffirmationParent.evaluerAffirmation();
        Boolean valeurDeuxièmeAffirmation = deuxièmeAffirmationParent.evaluerAffirmation();

        if (valeurPremièreAffirmation == null || valeurDeuxièmeAffirmation == null) {
            return null;
        }

        if (conjonction == "et") {
            return valeurPremièreAffirmation && valeurDeuxièmeAffirmation;
        } else if (conjonction == "ou") {
            return valeurPremièreAffirmation || valeurDeuxièmeAffirmation;
        } else if (conjonction == "donc") {
            return !valeurPremièreAffirmation || valeurDeuxièmeAffirmation;
        } else {
            return null;
        }
    }
}
