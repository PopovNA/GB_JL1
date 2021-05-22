package lesson7;

import lesson7.online.DarkSoldier;
import lesson7.online.LightSoldier;

import java.util.Random;

public class HomeWorkApp7 {

    public static void main(String[] args) {

        Random random = new Random();

        Medic medic = new Medic("Medic", 0, 10, 50, 25);
        LightSoldier lightSoldier = new LightSoldier("LightSoldier", 15, 25f, 100f);
        DarkSoldier darkSoldier = new DarkSoldier("DarkSoldier", 20, 5f, 150f);

        medic.healTarget(lightSoldier, random.nextInt(medic.getMaxHeal()));
        medic.healTarget(darkSoldier, random.nextInt(medic.getMaxHeal()));

    }

}
