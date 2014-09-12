package com.ap.tako.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "people")
public class People implements Serializable {

	private static final long serialVersionUID = -4368541462645987098L;
	
//	`id` int(11) NOT NULL AUTO_INCREMENT,
//	  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
//	  `birthday` date DEFAULT NULL,
//	  `description` text COLLATE utf8_unicode_ci,
//	  `user_id` int(11) DEFAULT NULL,
//	  `person_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
//	  `extension` text COLLATE utf8_unicode_ci,
//	  `created_at` datetime DEFAULT NULL,
//	  `updated_at` datetime DEFAULT NULL,
//	  `photo_file_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
//	  `photo_content_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
//	  `photo_file_size` int(11) DEFAULT NULL,
//	  `photo_updated_at` datetime DEFAULT NULL,
//	  `deleted_at` datetime DEFAULT NULL,
//	  `albums_count` int(11) DEFAULT '0',
//	  `tracks_count` int(11) DEFAULT '0',
//	  `tags_count` int(11) DEFAULT '0',
//	  `found_on` date DEFAULT NULL,
//	  `hex` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
//	  `confirmed_at` datetime DEFAULT NULL,
//	  `genre` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
	
	private Long id;
	private String name;
	private Date birthday;
	private String description;
	private Long user_id;
	private String person_type;
	private String extension;
	private Date created_at;
	private Date updated_at;
	private String photo_file_name;
	private String photo_content_type;
	private Long photo_file_size;
	private Date photo_updated_at;
	private Date deleted_at;
	private Long albums_count;
	private Long tracks_count;
	private Long tags_count;
	private Date found_on;
	private String hex;
	private Date confirmed_at;
	private String genre;
	
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
	@Column(name = "birthday")
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name = "user_id")
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	@Column(name = "person_type")
	public String getPerson_type() {
		return person_type;
	}
	public void setPerson_type(String person_type) {
		this.person_type = person_type;
	}
	@Column(name = "extension")
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	@Column(name = "created_at")
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@Column(name = "updated_at")
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	@Column(name = "photo_file_name")
	public String getPhoto_file_name() {
		return photo_file_name;
	}
	public void setPhoto_file_name(String photo_file_name) {
		this.photo_file_name = photo_file_name;
	}
	@Column(name = "photo_content_type")
	public String getPhoto_content_type() {
		return photo_content_type;
	}
	public void setPhoto_content_type(String photo_content_type) {
		this.photo_content_type = photo_content_type;
	}
	@Column(name = "photo_file_size")
	public Long getPhoto_file_size() {
		return photo_file_size;
	}
	public void setPhoto_file_size(Long photo_file_size) {
		this.photo_file_size = photo_file_size;
	}
	@Column(name = "photo_updated_at")
	public Date getPhoto_updated_at() {
		return photo_updated_at;
	}
	public void setPhoto_updated_at(Date photo_updated_at) {
		this.photo_updated_at = photo_updated_at;
	}
	@Column(name = "deleted_at")
	public Date getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}
	@Column(name = "albums_count")
	public Long getAlbums_count() {
		return albums_count;
	}
	public void setAlbums_count(Long albums_count) {
		this.albums_count = albums_count;
	}
	@Column(name = "tracks_count")
	public Long getTracks_count() {
		return tracks_count;
	}
	public void setTracks_count(Long tracks_count) {
		this.tracks_count = tracks_count;
	}
	@Column(name = "tags_count")
	public Long getTags_count() {
		return tags_count;
	}
	public void setTags_count(Long tags_count) {
		this.tags_count = tags_count;
	}
	@Column(name = "found_on")
	public Date getFound_on() {
		return found_on;
	}
	public void setFound_on(Date found_on) {
		this.found_on = found_on;
	}
	@Column(name = "hex")
	public String getHex() {
		return hex;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	@Column(name = "confirmed_at")
	public Date getConfirmed_at() {
		return confirmed_at;
	}
	public void setConfirmed_at(Date confirmed_at) {
		this.confirmed_at = confirmed_at;
	}
	@Column(name = "genre")
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
	
	
}
