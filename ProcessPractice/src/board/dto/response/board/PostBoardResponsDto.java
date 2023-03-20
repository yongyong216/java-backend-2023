package board.dto.response.board;

import java.util.List;

import board.entity.Board;
import board.entity.Comment;
import board.entity.Like;

public class PostBoardResponsDto {

	private int boardNumber; 
	private String boardImageUrl;
	private String weiterEmail;
	private String weiterNickname;
	private String weiterProfilImageUrl;  
	private String weiterDate;  
	private String title;
	private String content;
	private int viewCount;
	private List<Like> likeList; 
	private List<Comment> commentList;
	
	public PostBoardResponsDto(int boardNumber, String boardImageUrl, String weiterEmail, String weiterNickname,
			String weiterProfilImageUrl, String weiterDate, String title, String content, int viewCount,
			List<Like> likeList, List<Comment> commentList) {
		this.boardNumber = boardNumber;
		this.boardImageUrl = boardImageUrl;
		this.weiterEmail = weiterEmail;
		this.weiterNickname = weiterNickname;
		this.weiterProfilImageUrl = weiterProfilImageUrl;
		this.weiterDate = weiterDate;
		this.title = title;
		this.content = content;
		this.viewCount = viewCount;
		this.likeList = likeList;
		this.commentList = commentList;
	}
	
	public PostBoardResponsDto(Board board) {
		this.boardNumber = board.getBoardNumber() ;
		this.boardImageUrl = board.getBoardImageUrl();
		this.weiterEmail = board.getWeiterEmail();
		this.weiterNickname = board.getWeiterNickname();
		this.weiterProfilImageUrl = board.getWeiterProfilImageUrl();
		this.weiterDate = board.getWeiterDate();
		this.title = board.getTitle();
		this.content = board.getContent();
		this.viewCount = board.getViewCount();
		this.likeList = board.getLikeList();
		this.commentList = board.getCommentList();
	}
	
	
	public int getBoardNumber() {
		return boardNumber;
	}
	public String getBoardImageUrl() {
		return boardImageUrl;
	}
	public String getWeiterEmail() {
		return weiterEmail;
	}
	public String getWeiterNickname() {
		return weiterNickname;
	}
	public String getWeiterProfilImageUrl() {
		return weiterProfilImageUrl;
	}
	public String getWeiterDate() {
		return weiterDate;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public int getViewCount() {
		return viewCount;
	}
	public List<Like> getLikeList() {
		return likeList;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}
	public void setBoardImageUrl(String boardImageUrl) {
		this.boardImageUrl = boardImageUrl;
	}
	public void setWeiterEmail(String weiterEmail) {
		this.weiterEmail = weiterEmail;
	}
	public void setWeiterNickname(String weiterNickname) {
		this.weiterNickname = weiterNickname;
	}
	public void setWeiterProfilImageUrl(String weiterProfilImageUrl) {
		this.weiterProfilImageUrl = weiterProfilImageUrl;
	}
	public void setWeiterDate(String weiterDate) {
		this.weiterDate = weiterDate;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public void setLikeList(List<Like> likeList) {
		this.likeList = likeList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	@Override
	public String toString() {
		return "PostBoardResponsDto [boardNumber=" + boardNumber + ", boardImageUrl=" + boardImageUrl + ", weiterEmail="
				+ weiterEmail + ", weiterNickname=" + weiterNickname + ", weiterProfilImageUrl=" + weiterProfilImageUrl
				+ ", weiterDate=" + weiterDate + ", title=" + title + ", content=" + content + ", viewCount="
				+ viewCount + ", likeList=" + likeList + ", commentList=" + commentList + "]";
	}

	
	
	
}
