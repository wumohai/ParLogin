package LoginInter;

import javax.jws.WebService;

@WebService
public interface LoginInterface {

	public boolean Login(String userNameString, String passWordString);
}
