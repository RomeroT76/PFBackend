package ec.edu.ups.pw.ProyectoFinalBackend.bussines;

import java.util.List;

import ec.edu.ups.pw.ProyectoFinalBackend.dao.BookDAO;
import ec.edu.ups.pw.ProyectoFinalBackend.model.Book;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class BookManagement {
	
	@Inject
	BookDAO bookD;
	
	public Book getBook(int id) {
		return this.bookD.read(id);
	}
	
	public List<Book> getBooks() {
		return this.bookD.getAll();
	}
	
	public void insertBook(Book book) {
		this.bookD.insert(book);
	}
	
	public void updateBook(Book book) {
		this.bookD.update(book);
	}
	
	public void delete(int id) {
		this.bookD.delete(id);
	}
}
