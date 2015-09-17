package com.boot.bcapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book{
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String isbn;
    private String title;
    private String author;
    private String description;
    
    public Book() {}
    
    @Column(name = "ISBN")
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	 @Column(name = "Title")
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	 @Column(name = "Author")
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	 @Column(name = "Description")
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	 @Column(name = "id")
	public Long getId() {
		return id;
	}
	 
	 public void setId(Long id) {
		 this.id = id;
	 }
}
