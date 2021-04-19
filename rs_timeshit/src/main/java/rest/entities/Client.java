package rest.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {
	
	
	public Client() {
		super();
	}
	
	private String cin;
	private String nom;
	private String prenom;
	private String codePostal;
	private String dob;
	private String addresse;
	private String genre;
	private String age;
	private String bankAccount;
	private String phone;
	
	public Client(String cin, String nom, String prenom, String codePostal, String dob, String addresse, String genre,
			String age, String bankAccount, String phone) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.codePostal = codePostal;
		this.dob = dob;
		this.addresse = addresse;
		this.genre = genre;
		this.age = age;
		this.bankAccount = bankAccount;
		this.phone = phone;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
