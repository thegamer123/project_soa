package rest.ressources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rest.entities.Client;

@Path("clients")
public class GestionClients {

	static List<Client> clients = new ArrayList<Client>();

	@POST
	@Path("/add")
	@Consumes("application/xml")
	public String addClient(Client e) {

		clients.add(e);
		return "Client Added successfully";
	}

	@GET
	@Path("/get")
	@Produces("application/xml")
	public List<Client> displayClients() {
		return clients;
	}

	@PUT
	@Consumes("application/xml")
	public String updateClient(Client e) {
		int index = clients.indexOf(e);
		if (index != -1) {
			clients.set(index, e);
			return "Client updated";
		}
		return "Client updated";
	}

	@DELETE
	@Path("id")
	public String deleteClient(@PathParam("id") String id) {

		Iterator<Client> it = clients.iterator();
		while (it.hasNext()) {
			it.next().getCin().equals(id);
			it.remove();
			return "Client is deleted Successfully";
		}
		return "Client is deleted Successfully";
	}

	@GET
	@Path("/filterByAge/{age}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Client> fitlerByAge(@PathParam("age") int age) {
		List<Client> result = clients.stream().filter(it -> it.getAge() == age).collect(Collectors.toList());
		return result;
	}

	@GET
	@Path("/filterByzipCode/{zipCode}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Client> fitlerByZipCode(@PathParam("zipCode") String zipCode) {
		List<Client> result = clients.stream().filter(it -> it.getCodePostal().equals(zipCode)).collect(Collectors.toList());
		return result;
	}

	@GET
	@Path("/getMaleOlderThan20")
	@Produces(MediaType.APPLICATION_XML)
	public List<Client> getMaleOlderThan20() {
		List<Client> result = clients.stream().filter(it -> (it.getGenre().equals("male") && it.getAge() > 20))
				.collect(Collectors.toList());
		return result;
	}

}
