package com.xue.ehcache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.xue.ehcache.dao.TbUseMapper;
import com.xue.ehcache.entity.TbUse;

@Service
public class TbUseService {
	
	@Autowired
	private TbUseMapper useMapper;
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	@Cacheable(value="myCache",key="0")
	public TbUse getUseById(Integer id){
		return useMapper.selectByPrimaryKey(id);
	}
}
