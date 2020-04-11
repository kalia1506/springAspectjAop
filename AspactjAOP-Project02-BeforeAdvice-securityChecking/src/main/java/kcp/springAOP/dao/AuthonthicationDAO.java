package kcp.springAOP.dao;

import kcp.springAOP.bo.UserBO;

public interface AuthonthicationDAO {
	public int authenicationCheck(UserBO bo) throws Exception;
}
