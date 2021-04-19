package rest.ressources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import rest.entities.Planning;

@Path("planning")
public class GestionPlanning {
	
	static List<Planning> plannings = new ArrayList<Planning>();
	
		@POST
		@Path("/add")
		@Consumes("application/xml")
		public String addPlanning(Planning e) {
			
			plannings.add(e);
			return "add successful";
		}
		
		@GET
		@Path("/get")
		@Produces("application/xml")
		public List <Planning> displayPlanning()
		{
			return plannings;
		}
		
		@PUT
		@Consumes("application/xml")		
		public String updatePlanning(Planning e){
			int index =plannings.indexOf(e);
			if (index!=-1){
				plannings.set(index, e);
				return "Planning updated";
			}
			return "Planning updated";
		}
		
		@DELETE
		@Path("delete/{id}")
		public String deletePlanning(@PathParam("id") String id){
			
			Iterator<Planning> it = plannings.iterator();
			while(it.hasNext())
			{
				it.next().getId().equals(id);
				it.remove();
				return "planning supprimé";
			}
			return "planning supprimé";
			
		}
}