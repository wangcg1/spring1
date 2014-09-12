package com.ap.tako.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//+--------------------+--------------+------+-----+---------+----------------+
//| Field              | Type         | Null | Key | Default | Extra          |
//+--------------------+--------------+------+-----+---------+----------------+
//| id                 | int(11)      | NO   | PRI | NULL    | auto_increment |
//| name               | varchar(255) | YES  |     | NULL    |                |
//| number             | varchar(255) | YES  |     | NULL    |                |
//| album_id           | int(11)      | YES  | MUL | NULL    |                |
//| user_id            | int(11)      | YES  | MUL | NULL    |                |
//| tags_count         | int(11)      | YES  |     | 0       |                |
//| hex                | varchar(255) | YES  |     | NULL    |                |
//| status             | int(11)      | YES  |     | NULL    |                |
//| duration           | int(11)      | YES  |     | 0       |                |
//| bitrate            | int(11)      | YES  |     | 0       |                |
//| extension          | text         | YES  |     | NULL    |                |
//| created_at         | datetime     | YES  |     | NULL    |                |
//| updated_at         | datetime     | YES  |     | NULL    |                |
//| deleted_at         | datetime     | YES  |     | NULL    |                |
//| audio_file_name    | varchar(255) | YES  |     | NULL    |                |
//| audio_content_type | varchar(255) | YES  |     | NULL    |                |
//| audio_file_size    | int(11)      | YES  |     | NULL    |                |
//| audio_updated_at   | datetime     | YES  |     | NULL    |                |
//+--------------------+--------------+------+-----+---------+----------------+

@Entity
@Table(name = "tracks")
public class Tracks implements Serializable {

	private static final long serialVersionUID = 8857244873743538275L;
	private Long id;
	private String name;
	private String number;
	private Long album_id;
	private Long user_id;
	private Long tags_count;
	private String hex;
	private Long status;
	private Long duration;
	private Long bitrate;
	private String extension;
	private Date created_at;
	private Date updated_at;
	private Date deleted_at;
	private String audio_file_name;
	private String audio_content_type;
	private Long audio_file_size;
	private Date audio_updated_at;
	
	
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
	
	@Column(name = "number")
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Column(name = "album_id")
	public Long getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(Long album_id) {
		this.album_id = album_id;
	}
	
	@Column(name = "user_id")
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	@Column(name = "tags_count")
	public Long getTags_count() {
		return tags_count;
	}
	public void setTags_count(Long tags_count) {
		this.tags_count = tags_count;
	}
	@Column(name = "hex")
	public String getHex() {
		return hex;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	@Column(name = "status")
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	@Column(name = "duration")
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	@Column(name = "bitrate")
	public Long getBitrate() {
		return bitrate;
	}
	public void setBitrate(Long bitrate) {
		this.bitrate = bitrate;
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
	@Column(name = "deleted_at")
	public Date getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}
	@Column(name = "audio_file_name")
	public String getAudio_file_name() {
		return audio_file_name;
	}
	public void setAudio_file_name(String audio_file_name) {
		this.audio_file_name = audio_file_name;
	}
	@Column(name = "audio_content_type")
	public String getAudio_content_type() {
		return audio_content_type;
	}
	public void setAudio_content_type(String audio_content_type) {
		this.audio_content_type = audio_content_type;
	}
	@Column(name = "audio_file_size")
	public Long getAudio_file_size() {
		return audio_file_size;
	}
	public void setAudio_file_size(Long audio_file_size) {
		this.audio_file_size = audio_file_size;
	}
	@Column(name = "audio_updated_at")
	public Date getAudio_updated_at() {
		return audio_updated_at;
	}
	public void setAudio_updated_at(Date audio_updated_at) {
		this.audio_updated_at = audio_updated_at;
	}
	
	
	
	
	
	
	
}
