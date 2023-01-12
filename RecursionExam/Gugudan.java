package RecursionExam;

public class Gugudan {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.gugu(2,1);
    }
//    public void gugu(int level) {
//        for (int count = 1; count <10; count++){
//            System.out.printf("%d x %d = %d\n",level,count,level*count);
//        }
//    } // 반복문으로 작성한 구구단
    public void gugu(int level, int count) { // 1. 인자로 2, 1 이 들어옴
        if (count > 9) { // 7. 여기에 걸려서 true 출력 ~> return 실행
            return;
        }
        System.out.printf("%d x %d = %d\n",level,count,level*count); // 2. 레벨과 카운트를 곱함 출력 5. 다시 돌아와서 실행
        gugu(level,++count); // 3. 자기 자신 호출해서 들어온 인자를 다시 굴림
                            // 인자 중 level 은 그대로 두고 1은 자기자신 더한 값으로 변경
                            // 4. 다시 메소드가 실행됨
                            // 6. 쭉 하다가 count 가 10이 되어버리면
    }
    // 재귀로 작성한 구구단
    // 근데 여기서 조건에 걸린게 이해가 안감
    // 9면 초과기 때문에 false 인데 출력 값에는 9까지 나오기도하고
    // 그리고 false 가 되면 return 되지 않는건 알겠는데 왜 끝이 나는지는 모르겠음
    // 멍청이냐 true 여야 if 실행이니까 false 면 아무것도 안일어나고 count 가 10이 될때까지 없는거나 마찬가지 잖어
    // 그러다가 count 가 10이 되서 조건에 걸리면 return 으로 탈출하는 거임
}
