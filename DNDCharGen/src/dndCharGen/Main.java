package dndCharGen;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Main {
	public static String morality = "";
	public static String neutrality = "";
	public static String race = "";
	public static String clas = "";
	public static String bkg = "";
	public static String sex = "";

	public static void main(String[] args) {

		Object[] options = { "Done", "Reroll" };
		int pick = 1;
		while (pick == 1) {
			roll();
			int strength = diceRoll();
			pick = JOptionPane.showOptionDialog(null,
					"Your character shall be a " + neutrality + " " + morality
							+ " " + race + " " + clas + ".\n"
							+ "They originally was/is a/an " + bkg + ".\nStrength: "+strength+" (mod "+((strength-10)/2)+")\nDexterity: "+diceRoll()+"\nConstitution: "+diceRoll()+"\nIntelligence: "+diceRoll()+"\nWisdom: "+diceRoll()+"\nCharisma: "+diceRoll()
							+"\nNote: Make sure you " +"\nIs that what you want?",
					"Handy DnD 5e Character Generator v0.3",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, options, options[0]);
			if (pick == 0) {
				System.exit(0);
			}
		}
	}

	static int diceRoll(){
		Random rand = new Random();
		int output =0;
		int r1,r2,r3,r4;
		r1 = rand.nextInt((6 - 1) + 1) + 1;
		r2 = rand.nextInt((6 - 1) + 1) + 1;
		r3 = rand.nextInt((6 - 1) + 1) + 1;
		r4 = rand.nextInt((6 - 1) + 1) + 1;
		Integer[] rolls = {r1,r2,r3,r4};
		Arrays.sort(rolls);
		output = rolls[1]+rolls[2]+rolls[3];
		return output;
	}
	
	static void roll() {
		int ranMorality = 1 + (int) (Math.random() * ((3 - 1) + 1)); // range:1-3
		int ranNeutrality = 1 + (int) (Math.random() * ((3 - 1) + 1)); // range:1-3
		int ranRace = 1 + (int) (Math.random() * ((9 - 1) + 1));// range:1-9
		int ranClass = 1 + (int) (Math.random() * ((12 - 1) + 1));// range:1-12
		int ranBackground = 1 + (int) (Math.random() * ((13 - 1) + 1));// range:1-13
		int ranGender = 1 + (int) (Math.random() * ((2 - 1) + 1)); // range:1-2
		if (ranGender == 1) {
			sex = "He";
		} else if (ranGender == 2) {
			sex = "She";
		}
		if (ranMorality == 1) {
			morality = "Evil";
		} else if (ranMorality == 2) {
			morality = "Neutral";
		} else if (ranMorality == 3) {
			morality = "Good";
		}

		if (ranNeutrality == 1) {
			neutrality = "Chaotic";
		} else if (ranNeutrality == 2) {
			neutrality = "Neutral";
		} else if (ranNeutrality == 3) {
			neutrality = "Lawful";
		}
		if (ranNeutrality == 2 && ranMorality == 2) {
			neutrality = "True";
		}

		if (ranRace == 1) {
			race = "Dwarf";
		} else if (ranRace == 2) {
			race = "Elf";
		} else if (ranRace == 3) {
			race = "Halfling";
		} else if (ranRace == 4) {
			race = "Human";
		} else if (ranRace == 5) {
			race = "Dragonborn";
		} else if (ranRace == 6) {
			race = "Half-Elf";
		} else if (ranRace == 7) {
			race = "Half-Orc";
		} else if (ranRace == 8) {
			race = "Gnome";
		} else if (ranRace == 9) {
			race = "Tiefling";
		}

		if (ranClass == 1) {
			clas = "Barbarian";
		} else if (ranClass == 2) {
			clas = "Bard";
		} else if (ranClass == 3) {
			clas = "Cleric";
		} else if (ranClass == 4) {
			clas = "Druid";
		} else if (ranClass == 5) {
			clas = "Fighter";
		} else if (ranClass == 6) {
			clas = "Monk";
		} else if (ranClass == 7) {
			clas = "Paladin";
		} else if (ranClass == 8) {
			clas = "Ranger";
		} else if (ranClass == 9) {
			clas = "Rogue";
		} else if (ranClass == 10) {
			clas = "Sorcerer";
		} else if (ranClass == 11) {
			clas = "Warlock";
		} else if (ranClass == 12) {
			clas = "Wizard";
		}

		if (ranBackground == 1) {
			bkg = "Acolyte";
		} else if (ranBackground == 2) {
			bkg = "Charlatan";
		} else if (ranBackground == 3) {
			bkg = "Criminal";
		} else if (ranBackground == 4) {
			bkg = "Entertainer";
		} else if (ranBackground == 5) {
			bkg = "Folk Hero";
		} else if (ranBackground == 6) {
			bkg = "Guild Artisan";
		} else if (ranBackground == 7) {
			bkg = "Hermit";
		} else if (ranBackground == 8) {
			bkg = "Noble";
		} else if (ranBackground == 9) {
			bkg = "Outlander";
		} else if (ranBackground == 10) {
			bkg = "Sage";
		} else if (ranBackground == 11) {
			bkg = "Sailor";
		} else if (ranBackground == 12) {
			bkg = "Soldier";
		} else if (ranBackground == 13) {
			bkg = "Urchin";
		}

	}

}
