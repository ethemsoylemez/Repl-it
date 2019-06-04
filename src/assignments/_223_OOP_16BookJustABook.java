package assignments;

public class _223_OOP_16BookJustABook {

	public static void main(String[] args) {

		ReadBook book1 = new ReadBook("Chyngyz Aitmatov", "The White Steamboat");
		book1.addChapter("First Chapter", 39);
		book1.addChapter("Second Chapter", 90);
		book1.addChapter("Last Chapter", 123);

		System.out.println(book1.toString());

	}
}

class ReadBook {

	String title;
	String author;
	String tableOfContents = "";

	int nextPage = 1;

	public ReadBook(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void addChapter(String chapterTitle, int chapterPage) {

		tableOfContents += "\n" + chapterTitle + "..." + nextPage;
		nextPage += chapterPage;

	}

	public int getPages() {

		return nextPage - 1;
	}

	public String getTableOfContents() {

		return tableOfContents;
	}

	@Override
	public String toString() {

		return title + "\n" + author;
	}

}
