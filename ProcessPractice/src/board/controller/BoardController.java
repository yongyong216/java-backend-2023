package board.controller;

import java.util.List;

import board.common.constant.HttpStatus;
import board.dto.request.board.PostBoardDto;
import board.dto.response.ResponseDto;
import board.dto.response.board.GetBoardListResponseDto;
import board.dto.response.board.GetBoardResponseDto;
import board.dto.response.board.PostBoardResponsDto;
import board.service.BoardService;

public class BoardController {

	private BoardService boardService;
	
	public BoardController() {
		boardService = new BoardService();
		
	}
	
	// 인증 및 인과
	// 인증 - 누군지?
	// 인과 - 이사람이 권한이 있는지?

	public void postBoard(PostBoardDto dto) {
		if(dto.auth()) {
			System.out.println(HttpStatus.UNAUTHORIZED);  
			return;
		}
	if(dto.vaild()) {
		System.out.println(HttpStatus.BAD_REQUEST);
		return;
	}
	ResponseDto<PostBoardResponsDto> response = boardService.postBoard(dto);
	System.out.println(response.toString());
	
	
	
	}
	
	public void getBoardList() { //최신게시물
		ResponseDto<List<GetBoardListResponseDto>> response = boardService.getBoardList();
		System.out.println(response.toString());
	}
	
	public void getBoard(int boardNumber) {
		
		if(boardNumber <= 0) {
			System.out.println(HttpStatus.BAD_REQUEST);
			return;
		
		}
		ResponseDto<GetBoardResponseDto> response = 
				boardService.getBoard(boardNumber);
		System.out.println(response.toString());
		
	}
	
	
}
