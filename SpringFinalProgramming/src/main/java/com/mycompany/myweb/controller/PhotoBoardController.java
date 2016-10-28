package com.mycompany.myweb.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myweb.dto.FreeBoard;
import com.mycompany.myweb.dto.PhotoBoard;
import com.mycompany.myweb.service.PhotoBoardService;

@Controller
@RequestMapping("/photoboard")
public class PhotoBoardController{
	
	@Autowired
	private PhotoBoardService photoBoardService;
	
	
	@RequestMapping("/list")
	public String list(String pageNo, Model model, HttpSession session){
		
		int intPageNo = 1;
		if ( pageNo == null ) {
			pageNo = (String) session.getAttribute("pageNo");
			if ( pageNo != null ) {
				intPageNo = Integer.parseInt(pageNo);
			}
		} else {
			intPageNo = Integer.parseInt(pageNo);
		}
		session.setAttribute("pageNo", String.valueOf(intPageNo));
		

		
		int rowsPerPage=8;
		int pagesPerGroup=5;
		int totalBoardNo=photoBoardService.getCount();
		
		int totalPageNo=totalBoardNo/rowsPerPage+((totalBoardNo%rowsPerPage!=0)?1:0);
		int totalGroupNo=totalPageNo/pagesPerGroup+((totalPageNo%pagesPerGroup!=0)?1:0);
		
		int groupNo=(intPageNo-1)/pagesPerGroup+1;
		int startPageNo=(groupNo-1)*pagesPerGroup+1;
		int endPageNo=startPageNo+pagesPerGroup-1;
		if(groupNo==totalGroupNo){
			endPageNo=totalPageNo;
		}
		
		List<PhotoBoard> list=photoBoardService.list(intPageNo, rowsPerPage);
		model.addAttribute("list", list);
		model.addAttribute("pageNo", intPageNo);
		model.addAttribute("rowsPerPage", rowsPerPage);
		model.addAttribute("pagesPerGroup", pagesPerGroup);
		model.addAttribute("totalBoardNo", totalBoardNo);
		model.addAttribute("totalPageNo", totalPageNo);
		model.addAttribute("totalGroupNo", totalGroupNo);
		model.addAttribute("groupNo", groupNo);
		model.addAttribute("startPageNo", startPageNo);
		model.addAttribute("endPageNo", endPageNo);
		return "photoboard/list";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(PhotoBoard photoBoard){
		return "photoboard/write";
	}
	
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(PhotoBoard photoBoard, HttpSession session){
		try{
		String mid=(String)session.getAttribute("login");
		photoBoard.setBwriter(mid);
		photoBoard.setOriginalfile(photoBoard.getPhoto().getOriginalFilename());
		
		String savedfile=new Date().getTime()+photoBoard.getPhoto().getOriginalFilename(); //그시점의 유일한 시간을 붙혀줘서 저장되는 파일이름이 유일해지도록 
		photoBoard.setSavedfile(savedfile);
		String realpath=session.getServletContext().getRealPath("/WEB-INF/photo/"+savedfile);
	
		photoBoard.getPhoto().transferTo(new File(realpath)); //실제파일데이타는여기에저장
		
		
		photoBoard.setMimetype(photoBoard.getPhoto().getContentType()); //파일종류얻기
		
		int result=photoBoardService.write(photoBoard);  //디비에는 원래파일이름. 저장된파일이름, 파일종류저장
		  //jsp이름이니까 freeBoard 객체 사용가능
		
		return "redirect:/photoboard/list";  //재요청 경로니까 freeBoard객체 사용못한다.
		
		}catch(Exception e){
			e.printStackTrace();
			return "photoboard/write";
		}
		
	
	}
	@RequestMapping("/showPhoto")
	public void showPhoto(String savedfile, HttpServletRequest request, HttpServletResponse response){
		try{
		String fileName=savedfile;
		
		/*fileName=URLEncoder.encode(fileName,"UTF-8"); //파일네임을 UTF-8로 인코딩!  한글->%30%60 %43%32 이런식으로 16진수로 변환
		response.setHeader("Content-Disposition", "attachment; filename=\""+fileName+"\"");  //response에 새로운 해더 추가/ 첨부파일, 보여주지말고 그냥 다운로드해라 라는뜻
	           이것은 브라우저에서 보여주지않고 강제로 다운로드 할 경우*/
		
		String mimeType=request.getServletContext().getMimeType(fileName);
		response.setContentType("image/jpeg");
		
		OutputStream os=response.getOutputStream();
		
		String filePath=request.getServletContext().getRealPath("/WEB-INF/photo/"+fileName);
		FileInputStream is=new FileInputStream(filePath);
		
		byte[] values=new byte[1024];
		int byteNum=-1;
		while((byteNum=is.read(values))!=-1){
			os.write(values, 0, byteNum);
		}
		os.flush();
		is.close();
		os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@RequestMapping("/info")
	public String info(int bno, Model model){
		PhotoBoard photoBoard=photoBoardService.info(bno);
		photoBoard.setBhitcount(photoBoard.getBhitcount()+1);
		photoBoardService.modify(photoBoard);
		model.addAttribute("photoboard", photoBoard);
		return "photoboard/info";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String modifyForm(int bno, Model model){
		PhotoBoard photoBoard=photoBoardService.info(bno);
		model.addAttribute("photoboard",photoBoard);
		return "photoboard/modify";
	}
	
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(PhotoBoard photoBoard){
		PhotoBoard dbPhotoBoard=photoBoardService.info(photoBoard.getBno());
		photoBoard.setBhitcount(dbPhotoBoard.getBhitcount());
		photoBoardService.modify(photoBoard);
		return "redirect:/photoboard/list";
	}
	
	@RequestMapping("/remove")
	public String remove(int bno){
		photoBoardService.remove(bno);
		return "redirect:/photoboard/list";
	}
	
	
}
