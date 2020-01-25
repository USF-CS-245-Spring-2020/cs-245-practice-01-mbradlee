public class Practice01MathIterative implements Practice01Math{
    public int fib(int n)throws Exception{ //fib throws Exception

        int previousNum = 1;
        int previousPreviousNum = 0;
        int fibSum = 0;

        if(n < 0){
            throw new Exception(); //throws new Exception
        }

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        //Iteration starts at 2 because cases for 0 and 1 are handled
        for(int i = 2; i <= n; i++){
            fibSum = previousNum + previousPreviousNum; //fib sum becomes the sum of the previous num and the previous previous num
            previousPreviousNum = previousNum; //the previous previous num becomes the previous num
            previousNum = fibSum; //the previous num becomes the current fib sum
        }

        return fibSum;
    }

    public int fact(int n)throws Exception{

        int count = 1;

        if(n < 0){
            throw new Exception();
        }

        for(int i = n; i >= 1; i--){
            count *= i;
        }

        return count;
    }
}