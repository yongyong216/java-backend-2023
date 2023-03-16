package board.entity;

import java.util.Date;

//	댓글
//	
//	댓글 작성자 프로필 사진 (문자열)/ 
//	댓글 작성자 닉네임(문자열) /
//	댓글 작성 날짜 및 시간 (날짜) / 
//	댓글 내용 (문자열)
public class Comment {
	private String writerProfilImageUrl;
	private String writerNickname;
	private Date writeDatetime;
	private String content;
	
	public Comment() {}

	public Comment(String writerProfilImageUrl, String writerNickname, Date writeDatetime, String content) {
		this.writerProfilImageUrl = writerProfilImageUrl;
		this.writerNickname = writerNickname;
		this.writeDatetime = writeDatetime;
		this.content = content;
	}

	public String getWriterProfilImageUrl() {
		return writerProfilImageUrl;
	}

	public String getWriterNickname() {
		return writerNickname;
	}

	public Date getWriteDatetime() {
		return writeDatetime;
	}

	public String getContent() {
		return content;
	}

	public void setWriterProfilImageUrl(String writerProfilImageUrl) {
		this.writerProfilImageUrl = writerProfilImageUrl;
	}

	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}

	public void setWriteDatetime(Date writeDatetime) {
		this.writeDatetime = writeDatetime;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Comment [writerProfilImageUrl=" + writerProfilImageUrl + ", writerNickname=" + writerNickname
				+ ", writeDatetime=" + writeDatetime + ", content=" + content + "]";
	}
	
	
	
	
	
}
