package board.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import board.entity.Board;

public class DeleteBoardResponseDto {
	private int boardNumber;
	private String writerProfileImgeUrl;
	private String writerNickname;
	private String writeDate;
	private String title;
	private String content;
	private String boardImageUrl;
	private int commentCount;
	private int likeCount;
	private int viewCount;
	
	public DeleteBoardResponseDto() {}

	public DeleteBoardResponseDto(int boardNumber, String writerProfileImgeUrl, String writerNickname, String writeDate,
			String title, String content, String boardImageUrl, int commentCount, int likeCount, int viewCount) {
		this.boardNumber = boardNumber;
		this.writerProfileImgeUrl = writerProfileImgeUrl;
		this.writerNickname = writerNickname;
		this.writeDate = writeDate;
		this.title = title;
		this.content = content;
		this.boardImageUrl = boardImageUrl;
		this.commentCount = commentCount;
		this.likeCount = likeCount;
		this.viewCount = viewCount;
	}

	public DeleteBoardResponseDto(Board board) {
		this.boardNumber = board.getBoardNumber();
		this.writerProfileImgeUrl = board.getWeiterProfilImageUrl();
		this.writerNickname = board.getWeiterNickname();
		this.writeDate = board.getWeiterDate();
		this.title = board.getTitle();
		this.content = board.getContent();
		this.boardImageUrl = board.getBoardImageUrl();
		this.commentCount = board.getCommentList().size();
		this.likeCount = board.getLikeList().size();
		this.viewCount = board.getViewCount();
	}
	
	public int getBoardNumber() {
		return boardNumber;
	}

	public String getWriterProfileImgeUrl() {
		return writerProfileImgeUrl;
	}

	public String getWriterNickname() {
		return writerNickname;
	}

	public String getWriteDate() {
		return writeDate;
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

	public int getCommentCount() {
		return commentCount;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public void setWriterProfileImgeUrl(String writerProfileImgeUrl) {
		this.writerProfileImgeUrl = writerProfileImgeUrl;
	}

	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
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

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	@Override
	public String toString() {
		return "DeleteBoardResponseDto [boardNumber=" + boardNumber + ", writerProfileImgeUrl=" + writerProfileImgeUrl
				+ ", writerNickname=" + writerNickname + ", writeDate=" + writeDate + ", title=" + title + ", content="
				+ content + ", boardImageUrl=" + boardImageUrl + ", commentCount=" + commentCount + ", likeCount="
				+ likeCount + ", viewCount=" + viewCount + "]";
	}
	
	
	public static List<DeleteBoardResponseDto> copyList(List<Board> boardList){
		List<DeleteBoardResponseDto> result = new ArrayList<>();
		
		for(Board board: boardList) {
			DeleteBoardResponseDto item = new DeleteBoardResponseDto(board);
			result.add(item);
		}
		
		return result;
	
	}
	
	
	
	
	
}
