package cn.ssm.service;

import java.util.Map;

import cn.ssm.po.Person;

public interface SignInService {
	
	public Person signIn(Map<String,String> map) throws Exception;
	
	public Person selectByLoginId(String loginid)throws Exception;
    
	public Person selectByEmail(String email)throws Exception;
	
	public void insertPerson(Map<String,String> map)throws Exception;

	
}
