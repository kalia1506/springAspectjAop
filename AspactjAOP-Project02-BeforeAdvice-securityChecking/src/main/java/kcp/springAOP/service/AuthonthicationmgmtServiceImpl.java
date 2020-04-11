package kcp.springAOP.service;

import org.springframework.beans.BeanUtils;

import kcp.springAOP.bo.UserBO;
import kcp.springAOP.dao.AuthonthicationDAO;
import kcp.springAOP.dto.UserDTO;

public class AuthonthicationmgmtServiceImpl implements AuthonthicationmgmtService {
	private ThreadLocal<UserDTO> threadLocal = new ThreadLocal<UserDTO>();
	private AuthonthicationDAO dao;

	public AuthonthicationmgmtServiceImpl(AuthonthicationDAO dao) {
		this.dao = dao;
	}

	@Override
	public void signOut() throws Exception {
		System.out.println("AuthonthicationmgmtServiceImpl.signOut()");
		threadLocal.remove();
	}

	@Override
	public Boolean validate() throws Exception {
		System.out.println("AuthonthicationmgmtServiceImpl.validate()");
		UserDTO dto = new UserDTO();
		UserBO bo = new UserBO();
		dto = threadLocal.get();
		System.out.println(dto.toString());
		BeanUtils.copyProperties(dto, bo);
		return dao.authenicationCheck(bo) == 0 ? false : true;
	}

	@Override
	public void signIn(String userName, String password) throws Exception {
		System.out.println("AuthonthicationmgmtServiceImpl.signIn()");
		UserDTO dto = null;
		dto = new UserDTO();
		dto.setUserName(userName);
		dto.setPassword(password);
		threadLocal.set(dto);
	}

}
