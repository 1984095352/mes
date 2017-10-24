package cn.ssm.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.PersonMapper;
import cn.ssm.po.Person;
import cn.ssm.service.SignInService;
@Service
public class SignInServiceImpl implements SignInService{
	
	@Autowired 
	private PersonMapper personMapper;
	@Override
	public Person signIn(Map<String,String> map) throws Exception {
		
		return personMapper.selectByLoginidAndPassword(map);
	}
	@Override
	public Person selectByLoginId(String loginid) {
		
		return personMapper.selectByLoginId(loginid);
	}
	@Override
	public Person selectByEmail(String email) {
		
		return personMapper.selectByEmail(email);
	}
	
	@Override
	public void insertPerson(Map<String, String> map) throws Exception {
		personMapper.insertPerson(map);
	
		
		
	}
	
}
