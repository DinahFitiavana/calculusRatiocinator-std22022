package com.example.calculusratiocinator.affirmation;

public class Donc extends Conjonction{
    public Donc(AffirmationParent premièreAffirmationParent, AffirmationParent deuxièmeAffirmationParent) {
        super(premièreAffirmationParent, deuxièmeAffirmationParent,
                premièreAffirmationParent.getAffirmation()+" donc "+deuxièmeAffirmationParent.getAffirmation());
    }

    @Override
    public Boolean evaluerAffirmation() {
        Boolean valeurPremièreAffirmation = getPremièreAffirmationParent().evaluerAffirmation();
        Boolean valeurDeuxièmeAffirmation = getDeuxièmeAffirmationParent().evaluerAffirmation();

        return !valeurPremièreAffirmation || valeurDeuxièmeAffirmation;
    }
}
