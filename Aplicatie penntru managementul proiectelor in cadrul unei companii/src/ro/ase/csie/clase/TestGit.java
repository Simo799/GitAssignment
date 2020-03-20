package ro.ase.csie.clase;

public class TestGit {

	public static void main(String[] args) {
		System.out.println("Hello Git!");

		AngajatCompanie angajat=new AngajatCompanie("Ionel Rusu", 2000, "raport statistic");
		System.out.println(angajat);
		//angajat.marireSalariu();
		System.out.println("Angajatul o sa aiba urmatorul salariu dupa marire "+angajat.marireSalariu());
	}

}
