import java.util.HashMap;

public class IDandPassword {
	HashMap<String, String> loginInfo = new HashMap<>();
	IDandPassword(){
		loginInfo.put("Nabin", "12345");
		loginInfo.put("Rabin", "12345");
		loginInfo.put("Sabin", "12345");
	}
	
	protected HashMap getLoginInfo() {
		return loginInfo;
	}
	
}
