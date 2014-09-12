package com.ap.tako.model;


import com.ap.tako.entity.Tracks;

/**
 * 
 * @author wangcg
 * 歌曲详细信息
 */
public class TracksInfo extends Tracks{

	private static final long serialVersionUID = -2696632930468008047L;
	//专辑名称
	private String album_name;
	//专辑 hex
	private String album_hex;
	
	//上传用户
	private String user;
	//歌手名
	private String people_name;
	//歌手id
	private int people_id;
	
	public TracksInfo(Tracks tracks){
		this.setAlbum_id(tracks.getAlbum_id());
		this.setAudio_content_type(tracks.getAudio_content_type());
		this.setAudio_file_name(tracks.getAudio_file_name());
		this.setAudio_file_size(tracks.getAudio_file_size());
		this.setAudio_updated_at(tracks.getAudio_updated_at());
		this.setBitrate(tracks.getBitrate());
		this.setCreated_at(tracks.getCreated_at());
		this.setDeleted_at(tracks.getDeleted_at());
		this.setDuration(tracks.getDuration());
		this.setExtension(tracks.getExtension());
		this.setHex(tracks.getHex());
		this.setId(tracks.getId());
		this.setName(tracks.getName());
		this.setNumber(tracks.getNumber());
		this.setStatus(tracks.getStatus());
		this.setTags_count(tracks.getTags_count());
		this.setUpdated_at(tracks.getUpdated_at());
		this.setUser_id(tracks.getUser_id());
		
	}
	
	
	public String getAlbum_name() {
		return album_name;
	}
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPeople_name() {
		return people_name;
	}
	public void setPeople_name(String people) {
		this.people_name = people;
	}


	public String getAlbum_hex() {
		return album_hex;
	}
	public void setAlbum_hex(String album_hex) {
		this.album_hex = album_hex;
	}

	public int getPeople_id() {
		return people_id;
	}
	public void setPeople_id(int people_id) {
		this.people_id = people_id;
	}

						
	
	
	
}
