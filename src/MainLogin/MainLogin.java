package MainLogin;

import javax.xml.ws.Endpoint;

import LoginImp.LoginImplement;
import LoginInter.LoginInterface;
import RegisterImplement.RegisterImp;
import RegisterInterface.RegisterInter;

public class MainLogin {

	public static void main(String[] args) {
		
		LoginInterface loginInterface = new LoginImplement();
		String addrString = "http://127.0.0.1:9001/";
		// wsdl http://127.0.0.1:9001/LoginImp?wsdl
		Endpoint.publish(addrString + "LoginImp", loginInterface);
		System.out.println("Login publish succ, Addr: " + addrString);
		
		RegisterInter registerInter =  new RegisterImp();
		
		Endpoint.publish(addrString + "RegisterImp", registerInter);
		// wsdl http://127.0.0.1:9001/RegisterImp?wsdl
		System.out.println("RegisterImp publish succ ");

	}

}
