package personnages;



public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	public int seFaireExtorquer() {
		int argent_local=getArgent();
		perdreArgent(getArgent());
		parler("j'ai tout perdu! Le monde est trop injuste...");
		return argent_local;
		
	}
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+" sous! je te remercie généreux donateur!");
	}

}

