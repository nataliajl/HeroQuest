package br.unicamp.aluno.models.Character.Monster;

import br.unicamp.aluno.models.Character.Character;
import br.unicamp.aluno.models.Dice;
import br.unicamp.aluno.models.Item.Weapon;

public class Skeleton extends Monster {
    private Weapon weapon;
    public Skeleton(int x, int y, Weapon weapon) {
        super(x, y, 2,1,3,2); //definir pontos com zero
        this.weapon = weapon; // gerar aleatóriamente aqui?
//        addAttackDice(weapon.getAttackBonus());
    }

    public void hit(Character character, Dice dice) {
        int attackBonus = weapon.getAttackBonus();
        addAttackDice(attackBonus);
        super.hit(character, dice);
        removeAttackDice(attackBonus);
    }

    @Override
    public boolean isOnSight(Character character) {
        int x = this.getPositionX() + (getCurrentDirection().getTraceable().getPositionX() * weapon.getWeaponReach()); // pega direção atual e multiplica pelo alcance da arma somando com a coordenada atual para projetar ataque
        int y = this.getPositionY() + (getCurrentDirection().getTraceable().getPositionY() * weapon.getWeaponReach());

        if (character.getPositionX() > this.getPositionX() && character.getPositionX() <= x) //verifica se personagem esta a frente de monstro ou no alcance da arma em x
            if (character.getPositionY() > this.getPositionY() && character.getPositionY() <= y)
                return  true;

        return false;
    }
    
    @Override
	public String toString() {
		return "SK";
	}

}