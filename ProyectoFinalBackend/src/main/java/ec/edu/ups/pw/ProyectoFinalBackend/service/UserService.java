package ec.edu.ups.pw.ProyectoFinalBackend.service;

import java.util.List;

import ec.edu.ups.pw.ProyectoFinalBackend.bussines.UserManagement;
import ec.edu.ups.pw.ProyectoFinalBackend.model.User;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/user")
public class UserService {
	
	@Inject
	UserManagement um;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getUsers() {
		List<User> users = this.um.getUsers();
		return Response.ok(users).build();
	}
}
