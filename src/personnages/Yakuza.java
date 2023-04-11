package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		gagnerArgent(victime.getArgent());
		reputation = getReputation() + 1;
		parler("j'ai piqué les " + victime.seFaireExtorquer() + " sous de " + victime.getNom() + ", ce qui me fait "
				+ getArgent() + " sous dans ma poche. Hi ! Hi !");

	}

	public int perdre() {
		int argentLocal = getArgent();
		perdreArgent(getArgent());
		reputation--;
		parler("j'ai perdu mon duel et mes " + argentLocal + " sous, snif...j'ai déshonoré le clan de " + clan);
		return argentLocal;
	}

	public int gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? je l'ai dépouillé ses "
				+ gain + " sous.");
		return gain;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+clan);
		
	}
}
