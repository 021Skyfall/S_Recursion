package RecursionExam;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
//    public static int factorial(int num) {
//        int re = 1;
//        for (int count = num;count > 0;count--) {
//            re *= count;
//        }
//        return re;
//    }
    // 반복문 팩토리얼
    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
       return num * factorial(num - 1);
    }
    // 4를 num 인자로 받아오면 1 * 2 * 3 * 4 * 5를 해야함 < 이게 나의 문제임
    // 여기서 가장 작은 게 1임 <~ 1을 곱하면 끝이라는 뜻
    // 그럼 그 마지막을 끝으로 return 탈출
    // 이외에는 인자로 받아온 값에 -1 만큼 연속 곱하기
    // 즉 5가 들어오면 5 * 메소드 인자로 5 -1 받아서 재실행
    // 5 * 4 * 메소드 인자로 4-1 받아서 재실행
    // 5 * 4 * 3 * 메소드 인자로 3-1 받아서 재실행
    // 5 * 4 * 3 * 2 * 메소드 인자로 2-1 받아서 재실행
    // 5 * 4 * 3 * 2 * 1 인데
    // 마지막으로 들어온 인자가 1이라서 조건문에 걸림
    // ~> 그럼 조건문이 1 리턴하고 메소드가 종료됨
    // 종료되면 뽑았던 5 4 3 2 1 값이 전부 곱해지고 종료
}
