package board.controller;

import board.common.constant.HttpStatus;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;
import board.dto.response.ResponseDto;
import board.dto.response.user.SignInResponseDto;
import board.service.UserService;

// 검증은 여기서 
public class UserController {

	private UserService userservice;
	      
	public  UserController() {
		userservice = new UserService();
	}
	
	
	public void signUp(SignUpDto dto) {
		
		if (dto.validate()) {
			System.out.println(HttpStatus.BAD_REQUEST);  // 400 Bad Request  웹 쓸때 필수 값을 정확히 받지 못했을 때 사용
			return;
			
		}
		
//		userservice.signUp(dto);
	
		ResponseDto<Boolean> response = userservice.signUp(dto);
		System.out.println(response.toString());
	
		
	}
	public void signIn(SignInDto dto) {
		if (dto.validate()) {
			System.out.println(HttpStatus.BAD_REQUEST);
			return;
		}
		ResponseDto<SignInResponseDto> response = userservice.signIn(dto);
		System.out.println(response.toString());
	}
    
	
}
