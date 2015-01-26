package RegisterImplement;

import java.util.HashMap;

import javax.jws.WebService;

import com.demo.File.ReadPassWD;
import com.demo.File.WriteFile;

import RegisterInterface.RegisterInter;

@WebService(endpointInterface = "RegisterInterface.RegisterInter",
			serviceName = "RegisterImp")
public class RegisterImp implements RegisterInter {

	@Override
	public Boolean register(String username, String passwd) {
		HashMap<String, String> userinfo = new HashMap<>();
		ReadPassWD.ReadToMap(userinfo);
		if(userinfo.get(username) != null) return false;
		
		WriteFile.writeinfo(username, passwd);
		return true;
	}



}
