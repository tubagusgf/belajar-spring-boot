package com.jajal.object;

public class InfoObj {
	
	private int id;
	private String info;

	public InfoObj() {}
	
	public InfoObj(int id, String info) {
		super();
		this.id = id;
		this.info = info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "InfoObj [id=" + id + ", info=" + info + "]";
	}
	
}
