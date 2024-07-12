import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("==프로그램 시작 ==");
		
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			System.out.printf("명령어)");
			
			String cmd = sc.nextLine();
			
			int count = 1;
			
			if(cmd.equals("article list")) {
				System.out.println("게시글이 없습니다.");
				
			} else if (cmd.equals("article write")) { 
				System.out.printf("제목 : ");
				String cmd2 = sc.nextLine();
				System.out.printf("내용 : ");
				String cmd3 = sc.nextLine();
				
				for(int i=0; i<count; i++) {
					System.out.println(count + "번 글이 생성되었습니다.");
					count++;
				}
				
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
