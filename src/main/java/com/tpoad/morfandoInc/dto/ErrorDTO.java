package com.tpoad.morfandoInc.dto;

import java.util.Objects;

public class ErrorDTO {

	private String code;
	private String message;
	
	public ErrorDTO () {}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private String code;
		private String message;
		
		private Builder() {}
		
		public Builder code(String code) {
			this.code=code;
			return this;
		}
		
		public Builder message(String message) {
			this.message=message;
			return this;
		}
		
		public ErrorDTO build() {
			ErrorDTO errordto =new ErrorDTO();
			errordto.setCode(this.code);
			errordto.setMessage(this.message);
			return errordto;
			
		}
		
		/**************/
		@Override
		public int hashCode() {
			return Objects.hash(code,message);					
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this == obj) {
				return true;
			}
			if(obj == null || getClass() != obj.getClass()) {
				return false;
			}
			ErrorDTO errordto = (ErrorDTO) obj;
			return Objects.equals(code,errordto.code) && message ==errordto.message;
		}
		
		@Override
		public String toString() {
			return "ErrorDTO{"+ "code="+code+ '\''+ ", message="+message+'}';
		}
	}
}
