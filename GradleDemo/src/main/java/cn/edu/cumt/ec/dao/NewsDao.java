package cn.edu.cumt.ec.dao;

import cn.edu.cumt.ec.entity.News;
import java.util.List;
/**
 * 面向接口的编程，首先是要设计接口
 * @author Administrator
 *
 */
public interface NewsDao {
	public boolean add(News news);
	public boolean delete(News news);
	public boolean update(News oldNews,News newNews);
	public List<News> getAll();
	public News getById(int id);
}
