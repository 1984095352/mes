package cn.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.PersonMapper;
import cn.ssm.po.Person;
import cn.ssm.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService{

	
	@Autowired
	private PersonMapper personMapper;
	@Override
	public Person selectByPrimaryKey(int personuid) throws Exception {
		// TODO Auto-generated method stub
		return  this.personMapper.selectByPrimaryKey(personuid);
	}

}
