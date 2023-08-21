import java.util.Date;

import devfun.bookstore.common.domain.Book;

public class MainTest {

	public static void main(String[] args) {

		System.out.println(new Book(10L, "스칼라 프로그래밍", "케이 호스트만", "프로그래밍 언어", new Date()).toString());
	}

}
