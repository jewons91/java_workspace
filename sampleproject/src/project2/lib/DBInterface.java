package project2.lib;

import java.util.ArrayList;
import java.util.HashMap;

public interface DBInterface {
	public ArrayList<ContactVo> select();
	
	public HashMap<String, ContactVo> select(String searchName);
	
	public int insert(ContactVo contactVo);
	
	public int update(ContactVo contactVo);
	
	public int delete(String name);
}
