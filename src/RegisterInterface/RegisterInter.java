package RegisterInterface;

import javax.jws.WebService;

@WebService
public interface RegisterInter {

	public Boolean register(String username, String passwd);
}
