package com.jhta.project.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.project.dao.ProposalDao;
import com.jhta.project.vo.ProposalVo;
@Service
public class ProposalService {
	@Autowired
	private ProposalDao proDao;
	public List<ProposalVo> selectList() {
		List<ProposalVo> list = proDao.selectList();
		System.out.println("service:"+list);
		return list;
	}
	
	public int totalRowNum() {
		int totalRowNum=proDao.totalRowNum();
		return totalRowNum;
	}
	
	public ProposalVo getinfo(int proNum){
		return proDao.getinfo(proNum);
	}
	
	//startPageRow~ endPageRow �꽕�젙�뿉 留욊쾶 �뜲�씠�꽣 �꽆寃⑥＜�뒗 �븿�닔
	public List<ProposalVo> getRowNums(HashMap<String, Object> map) {
		List<ProposalVo> list=proDao.getRowNums(map);
		return list;
	}
	//게시판 상세에서 다음글 불러오는 함수
	public ProposalVo getNextTitle(int proNum) {
		return proDao.getNextTitle(proNum);
	}
	//게시판 상세에서 이전글 불러오는 함수
	public ProposalVo getPreTitle(int proNum) {
		System.out.println(proNum);
		return proDao.getPreTitle(proNum);
	}
	
	
}