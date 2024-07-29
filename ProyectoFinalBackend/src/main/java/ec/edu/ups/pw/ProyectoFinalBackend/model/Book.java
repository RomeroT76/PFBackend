package ec.edu.ups.pw.ProyectoFinalBackend.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Book implements Serializable{
	@Id
	@Column(name = "b_id")
	private int id;
	
	@Column(name = "b_name")
	private String name;
	
	@Column(name = "b_description")
	private String description;
	
	@Column(name = "b_genere")
	private List<String> categories;
	
	@Column(name = "b_image")
	private String image;
	
	@Column(name = "b_authors")
	private List<String> authors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
}
