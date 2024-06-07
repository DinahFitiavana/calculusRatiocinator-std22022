package com.example.calculusratiocinator.affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vérité extends AffirmationParent {
    public Vérité(String affirmation) {
        super(affirmation);
    }

    @Override
    public Boolean evaluerAffirmation() {
        return true;
    }
}
