package com.geomhwein.go.user.service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


import org.springframework.web.multipart.MultipartFile;

import com.geomhwein.go.util.Criteria;
import com.geomhwein.go.command.ComunityUploadVO;
import com.geomhwein.go.command.ReplyVO;
import com.geomhwein.go.command.UserDetailsVO;
import com.geomhwein.go.command.ComunityVO;
import com.geomhwein.go.command.HomeworkVO;
import com.geomhwein.go.command.QuestionVO;

import com.geomhwein.go.command.EducationGroupVO;
import com.geomhwein.go.command.GroupApplicationVO;


public interface UserService {

	public int comunityForm(ComunityVO vo , List<MultipartFile> list , Principal prin);
	public List<ComunityVO> getComunityList(Criteria cri);
	public ComunityVO getComunityDetail(int pst_ttl_no);
	public int comunityModifyForm(ComunityVO vo , List<MultipartFile> list , Principal prin);
	public int comunityDelete(int pst_ttl_no);
	public void updateHit(int pst_ttl_no);
	public int comunityTotal(Criteria cri);
	public List<ComunityUploadVO> getFile(int pst_ttl_no);
	public void replyAdd(ReplyVO vo);
	public List<HomeworkVO> getHomeworkList(String userId);
	public void addQuestion(QuestionVO vo);
	public int registCreator(String userName, String docsCode, String reason);
	public EducationGroupVO getGroup(int groupNo);
	public int getGroupCount();
	public void applyGroup(int groupNo, String username);
	public List<QuestionVO> getQuestionList(String username);
	public QuestionVO questionDetail(int qstn_no);
	public void questionModifyForm(QuestionVO vo);
	public void deleteQuestion(int qstnno);


	public UserDetailsVO getUserDetails (String userId);
	public ArrayList<EducationGroupVO> getAllEducationGroup(String userId);
//    public ArrayList< Map<String, Object> > getAllEducationGroup(String userId);

	public List<ReplyVO> getReplyList(int pst_ttl_no);
	public void replyUpdate(ReplyVO vo);
	public void replyDelete(int reply_no);
	public List<ReplyVO> getChildList(int parent_reply_no);
	public void replyCount(int pst_ttl_no);
	public void deleteCount(int pst_ttl_no);
	public  List<ReplyVO> replyFilter(int reply_no);
	public void replyStatus(int reply_no);
	public void allReplyDelete(int pst_ttl_no);
	public List<GroupApplicationVO> getGroupApplyList(String userId);
	public List<UserDetailsVO> getUserScoreList();

}
