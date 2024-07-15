package test;

import java.util.Scanner;

public class EmployeeMenu {

	private Scanner sc = new Scanner(System.in);
	private EmployeeController[] ec = new EmployeeController[10000];

	public EmployeeMenu() {
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				insertEmp();
				break;
			case 2:
				updateEmp();
				break;
			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}
	int count = 0;
	
	public void insertEmp() {
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();

		sc.nextLine();// 단순호출로 버퍼에 \n역슬러쉬제외시킴

		System.out.print("사원 이름 : ");
		String name = sc.nextLine();

		System.out.print("사원 성별 : ");
		char gender = sc.next().charAt(0);

		System.out.print("전화번호 : ");
		String phone = sc.next();

		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char yn = sc.next().charAt(0);

		if (yn == 'y' || yn == 'Y') { // 문자열.toUpperCase() : 문자열의 값을 모두 대문자로 변경
										// ex) yn = "yes"; --> yn = "YES";
										// 문자열.toLowerCase() : 문자열의 값을 모두 소문자로 변경
			System.out.print("사원 부서 : ");
			String dept = sc.next();

			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();

			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();

			ec[count].add(empNo, name, gender, phone, dept, salary, bonus);
			count++;
		} else {
			ec[count].add(empNo, name, gender, phone);
			count++;
		}
		
	}

	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전호번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.println("메뉴 번호를 누르세요 : ");
		
		int empNo = sc.nextInt();
		int menu = sc.nextInt();

		String message = "수정할 ";
		switch (menu) {
		case 1:
			message += "전화번호 : ";
			break;
		case 2:
			message += "사원 연봉 : ";
			break;
		case 3:
			message += "보너스 율 : ";
			break;
		case 9:
			System.out.println("메인 메뉴로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(message);
		if (menu == 1) {
			String newphone = sc.next();
			ec[empNo].modify(newphone);
		} else if (menu == 2) {
			int newSal = sc.nextInt();
			ec[empNo].modify(newSal);
		} else if (menu == 3) {
			double newBonus = sc.nextDouble();
			ec[empNo].modify(newBonus);
		}
	}

	public void deleteEmp() {
		// 정말 삭제할 것인지 물어본 후 삭제하겠다고 하면
		// EmployeeController의 remove()메소드를 호출하여 반환 값에 따라
		// 데이터 삭제에 실패하였는지 성공하였는지 출력
		System.out.println("정말 삭제하시겠습니까? (y/n) : ");
		char yn = sc.next().charAt(0);
//		사원번호 입력받고 타겟 사원 정보 삭제
		int empNo = sc.nextInt();
		
		if (yn == 'y' || yn == 'Y') {
			Employee result = ec[empNo].remove();
			if (result == null) {
				System.out.println("삭제에 성공했습니다.");
			} else {
				System.out.println("삭제에 실패했습니다.");
			}
		}
	}

	public void printEmp() {
//		사원번호 입력받고 타겟 사원 정보 출력
		int empNo = sc.nextInt();
		
		String info = ec[empNo].
				inform();
		if (info == null) {
			System.out.println("저장된 사원 정보가 없습니다.");
		} else {
			System.out.println(info);
		}
	}
}
