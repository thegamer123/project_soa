package rest.entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Planning {
	public Planning() {
		super();
	}

	private String id;
	private int heuredebut;
	private int heurefin;
	private Date jour ;
	
	public String getid() {
		return id;
	}
	
	@XmlAttribute (name="id")
	public void setId(String id) {
		this.id = id;
	}
	public int getheuredebut() {
		return heuredebut;
	}
	
	@XmlElement (name="heuredebut")
	public void setNom(int heuredebut) {
		this.heuredebut = heuredebut;
	}
	public int getheurefin() {
		return heurefin;
	}
	
	@XmlElement (name="heurefin")
	public void setPrenom(int heurefin) {
		this.heurefin = heurefin;
	}
	@XmlElement (name="jour")
	public void setJour(Date jour) {
		this.jour = jour;
	}
	public Date getjour() {
		return jour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Planning other = (Planning) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
