package misterland.community.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import misterland.community.dao.ContactDAO;


@Service("contactService")
public class ContactServiceImpl implements ContactService{

	@Resource(name="contactDAO")
	private ContactDAO contactDAO;

//	@Override
//	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String selectNow() throws Exception {
		return contactDAO.selectNow();
	}

}
