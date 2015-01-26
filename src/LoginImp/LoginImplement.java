package LoginImp;

import java.util.HashMap;

import javax.jws.WebService;

import com.demo.File.ReadPassWD;

import LoginInter.LoginInterface;

@WebService(endpointInterface = "LoginInter.LoginInterface"
			, serviceName = "LoginImplement")
public class LoginImplement implements LoginInterface {


	public boolean Login(String userNameString, String passWordString) {

		HashMap<String, String> userinfo = new HashMap<>();
		ReadPassWD.ReadToMap(userinfo);
		
		if(userinfo.get(userNameString).equals(passWordString))
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
