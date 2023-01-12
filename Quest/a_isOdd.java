package Quest;

public class a_isOdd {
    public static void main(String[] args) {
        System.out.println(9>9);
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
        } // ex. 만약 인자로 음수가 들어온다면 양수로 전환 후 다시 인자로 넘겨줌
        return isOdd(num-2); // 1. 2로 반복해서 빼줌
    }
}
