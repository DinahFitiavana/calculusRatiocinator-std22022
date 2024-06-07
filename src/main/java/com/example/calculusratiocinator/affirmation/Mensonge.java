package com.example.calculusratiocinator.affirmation;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Mensonge extends AffirmationParent {
    public Mensonge(String affirmation) {
        super(affirmation);
    }

    @Override
    public Boolean evaluerAffirmation() {
        return false;
    }
}
