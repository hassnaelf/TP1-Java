package gestionEleve;

import java.util.Collections;

public class TestEleve {


	public static void main(String[] args) {
		
		Eleve e1=new Eleve("maeryem");
		
		GroupeEleves groupe=new GroupeEleves();
		e1.ajouterNote(20);
		e1.ajouterNote(19);
		groupe.ajoutEleve(e1);
		
		e1=new Eleve("hassna");
		e1.ajouterNote(10);
		e1.ajouterNote(17);
		groupe.ajoutEleve(e1);
	
		e1=new Eleve("mohmmed");
		groupe.ajoutEleve(e1);
		System.out.println(g.cherche("meryem"));
		System.out.println();
		groupe.lister();
		
		System.out.println(g.getListe().get(0).compareTo(g.getListe().get(1)));
		Collections.sort(g.getListe());
		System.out.println(g.getListe());
		System.out.println(Collections.max(g.getListe()));

	}

}
