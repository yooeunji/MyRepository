package com.mycompany.myweb2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myweb2.dao.PhotoBoardDao;
import com.mycompany.myweb2.dto.PhotoBoard;

@Component
public class PhotoBoardService {
	public static final int WRITE_SUCCESS=0;
	public static final int WRITE_FAIL=1;
	
	public static final int MODIFY_SUCCESS=0;
	public static final int MODIFY_FAIL=1;
	
	public static final int REMOVE_SUCCESS=0;
	public static final int REMOVE_FAIL=1;
	
	@Autowired
	private PhotoBoardDao photoBoardDao;
	

	public List<PhotoBoard> list(int pageNo, int rowsPerPage){
		return photoBoardDao.selectByPage(pageNo, rowsPerPage);
		
	}
	public int write(PhotoBoard PhotoBoard){
		int row=photoBoardDao.insert(PhotoBoard); 
		return WRITE_SUCCESS;
		
	}
	
	public int modify(PhotoBoard PhotoBoard){
		int row=photoBoardDao.update(PhotoBoard);
		if(row==0){
			return MODIFY_FAIL;
		}
		return MODIFY_SUCCESS;	
	}
	public int remove(int bno){
		int row=photoBoardDao.delete(bno);
		if(row==0){
			return REMOVE_FAIL;
		}
		return REMOVE_SUCCESS;	
		
	}
	public PhotoBoard info(int bno){
		return photoBoardDao.selectByBno(bno);
	}
	
	public int getCount(){
		return photoBoardDao.count();
	}
	
	
}