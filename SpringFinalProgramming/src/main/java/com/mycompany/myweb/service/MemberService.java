package com.mycompany.myweb.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dao.MemberDao;
import com.mycompany.myweb.dto.Member;


@Component
public class MemberService {
	public static final int JOIN_SUCCESS=0;
	public static final int JOIN_FAIL=1;
	
	public static final int LOGIN_SUCCESS=0;
	public static final int LOGIN_FAIL_MID=1;
	public static final int LOGIN_FAIL_MPASSWORD=2;
	
	public static final int LOGOUT_SUCCESS=0;
	public static final int LOGOUT_FAIL_MID=1;
	
	public static final int MODIFY_SUCCESS=0;
	public static final int MODIFY_FAIL_MID=1;
	
	public static final int WITHDRAW_SUCCESS=0;
	public static final int WITHDRAW_FAIL=1;
	
	@Autowired
	private MemberDao memberDao;
	
	public int join(Member member){
		memberDao.insert(member);
		return JOIN_SUCCESS;
	}   //정상실행이냐 예외가발생하느냐 이거는 void
	
	public int login(String mid, String mpassword, HttpSession session){
		Member member=memberDao.selectByMid(mid);
		if(member==null){return LOGIN_FAIL_MID;}
		if(member.getMpassword().equals(mpassword)==false){return LOGIN_FAIL_MPASSWORD;}
		session.setAttribute("login", mid);
		return LOGIN_SUCCESS;
		
	}  //로그인 성공 정보를 세션에 저장한다, 한 클라이언트가 한 세션을 사용할때는 세션을지울때 사용자로부터 입력받아야할 내용은없다. 
	public int logout(HttpSession session){ //서비스에서 세션은 가급적으로 사용안하는게좋다. 종속 API는 왠만하면쓰지마
		session.removeAttribute("login");
		return LOGOUT_SUCCESS;
	} 
	
	public String findMpassword(String mid, String memail){
		Member member=memberDao.selectByMid(mid);
		if(member==null){return null;}
		if(member.getMemail().equals(memail)==false) return null;
		return member.getMpassword();
	}
	
	public String findMid(String memail){
		return memberDao.selectByMemail(memail);
	}
	
	
	public Member info(String mpassword, HttpSession session){
		String mid=(String) session.getAttribute("login");
		Member member=memberDao.selectByMid(mid);
		if(member.getMpassword().equals(mpassword)==false) return null;
		return member;
		
	} //로그인 한 상태에서 받는 정보이기때문에, 세션에 저장되어있는 로그인 정보를 이용하면된다. 
	
	public void modify(Member member){}
	
	public int withdraw(String mpassword, HttpSession session){
		String mid=(String)session.getAttribute("login");  //(오브젝이라서 스트링으로 형변환해줘야한다)
		Member member=memberDao.selectByMid(mid);
		if(member.getMpassword().equals(mpassword)==false) return WITHDRAW_FAIL;
		logout(session);
		memberDao.delete(mid);
		return WITHDRAW_SUCCESS;
	}
	public boolean isMid(String mid){}
	//성공 OR 예외 -> void
	//인포, 탈퇴...세션정보이용
}
