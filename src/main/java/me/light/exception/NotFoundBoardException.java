package me.light.exception;

//일반 예외가 아니라 실행 예외로 처리해야함 그래서 runtime씀
public class NotFoundBoardException extends RuntimeException {
	
	private static final long serialVersionUID = 7121551049614331591L;

	public NotFoundBoardException(String message) {
		super(message);
	}
}
