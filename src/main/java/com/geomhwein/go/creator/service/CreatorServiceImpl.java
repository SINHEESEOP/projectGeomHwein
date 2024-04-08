package com.geomhwein.go.creator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geomhwein.go.command.HomeworkVO;

@Service("creatorService")
public class CreatorServiceImpl implements CreatorService{
	
	@Autowired
	private CreatorMapper creatorMapper;

	@Override
	public void makeHomework(HomeworkVO vo) {
		
		creatorMapper.makeHomework(vo);
		
	}
	
}
