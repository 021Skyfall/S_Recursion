package Quest;

public class a_isOdd {
    public static void main(String[] args) {
        a_isOdd aIsOdd = new a_isOdd();
        System.out.println(aIsOdd.isOdd(10));
    }
    public boolean isOdd(int num) {
        // 인자로 들어온 값을 1이나 0이 될 때까지 2로 반복적으로 빼줬을 때
        // 1이면 홀수 0이면 양수
        if (num == 0) {
            return false;
        } // 2. 반복적으로 2 빼주다가 num이 0에 도달했을 때 false
        if(num == 1){
            return true;
        } // 3. 반복적으로 2 빼주다가 num이 1에 도달했을 때 true
        if (num < 0) {
            return isOdd(-num);
            // isOdd(num+2); >> 이것도 됨
        } // ex. 만약 인자로 음수가 들어온다면 양수로 전환 후 다시 인자로 넘겨줌
        return isOdd(num-2); // 1. 2로 반복해서 빼줌
    }
}
// 10이 num 으로 들어감
// 조건에 걸리는 거 없고 바로 isOdd() 로 들어가서
// 인자가 num -2 니까 2뺀 값인 8로 다시 num 으로 들어감
// 또 걸리는거 없으니까 2 빼고 6 들어감
// 반복해서 2를 계속 빼다가
// 0이 되면
// if (num== 0) 에 걸림
// 그럼 마지막으로 쪼개진 isOdd() 의 값 자체가 false 가 되어버림
// 다시 돌아와도 false
// 돌아와도 false
// 그렇게 쭉 false 값 갖고 돌아와서 결국 isOdd() 의 값 자체가 false 가 되는 것임
// 그래서 출력값이 false
// 1에 걸리는 것도 마찬가지
// if (num < 0) 의 경우에 걸리게되면
// isOdd 에 들어가는 인자가 - 붙어서 양수가 되는 거고
// 이후부터는 안걸림 > 걍 변환해주는 거
