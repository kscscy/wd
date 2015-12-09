package wd.dao;

import java.util.List;
import java.util.Map;

import wd.domain.User;

public interface UserDao {

	public List<User> selectList(Map<String,Object> paramMap);
	
	int insert(User user);
	
	int delete(Map<String, Object> paramMap);
	
	int update(User user);
	
	User selectOne(String id);
	
	User login(Map<String, Object> paramMap);
}
