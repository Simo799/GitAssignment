package ro.ase.csie.clase;

public class AngajatCompanie implements InterfataGestionareAngajat{
	 
	private String numeAngajat;
	private int salariuAngajat;
	private String taskDorit;
	private static int valoareMarire=200;
	public String getNumeAngajat() {
		return numeAngajat;
	}

	public void setNumeAngajat(String numeAngajat) {
		this.numeAngajat = numeAngajat;
	}

	public int getSalariuAngajat() {
		return salariuAngajat;
	}

	public void setSalariuAngajat(int salariuAngajat) {
		this.salariuAngajat = salariuAngajat;
	}

	public String getTaskDorit() {
		return taskDorit;
	}
	public void setTaskDorit(String taskDorit) {
		this.taskDorit = taskDorit;
	}

	public AngajatCompanie(String numeAngajat, int salariuAngajat, String taskDorit) {
		super();
		this.numeAngajat = numeAngajat;
		this.salariuAngajat = salariuAngajat;
		this.taskDorit = taskDorit;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Numele angajatului este ");
		sb.append(this.numeAngajat);
		sb.append(" si are salariul ");
		sb.append(this.salariuAngajat);
		sb.append(", acesta dorind sa primeasca ca task: ");
		sb.append(this.taskDorit);
		return sb.toString();
	}

	@Override
	public double marireSalariu() {
		return this.salariuAngajat+this.valoareMarire;
	}
}