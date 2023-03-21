package board.dto.request.board;

public class PatchBoardDto {

	private int boardNumber;
	private String title;
	private String content;
	private String boardImageUrl;
	private String email;   //사용자가 수정 권한이 있는지 없는지 확인 해야함.
	
	

	public PatchBoardDto() {
	}


	public int getBoardNumber() {
		return boardNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getBoardImageUrl() {
		return boardImageUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setBoardImageUrl(String boardImageUrl) {
		this.boardImageUrl = boardImageUrl;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PatchBoardDto(int boardNumber, String title, String content, String boardImageUrl, String email) {
		this.boardNumber = boardNumber;
		this.title = title;
		this.content = content;
		this.boardImageUrl = boardImageUrl;
		this.email = email;
	}
	@Override
	public String toString() {
		return "PatchBoardDto [boardNumber=" + boardNumber + ", title=" + title + ", content=" + content
				+ ", boardImageUrl=" + boardImageUrl + ", email=" + email + "]";
	}

	public boolean valid() {
		boolean result =
				this.boardNumber <= 0 ||
				this.title.isBlank() ||
				this.content.isBlank();	
		return result;
	}
	
	public boolean auth() {
		boolean result = this.email.isBlank();
		return result;
	}
	
}
