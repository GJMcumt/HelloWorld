<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@ page import="java.util.*,javax.sql.*,javax.naming.*,cn.edu.cumt.ec.entity.*,cn.edu.cumt.ec.service.*,cn.edu.cumt.ec.dao.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>c3p0 DAOWebDemo</title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
<%
try {	        
			NewsDao ndj=new NewsDaoJDBCImpl();
	        NewsService ns=new NewsService();
	        ns.setNewDao(ndj);
	        List<News> newsList= ns.getAll();
	        for(News news:newsList){
	        	out.println(news.getTitle());
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
		}
%>
</body>
</html>