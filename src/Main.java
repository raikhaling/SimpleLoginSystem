
public class Main {

	public static void main(String[] args) {
		IDandPassword idandpasswords = new IDandPassword();
		
		LoginPage loginPage = new LoginPage(idandpasswords.getLoginInfo());

	}

}
