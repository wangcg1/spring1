package com.ap.tako.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "authorizations")
public class Authorizations implements Serializable {

	
	private static final long serialVersionUID = -4629466925478039761L;
	
//	`id` int(11) NOT NULL AUTO_INCREMENT,
//	  `authorable_type` varchar(255) DEFAULT NULL,
//	  `authorable_id` int(11) DEFAULT NULL,
//	  `person_id` int(11) DEFAULT NULL,
//	  `created_at` datetime DEFAULT NULL,
//	  `updated_at` datetime DEFAULT NULL,
	
	private Long id;
	private String authorable_type;
	private Long authorable_id;
	private int person_id;
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "authorable_type")
	public String getAuthorable_type() {
		return authorable_type;
	}
	public void setAuthorable_type(String authorable_type) {
		this.authorable_type = authorable_type;
	}
	
	@Column(name = "authorable_id")
	public Long getAuthorable_id() {
		return authorable_id;
	}
	public void setAuthorable_id(Long authorable_id) {
		this.authorable_id = authorable_id;
	}
	
	@Column(name = "person_id")
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	
	
	

	
}
