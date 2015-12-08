package wd.domain;

import java.io.Serializable;
import java.sql.Date;

public class Event implements Serializable{

	private static final long serialVersionUID = 1L;
	
  protected	int no;
  protected String id;
  protected String title;
  protected Date creDate;
  protected String content;
  protected String photo;
	
	public Event() {
	}

	@Override
	public String toString() {
	return "Event [no=" + no + ", id=" + id + ", title=" + title + ", creDate=" + creDate + ", content=" + content
		+ ", photo=" + photo + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreDate() {
		return creDate;
	}

	public void setCreDate(Date creDate) {
		this.creDate = creDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}


}
