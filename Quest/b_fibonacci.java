package Quest;

public class b_fibonacci {
    public static void main(String[] args) {
        b_fibonacci b = new b_fibonacci();
        System.out.println(b.fibonacci(15));
    }

    public int fibonacci(int num){
        if (num <= 1) return num; // 최소치가 1 이하가 되면 다시 num return
        return fibonacci(num-1) + fibonacci(num-2); // 인자의 이전 숫자와 그 전 숫자의 합
        // 피보나치는 0~num 까지 이전의 것과 지금의 것을 더 한 것
        // ex) 0, 0, 1, 1, 2, 3, 5, 8 ...
    }
}

