package cn.ssm.service;

import cn.ssm.po.Person;

public interface PersonService {
	public Person selectByPrimaryKey(int personuid) throws Exception;
}
