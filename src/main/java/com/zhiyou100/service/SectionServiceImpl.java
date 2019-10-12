package com.zhiyou100.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.SectionMapper;
import com.zhiyou100.model.Section;

@Service
public class SectionServiceImpl implements SectionService {
	
	@Autowired
	private SectionMapper mapper;

	public List<Section> findAllSection() {
		// TODO Auto-generated method stub
		return mapper.findAllSection();
	}

}
