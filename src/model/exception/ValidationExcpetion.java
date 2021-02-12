package model.exception;

import java.util.HashMap;
import java.util.Map;

public class ValidationExcpetion extends RuntimeException{

	
	private static final long serialVersionUID = 1L;

	private Map<String, String> erros = new HashMap<>();
	
	
	public ValidationExcpetion(String msg) {
		super(msg);
	}
	
	
	public Map<String, String> getErros(){
		return erros;
	}
	
	public void addErro(String nieldNam, String errorMessage) {
		erros.put(nieldNam, errorMessage);
	}
	
}
