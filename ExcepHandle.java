package com.exception;

class AgeNotElegibleException extends Exception{
	public AgeNotElegibleException(String msg){
		super(msg);
	}
}

class CustomException{
	public void create(int n) throws AgeNotElegibleException {
		if(n<18) {
			throw new AgeNotElegibleException("You are not eligible for voting");
		}
	}
}





public class ExcepHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomException cs = new CustomException();
		try {
			cs.create(6);
		} catch (AgeNotElegibleException e) {
			System.out.println(e.getMessage());
		}
	}

}
