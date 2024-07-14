import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("==프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
		List<String> articles = new ArrayList<>();
	
		while (true) {
			System.out.printf("명령어)");
			
			String cmd = sc.nextLine();
					
			if(cmd.equals("article list")) {
				System.out.println("게시글이 없습니다.");
				
			} else if (cmd.equals("article write")) { 
				System.out.printf("제목 : ");
				String cmd2 = sc.nextLine();
				System.out.printf("내용 : ");
				String cmd3 = sc.nextLine();
				
				int count = articles.size() +1;
				String newCount = count + "번글이 생성되었습니다.";
				articles.add(newCount);
				System.out.println(newCount);
				
			} else if (cmd.equals("")) {
				System.out.println("명령어를 입력해주세요.");			
			} else if (cmd.equals("exit")) {
				break;				
			} else {
				System.out.println("존재하지 않는 명령어입니다.");
			}			
		}
		
		sc.close();
		
		System.out.println("== 프로그램 끝 ==");
		
	}
}
