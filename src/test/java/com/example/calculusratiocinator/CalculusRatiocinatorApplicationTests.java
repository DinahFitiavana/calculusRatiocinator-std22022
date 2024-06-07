package com.example.calculusratiocinator;

import com.example.calculusratiocinator.affirmation.*;

class CalculusRatiocinatorApplicationTests {

    public static void main(String[] args) {
        Vérité verite1 = new Vérité("Lou est beau");
        Mensonge mensonge1 = new Mensonge("Lou est pauvre");
        Affirmation affirmation1 = new Affirmation("Lou est généreux", null);

        testerAffirmation(verite1, mensonge1, affirmation1);
    }

    public static void testerAffirmation(Vérité verite1, Mensonge mensonge1, Affirmation affirmation1) {
        evaluer(new Et(mensonge1, affirmation1));
        evaluer(new Donc(verite1, mensonge1));
        evaluer(new Donc(mensonge1, affirmation1));
        evaluer(new Donc(new Ou(verite1, affirmation1), mensonge1));
        evaluer(new Et(new Ou(verite1, affirmation1), mensonge1));

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
