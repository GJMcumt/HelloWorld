package cn.edu.cumt.ec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.edu.cumt.ec.entity.News;

public class NewsDaoJDBCImpl implements NewsDao {

	@Override
	public boolean add(News news) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(News news) {
		int i=0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo","root","123");
			
			PreparedStatement stmt=conn.prepareStatement("delete  from news_inf where news_id=?");
			stmt.setInt(1, news.getId());
			i= stmt.executeUpdate();		
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return i>0?true:false;
	}

	@Override
	public boolean update(News oldNews, News newNews) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<News> getAll() {
		// TODO Auto-generated method stub
		List<News> newsList=new ArrayList<News>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo","root","123");
			
			Statement stmt=conn.createStatement();
			ResultSet rs= stmt.executeQuery("select * from news_inf");
			while(rs.next()){
				News news=new News();
				news.setId(rs.getInt(1));
				news.setTitle(rs.getString(2));
				newsList.add(news);
			}
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return newsList;
	}

	@Override
	public News getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
