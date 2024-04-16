package com.geomhwein.go.creator.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.geomhwein.go.command.HomeworkVO;
import com.geomhwein.go.command.EducationGroupVO;

@Mapper
public interface CreatorMapper {

	public void makeHomework(HomeworkVO vo);
	

	public int getApplyCount();

	public EducationGroupVO getApply(int i);


	public List<HomeworkVO> getHomeworkDone(String userId);


	public void setUserScore(@Param("userId")String userId,@Param("newScore") int newScore);


	public int getUserScore(String userId);


	public void deleteAns(int asmtAnsNo);


	

}
