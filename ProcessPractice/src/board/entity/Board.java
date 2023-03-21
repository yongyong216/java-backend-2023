package board.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import board.dto.request.board.PatchBoardDto;
import board.dto.request.board.PostBoardDto;
import board.repository.BoardRepository;


//	게시물
//	
//	게시물번호(정수) / 이미지(문자열) / 작성자 이메일(문자열) /작성자 닉네임(문자열) /  작성자프로필 사진(문자열) / 
//	작성일(문자열) / 제목(문자열) / 내용(문자열) / 조회 수(정수) /
//	좋아요(좋아요) 리스트 /댓글(댓글)리스트
public class Board {
	private int boardNumber; 
	private String boardImageUrl;
	private String weiterEmail;
	private String weiterNickname;
	private String weiterProfilImageUrl;  
	private String weiterDate;  
	private String title;
	private String content;
	private int viewCount;  // 처음에는 0
	private List<Like> likeList;   // 처음에는 빈거 아무것도 없음.
	private List<Comment> commentList; // 처음에  빈거 아무것도 없음.
	
	public Board() {}

	public Board(int boardNumber, String boardImageUrl, String weiterEmail, String weiterNickname,
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

	public Board(PostBoardDto dto , User user) {
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		this.boardNumber = ++BoardRepository.index;
		this.boardImageUrl = dto.getBoardImageUrl();
		this.weiterEmail = user.getEmail();
		this.weiterNickname = user.getNickname();
		this.weiterProfilImageUrl =user.getProfileImageUrl();
		this.weiterDate = simpleDateFormat.format(now);
		this.title = dto.getTitle();
		this.content = dto.getContent();
		this.viewCount = 0;
		this.likeList = new ArrayList<>();
		this.commentList = new ArrayList<>();
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
		return "Board [boardNumber=" + boardNumber + ", boardImageUrl=" + boardImageUrl + ", weiterEmail=" + weiterEmail
				+ ", weiterNickname=" + weiterNickname + ", weiterProfilImageUrl=" + weiterProfilImageUrl
				+ ", weiterDate=" + weiterDate + ", title=" + title + ", content=" + content + ", viewCount="
				+ viewCount + ", likeList=" + likeList + ", commentList=" + commentList + "]";
	}
	
	public void increaseeViewCount() {
		this.viewCount++;
	}
	
	public void patch(PatchBoardDto dto) {
		this.title = dto.getTitle();
		this.content = dto.getContent();
		this.boardImageUrl = dto.getBoardImageUrl();
	}
	
	
	
	
}
