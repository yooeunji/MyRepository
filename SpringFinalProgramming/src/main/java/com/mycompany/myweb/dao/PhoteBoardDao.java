package com.mycompany.myweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


import com.mycompany.myweb.dto.PhotoBoard;

@Component
public class PhoteBoardDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(PhotoBoard photoBoard){
		String sql="insert into photoboard(bno, btitle, bcontent, bwriter, bhitcount, bdate, originalfile, savedfile, mimetype) values(seq_photoboard_bno.nextval,?,?,?,0,sysdate,?,?,?)";
		int row=jdbcTemplate.update(
			sql, 
			photoBoard.getBtitle(),
			photoBoard.getBcontent(),
			photoBoard.getBwriter(),
			photoBoard.getOriginalfile(),
			photoBoard.getSavedfile(),
			photoBoard.getMimetype()
			
		);
		return row;
	}
	
	public int update(PhotoBoard photoBoard){
		String sql="update photoboard set btitle=?, bcontent=?, bhitcount=?, originalfile=?, savedfile=?, mimetype=? where bno=?";
		int row=jdbcTemplate.update(
				sql, 
				photoBoard.getBtitle(),
				photoBoard.getBcontent(),
				photoBoard.getBhitcount(),
				photoBoard.getOriginalfile(),
				photoBoard.getSavedfile(),
				photoBoard.getMimetype(),
				photoBoard.getBno()
			);
		return row;
	}
	
	public int delete(int bno){
		String sql="delete from photoboard where bno=?";
		int row=jdbcTemplate.update(sql, bno);
		return row;
	}
	
	public PhotoBoard selectByBno(int bno){
		String sql="select bno, btitle, bcontent, bwriter, bhitcount, bdate, originalfile, savedfile, mimetype from PhotoBoard where bno=?";
		List <PhotoBoard> list=jdbcTemplate.query(sql, new Object[]{bno}, new RowMapper<PhotoBoard>(){
			@Override
			public PhotoBoard mapRow(ResultSet rs, int row)throws SQLException{
				PhotoBoard PhotoBoard=new PhotoBoard();
				PhotoBoard.setBno(rs.getInt("bno"));
				PhotoBoard.setBtitle(rs.getString("btitle"));
				PhotoBoard.setBcontent(rs.getString("bcontent"));
				PhotoBoard.setBwriter(rs.getString("bwriter"));
				PhotoBoard.setBhitcount(rs.getInt("bhitcount"));
				PhotoBoard.setBdate(rs.getDate("bdate"));
				PhotoBoard.setOriginalfile(rs.getString("orinalfile"));
				PhotoBoard.setSavedfile(rs.getString("savedfile"));
				PhotoBoard.setMimetype(rs.getString("mimetype"));
		
				return PhotoBoard;
			}
		});
		return (list.size()!=0)? list.get(0) : null;
	}
	
	public List<PhotoBoard> selectByPage(int pageNo, int rowsPerPage){
		String sql="";
		sql+="select rn, bno, btitle, bhitcount, bdate, savedfile";
		sql+="from( ";
		sql+="select rownum as rn, bno, btitle, bhitcount, bdate, savedfile";
		sql+="from (select bno, btitle,  bhitcount, savedfile from PhotoBoard order by bno desc) ";
		sql+="where rownum<=? ";
		sql+=") ";
		sql+="where rn>=? ";
		
		List<PhotoBoard> list=jdbcTemplate.query(
				sql, 
				new Object[]{(pageNo*rowsPerPage),((pageNo-1)*rowsPerPage+1)},
				new RowMapper<PhotoBoard>(){
					@Override
					public PhotoBoard mapRow(ResultSet rs, int row)throws SQLException{
						PhotoBoard photoBoard=new PhotoBoard();
						photoBoard.setBno(rs.getInt("bno"));
						photoBoard.setBtitle(rs.getString("btitle"));
						photoBoard.setBhitcount(rs.getInt("bhitcount"));
						photoBoard.setSavedfile(rs.getString("savedfile"));
						return photoBoard;
					}
				}
				
		);
	return list;
	}
	
	public int count(){
		String sql="select count(*) from PhotoBoard";
		int count=jdbcTemplate.queryForObject(sql, Integer.class);   //integer가 언박싱되어 int에 저장
		return count;
	}
}
