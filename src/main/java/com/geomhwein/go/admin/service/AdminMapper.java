package com.geomhwein.go.admin.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.geomhwein.go.command.AdminVO;
import com.geomhwein.go.command.ContentVO;
import com.geomhwein.go.command.UserDetailsVO;

@Mapper
public interface AdminMapper {

	public int mttrInsert  (AdminVO vo);
	public ArrayList<AdminVO> mttrList ();
	public AdminVO mttrDetail(int mttrSn);
	public void deleteMttr(int mttrSn);
	public ArrayList<UserDetailsVO> AllUserList();
	public ArrayList<ContentVO> ContentList();
	
}
