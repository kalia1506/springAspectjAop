package kcp.springAOP.service;


public interface AuthonthicationmgmtService {
		void signOut()throws Exception;
		Boolean validate()throws Exception;
		void signIn(String userName, String password) throws Exception;
}
