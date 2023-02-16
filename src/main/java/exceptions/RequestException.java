package exceptions;

import java.util.Objects;

public class RequestException extends RuntimeException {
	
	private String code;
	
	public RequestException(String code, String message) {
		super(message);
		this.code=code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestException other = (RequestException) obj;
		return Objects.equals(code, other.code);
	}

}
