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
	public void provoquer(Yakuza adversaire) {
		
		int force = honneur*2;
		if (force>=adversaire.getReputation()) {
			//le ronin gagne
			parler("je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			gagnerArgent(adversaire.getArgent());
			honneur++;
			parler("je t'ai eu petit yakuza!");
			adversaire.perdre();
			
		} else {
			perdreArgent(getArgent());
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(getArgent());
		}
	}
}
