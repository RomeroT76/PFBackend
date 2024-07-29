package ec.edu.ups.pw.ProyectoFinalBackend.dao;

import java.util.List;

import ec.edu.ups.pw.ProyectoFinalBackend.model.Book;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class BookDAO {
	
	@PersistenceContext
	EntityManager em;
	
	public Book read(int id) {
		Book book = this.em.find(Book.class, id);
		return book;
	}
	
	public List<Book> getAll() {
		String jpql = "SELECT c FROM User c";
		Query query = this.em.createQuery(jpql, Book.class);
		return query.getResultList();
	}
	
	public void insert(Book book) {
		this.em.persist(book);
	}
	
	public void update(Book book) {
		this.em.merge(book);
	}
	
	public void delete(int id) {
		Book book = this.read(id);
		this.em.remove(book);
	}
}
