package ec.edu.ups.pw.ProyectoFinalBackend.bussines;

import ec.edu.ups.pw.ProyectoFinalBackend.dao.BookDAO;
import ec.edu.ups.pw.ProyectoFinalBackend.dao.UserDAO;
import ec.edu.ups.pw.ProyectoFinalBackend.enums.Rol;
import ec.edu.ups.pw.ProyectoFinalBackend.model.Book;
import ec.edu.ups.pw.ProyectoFinalBackend.model.User;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Init {
	
	@Inject
	UserDAO userD;
	
	@Inject
	BookDAO bookD;
	
	@PostConstruct
	public void init() {
		
		User u = new User();
		u.setEmail("robertoart76x@gmail.com");
		u.setPassword("R123");;
		u.setRol(Rol.ADMIN);
		
		userD.insert(u);
		
		User u1 = new User();
		u1.setEmail("robertoart23x@gmail.com");
		u1.setRol(Rol.CLIENT);
		u1.setPassword("asd");
		
		userD.insert(u1);
		
		Book b = new Book();
		b.setName("aaa");
		b.setAuthor("bbb");
		b.setAvailability(true);
		b.setGenere("sss");
		b.setImage("ddd");
		
		bookD.insert(b);
	}

}