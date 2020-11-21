package ru.geekbrains.dungeon;

import com.badlogic.gdx.math.MathUtils;
import ru.geekbrains.dungeon.units.Unit;

public class BattleCalc {
    public static int attack (Unit attacker, Unit target) {
        return attacker.getDamage();
    }
    public static int checkCounterAttack (Unit attacker, Unit target) {
        if (MathUtils.random()<0.25f){
            return target.getDamage();
        }
        return 0;
    }
}

