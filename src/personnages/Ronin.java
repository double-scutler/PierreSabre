package personnages;

public class Ronin extends Humain{
	private int honneur=1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		
	}
	public void donner(Commercant beneficiaire) {
		int charite=10*getArgent()/100;
		perdreArgent(charite);
		parler(beneficiaire.getNom()+" prend ces "+charite+" sous");
		beneficiaire.recevoir(charite);
	}

}
