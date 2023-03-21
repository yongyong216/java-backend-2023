package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
// UserController 입력은 받는것은 여기서
import board.controller.UserController;
import board.dto.request.board.PatchBoardDto;
import board.dto.request.board.PostBoardDto;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;
import board.dto.response.board.PatchBoardResponseDto;
import board.repository.BoardRepository;
import board.service.BoardService;

public class BoardApplication {

	private static UserController userController = new UserController();
	private static BoardController boardController = new BoardController();
	
	
	private static final String SIGN_UP = "POST / sign-up"; // 작성하다
	private static final String SIGN_IN = "POST / sign -in";
	
	private static final String POST_BOARD ="POST / board";
	
	private static final String GET_BOARD = "GET / board"; // 가져오다
	private static final String GET_BOARD_LIST = "GET / board/ list";
	
	private static final String PATCH_BOARD = "PATCH / board"; // 덮어씌우다
	
	private static final String DELETE_BOARD = "DELETE / board"; // 삭제하다
	
	
	public static void main(String[] args) {
		
		while (true) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("URL End point: ");
			String endPoint= scanner.nextLine();
			
			switch(endPoint) {
			
			case SIGN_UP :
				SignUpDto signUpDto = new SignUpDto();
				System.out.println("이메일 주소 : ");
				signUpDto.setEmail(scanner.nextLine());
				System.out.println("비밀번호 :");
				signUpDto.setPassword(scanner.nextLine());
				System.out.println("비밀번호 확인 : ");
				signUpDto.setPasswordCheck(scanner.nextLine());
				System.out.println("닉네임 : ");
				signUpDto.setNickname(scanner.nextLine());
				System.out.println("휴대전화 번호: ");
				signUpDto.setPhoneNumber(scanner.nextLine());
				System.out.println("주소 : ");
				signUpDto.setAddress(scanner.nextLine());
				System.out.println("상세 주소: ");
				signUpDto.setAddressDetail(scanner.nextLine());
				
//				System.out.println(signUpDto.toString());
				
				userController.signUp(signUpDto);
				break;
				
			case SIGN_IN:
				SignInDto signInDto = new SignInDto();
				System.out.println("이메일 주소 : ");
				signInDto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 : ");
				signInDto.setPassword(scanner.nextLine());
				
//				System.out.println(signInDto.toString());
				
				userController.signIn(signInDto);
				
				break;
			case POST_BOARD:
				PostBoardDto postBoardDto = new PostBoardDto();
				System.out.println("제목 : ");
				postBoardDto.setTitle(scanner.nextLine());
				System.out.println("내용 : ");
				postBoardDto.setContent(scanner.nextLine());
				System.out.println("이미지 : ");
				postBoardDto.setBoardImageUrl(scanner.nextLine());
				System.out.println("작성자 이메일 :");
				postBoardDto.setWriterEmail(scanner.nextLine());
				
			boardController.postBoard(postBoardDto);
			break;
				
			case GET_BOARD_LIST:
				
				boardController.getBoardList();
				break;
			
				
				
			case GET_BOARD:
				
				//외부에서 내부로 데이터를 받아온다. 
				//예외처리를 한다.
				int boardNumber = 0;
				try {
					System.out.print("게시물 번호 : ");
					 boardNumber = scanner.nextInt();
				}catch (Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.getBoard(boardNumber);
				break;
			case PATCH_BOARD:
				PatchBoard();
//				PatchBoardDto patchBoardDto = new PatchBoardDto();
//				try {
//					System.out.print("게시물 번호: ");
//					String patchBoardNumber = scanner.nextLine();
//					patchBoardDto.setBoardNumber(Integer.parseInt(patchBoardNumber));
//					System.out.print("제목 : ");
//					patchBoardDto.setTitle(scanner.nextLine());
//					System.out.print("내용 : ");
//					patchBoardDto.setContent(scanner.nextLine());
//					System.out.print("이미지 :");
//					patchBoardDto.setBoardImageUrl(scanner.nextLine());
//					System.out.print("이메일 : ");
//					patchBoardDto.setEmail(scanner.nextLine());
//				}catch(Exception exception) {
//					exception.printStackTrace();
//					continue;
//				}
//				
//				boardController.patchBoard(patchBoardDto);
				
				break;
				
			case DELETE_BOARD:
				int deleteBoardNumber = 0;
				String deleteEmail =null;

				try {
					System.out.println("게시물 번호 :");
					 deleteBoardNumber = Integer.parseInt(scanner.nextLine());
					 System.out.println("이메일 :");
					 deleteEmail = scanner.nextLine();
					
				}catch(Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.deleteBoard(deleteBoardNumber, deleteEmail);
				
				break;
				
			default:
				System.out.println(HttpStatus.NOT_FOUND);  //찾을 수 없을 때 404 Not Found 사용
				
				
				
			}
			
			
		}
		
		
	}

	private static void PatchBoard() {
		Scanner scanner = new Scanner(System.in);
		
		PatchBoardDto patchBoardDto = new PatchBoardDto();
		try {
			System.out.print("게시물 번호: ");
			String patchBoardNumber = scanner.nextLine();
			patchBoardDto.setBoardNumber(Integer.parseInt(patchBoardNumber));
			System.out.print("제목 : ");
			patchBoardDto.setTitle(scanner.nextLine());
			System.out.print("내용 : ");
			patchBoardDto.setContent(scanner.nextLine());
			System.out.print("이미지 :");
			patchBoardDto.setBoardImageUrl(scanner.nextLine());
			System.out.print("이메일 : ");
			patchBoardDto.setEmail(scanner.nextLine());
		}catch(Exception exception) {
			exception.printStackTrace();
			
		}
		
		boardController.patchBoard(patchBoardDto);
		
		
	}
	
}
