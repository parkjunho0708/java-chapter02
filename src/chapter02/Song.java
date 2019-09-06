package chapter02;

public class Song {
		private String title;
		private String artist;
		private String album;
		private String composer;
		private int year;
		private int track;
		
		// 다형성 : 객체를 생성할 때, 다양한 방법으로 생성하겠다.
		// 객체를 생성하는 방식을 다양하게 하겠다.
		// overload!!
		// 다형성은 다른 시그니처를 사용한다.
		public Song() {
			
		}
		
		public Song(String title, String artist){
			//this.title = title;
			//this.artist = artist;
			this(title, null, artist, null, 0, 0); // 코드 재사용
			// some code1
			// some code2
			// some code3
			
		}

		public Song(String title, String album, String artist, String composer, int year, int track) {
			// TODO Auto-generated constructor stub
			this.title = title;
			this.album = album;
			this.artist = artist;
			this.composer = composer;
			this.year = year;
			this.track = track;
			
			// some code1
			// some code2
			// some code3
						
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public String getComposer() {
			return composer;
		}
		public void setComposer(String composer) {
			this.composer = composer;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getTrack() {
			return track;
		}
		public void setTrack(int track) {
			this.track = track;
		}
		public void show() {
			System.out.println(
					artist + " " +
					title + "(" +
					album + ", " +
					year + ", " +
					track + "번, " +
					composer + " 작곡"
					+ ")");
		}
		
}
