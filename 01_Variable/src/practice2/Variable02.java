package practice2;

public class Variable02 {
	
	public static void main(String[] args) {
		// 1.대소문자가 구분된다. (길이 제한 X)
		int num = 10;
		int nuM = 20;
		
		System.out.println(num);
		System.out.println(nuM);
		
		// 2. 예약어를 사용하면 안 된다.
		// int class;
		
		// 3. 숫자로 시작하면 안 된다.
		// int 1age;
		int age1;
		
		// 4. 특수문자는 '_'와 '$'만 가능하다.
		// String sh@rp;
		String sh$rp;
		
		// 5. 카멜케이스 : 소문자로 시작하여 다음 단어의 첫글자가 대문자로 작성
		// 회원이름
		String userName;
		String username; // 문법상 오류는 아니나, 추후 어떤 환경에서는 문제가 발생할지도
		
		// 제품(product)의 번호(id) => 정수형
		int productId; 
		
		// 책(book)의 제목(title) => 문자열
		String bookTitle;
		
	}

}
