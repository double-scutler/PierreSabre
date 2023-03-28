package personnages;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFavorite, int argent) {
		super(nom, "thé", argent);
	}
	public int seFaireExtorquer() {
		int argent_local=getArgent();
		perdreArgent(getArgent());
		System.out.println(parler()+"j'ai tout perdu! Le monde est trop injuste...");
		return argent_local;
		
	}
	public void recevoir(int argent) {
		gagnerArgent(argent);
		System.out.println(parler()+argent+" sous! je te remercie généreux donateur!");
	}

}

