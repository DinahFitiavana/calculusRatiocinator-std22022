package com.example.calculusratiocinator.affirmation;

public class Ou extends Conjonction{
    public Ou(AffirmationParent premièreAffirmationParent, AffirmationParent deuxièmeAffirmationParent) {
        super(premièreAffirmationParent, deuxièmeAffirmationParent,
                premièreAffirmationParent.getAffirmation()+" ou "+deuxièmeAffirmationParent.getAffirmation());
    }

    @Override
    public Boolean evaluerAffirmation() {
        Boolean valeurPremièreAffirmation = getPremièreAffirmationParent().evaluerAffirmation();
        Boolean valeurDeuxièmeAffirmation = getDeuxièmeAffirmationParent().evaluerAffirmation();

        return valeurPremièreAffirmation || valeurDeuxièmeAffirmation;
    }
}
