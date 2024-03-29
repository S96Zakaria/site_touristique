package com.site.module;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Photo implements Serializable{
	@Id
	@GeneratedValue	
	private Long id;
	private String path;
	@ManyToOne
	private Site site;
	
	
	
	public Photo() {
		super();
	}
	public Photo(Long id, String path) {
		super();
		this.id = id;
		this.path = path;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
}
