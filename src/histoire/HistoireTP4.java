package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
	Humain prof = new Humain("Prof","kombucha",54);
	prof.direBonjour();
	prof.acheter("une boisson",12);
	prof.boire();
	prof.acheter("un jeu",2);
	prof.acheter("kimono",50);
	
	Commercant marco = new Commercant("Marco","th�",20);
	marco.direBonjour();
	marco.seFaireExtorquer();
	marco.recevoir(15);
	marco.boire();
	
	Yakuza noir = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
	noir.direBonjour();
	noir.extorquer(marco);
	
	Ronin roro = new Ronin("Roro","shochu",60);
	roro.direBonjour();
	roro.donner(marco);
	
	roro.provoquer(noir);
	
	
	
		
		
		
	}
	
}
 