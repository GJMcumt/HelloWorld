package cn.edu.cumt.ec.entity;
/**
 * 实体
 * @author Administrator
 *
 */
public class News {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private String title;
}
