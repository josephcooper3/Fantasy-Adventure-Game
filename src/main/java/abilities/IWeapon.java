package abilities;

import beings.Enemy;

public interface IWeapon {

    public String attack(Enemy target, int multiplier);

    public String getType();

}
