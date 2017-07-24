package cn.edu.cumt.ec.service;

import java.util.List;

import cn.edu.cumt.ec.dao.NewsDao;
import cn.edu.cumt.ec.entity.News;
//面向接口的编程，其实就是按照约定编程，DAO：Data Access Object
public class NewsService {
	private NewsDao newsDao;
	//业务逻辑层：
	public void setNewDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}
	public boolean add(News news){
	    return	newsDao.add(news);		
	}
	public boolean delete(News news){
		return newsDao.delete(news);		
	}
	public boolean update(News oldNews,News newNews){
		return newsDao.update(oldNews, newNews);
	}
	public List<News> getAll(){
		return newsDao.getAll();
	}	
	public News getById(int id){
		return newsDao.getById(id);
	}
}
