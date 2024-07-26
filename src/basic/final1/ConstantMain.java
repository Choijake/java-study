package final1;

public class ConstantMain {

	public static void main(String[] args) {
		//문액 파악과, 값 불변에 용일함
		int currentUserCount = Constant.MAX_USERS;
		process(currentUserCount++);
		process(currentUserCount++);
		process(currentUserCount++); 
	}
	
	private static void process(int currentUserCount) {
		if(currentUserCount > Constant.MAX_USERS) {
			System.out.print("대기자로 등록합니다");
		}else {
			System.out.print("게임에 참여합니다");
		}
	}
}
