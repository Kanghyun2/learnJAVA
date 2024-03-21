package test;

public class IdPw {
	private String id;
	private String pw;

	public IdPw(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public boolean idpwCheck(String inputId, String inputPw) {
		if (id.equals(inputId) && pw.equals(inputPw)) {
			return true;
		} else {
			return false;
		}
	}
}
