package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	private String parler() {
		String texte = "("+nom+") - ";
		return texte;
	}
	public void direBonjour() {
		System.out.println(parler()+"Bonjour ! je m'appele "+nom+" et j'aime boire du "+boissonFavorite);
		
	}
	public void boire() {
		System.out.println(parler()+"Mmmm, un bon verre de "+boissonFavorite+" ! GLOUPS !");
	}
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	public void perdreArgent(int perte) {
		assert argent>=perte:"argent insuffisante";
		argent-=perte;
	}
	public void acheter(String bien,int prix) {
		if (argent>=prix) {
			System.out.println(parler()+"j'ai "+argent+" sous en poche. je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			perdreArgent(prix);
		} else {
			System.out.println(parler()+"je n'ai plus que "+argent+" sous en poche. je ne peux meme pas m'offrir "+bien+" à "+prix+" sous");
		}
	}
	


}
