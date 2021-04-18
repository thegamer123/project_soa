package rest.ressources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rest.entities.Employe;



@Path("emp")
public class GestionEmployes {

	static List<Employe> empList = new ArrayList<Employe>();

	

	@POST
	@Path("/add-emp")
	@Consumes(MediaType.APPLICATION_XML)
	public void addEmploye(Employe emp) {
		empList.add(emp);
	}

	@GET
	@Path("allEmps")
	@Produces(MediaType.APPLICATION_XML)
	public List<Employe> displayAllList() {
		return empList;
	}

	
	@GET
	@Path("/getEmpByCin/{cin}")
	@Produces(MediaType.APPLICATION_XML)
	public Employe searchEmpByCin(@PathParam("cin") String cin) {
		for(Employe e:empList) {
			if(e.getCin().equals(cin)){
				return e;
			}
		}
		return null;
	}

	
}
