package com.example.calculusratiocinator;

import com.example.calculusratiocinator.affirmation.Affirmation;
import com.example.calculusratiocinator.affirmation.Conjonction;
import com.example.calculusratiocinator.affirmation.Mensonge;
import com.example.calculusratiocinator.affirmation.Vérité;

class CalculusRatiocinatorApplicationTests {

    public static void main(String[] args) {
        Vérité verite1 = new Vérité("Lou est beau");
        Mensonge mensonge1 = new Mensonge("Lou est pauvre");
        Affirmation affirmation1 = new Affirmation("Lou est généreux", null);

        testerAffirmation(verite1, mensonge1, affirmation1);
    }

    public static void testerAffirmation(Vérité verite1, Mensonge mensonge1, Affirmation affirmation1) {
        evaluer(new Conjonction(mensonge1, affirmation1, "et"));
        evaluer(new Conjonction(verite1, mensonge1, "donc"));
        evaluer(new Conjonction(mensonge1, affirmation1, "donc"));
        evaluer(new Conjonction(new Conjonction(verite1, affirmation1, "ou"), mensonge1, "donc"));
        evaluer(new Conjonction(
                new Conjonction(new Conjonction(verite1, affirmation1, "ou"), mensonge1, "donc"),
                new Conjonction(mensonge1, affirmation1, "ou"),
                "et"));
    }

    public static void evaluer(Conjonction conjonction) {
        Boolean resultat = conjonction.evaluerAffirmation();
        if (resultat == null) {
            System.out.println("Je ne sais pas");
        } else {
            if (resultat) {
                System.out.println("Vrai");
            } else {
                System.out.println("Faux");
            }
        }
    }
}
