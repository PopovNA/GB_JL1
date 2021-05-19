package lesson7;

import lesson7.online.models.Soldier;

public class Medic extends Soldier {

    private int maxHeal;

    public Medic(String name, int attack, float defense, float hp, int maxHeal) {
        super(name, attack, defense, hp);
        this.maxHeal = maxHeal;
    }

    public int getMaxHeal() {
        return maxHeal;
    }
}
