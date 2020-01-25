public class Practice01MathIterative implements Practice01Math{
    public int fib(int n)throws Exception{

        int previousNum = 1;
        int previousPreviousNum = 0;
        int fibSum = 0;

        if(n < 0){
            throw new Exception();
        }

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        for(int i = 2; i <= n; i++){
            fibSum = previousNum + previousPreviousNum;
            previousPreviousNum = previousNum;
            previousNum = fibSum;
        }

        return fibSum;
    }

    public int fact(int n)throws Exception{

        int count = 1;

        if(n < 0){
            throw new Exception();
        }

        for(int i = n; i > 1; i--){
            count *= i;
        }

        return count;
    }
}