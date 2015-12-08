package wd.dao;

import java.util.List;
import java.util.Map;

import wd.domain.Event;

public interface EventDao {

	List<Event> selectList(Map<String,Object> paramMap);

  int insert(Event event);

  int delete(Map<String,Object> paramMap);
  
  int update(Event event); 

	Event selectOne(int no);
}
