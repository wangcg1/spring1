package com.ap.tako.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "albums")
public class Albums implements Serializable {
	
	private static final long serialVersionUID = 7666148997629736753L;
//	CREATE TABLE `albums` (
//			  `id` int(11) NOT NULL AUTO_INCREMENT,
//			  `name` varchar(255) DEFAULT NULL,
//			  `description` text,
//			  `released_on` date DEFAULT NULL,
//			  `absolute` tinyint(1) DEFAULT NULL,
//			  `tracks_count` int(11) DEFAULT '0',
//			  `tags_count` int(11) DEFAULT '0',
//			  `user_id` int(11) DEFAULT NULL,
//			  `genre` varchar(255) DEFAULT NULL,
//			  `extension` text,
//			  `hex` varchar(255) DEFAULT NULL,
//			  `deleted_at` datetime DEFAULT NULL,
//			  `created_at` datetime DEFAULT NULL,
//			  `updated_at` datetime DEFAULT NULL,
//			  `cover_file_name` varchar(255) DEFAULT NULL,
//			  `cover_content_type` varchar(255) DEFAULT NULL,
//			  `cover_file_size` int(11) DEFAULT NULL,
//			  `cover_updated_at` datetime DEFAULT NULL,
//			  PRIMARY KEY (`id`)
//			) ENGINE=InnoDB AUTO_INCREMENT=3132069 DEFAULT CHARSET=utf8;
	
	private Long id;
	private String name;
	private String hex;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "hex")
	public String getHex() {
		return hex;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	
	
	
	
}
