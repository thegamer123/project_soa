package rest.entities;



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
	private String jour ;
	

	public Planning(String id, int heuredebut, int heurefin, String jour) {
		super();
		this.id = id;
		this.heuredebut = heuredebut;
		this.heurefin = heurefin;
		this.jour = jour;
	}




	
	
	

	public String getId() {
		return id;
	}







	@XmlAttribute(name="id", required = true)
	public void setId(String id) {
		this.id = id;
	}








	public int getHeuredebut() {
		return heuredebut;
	}







	@XmlElement(name="heuredebut")
	public void setHeuredebut(int heuredebut) {
		this.heuredebut = heuredebut;
	}








	public int getHeurefin() {
		return heurefin;
	}







	@XmlElement(name="heurfin")
	public void setHeurefin(int heurefin) {
		this.heurefin = heurefin;
	}








	public String getJour() {
		return jour;
	}







	@XmlElement(name="jour")
	public void setJour(String jour) {
		this.jour = jour;
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
