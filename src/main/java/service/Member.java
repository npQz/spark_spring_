package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Member {

  boolean getMemberCheck(HttpServletRequest request, HttpServletResponse response, String email, String pw) throws Exception;

}
