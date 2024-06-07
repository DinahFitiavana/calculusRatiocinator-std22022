package com.example.calculusratiocinator.affirmation;

public class Et extends Conjonction{
    public Et(AffirmationParent premièreAffirmationParent, AffirmationParent deuxièmeAffirmationParent) {
        super(premièreAffirmationParent, deuxièmeAffirmationParent,
            premièreAffirmationParent.getAffirmation()+" et "+deuxièmeAffirmationParent.getAffirmation());
    }

    @Override
    public Boolean evaluerAffirmation() {
        Boolean valeurPremièreAffirmation = getPremièreAffirmationParent().evaluerAffirmation();
        Boolean valeurDeuxièmeAffirmation = getDeuxièmeAffirmationParent().evaluerAffirmation();

        return valeurPremièreAffirmation && valeurDeuxièmeAffirmation;
    }
}
