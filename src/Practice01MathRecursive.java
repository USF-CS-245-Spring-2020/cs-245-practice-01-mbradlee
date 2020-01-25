public class Practice01MathRecursive implements Practice01Math {
    public int fib(int n) throws Exception{

        //error handling (negative number)
        if(n < 0){
            throw new Exception();
        }

        //base case
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        //recursive step
        return fib(n-1) + fib(n-2);
    }

    public int fact(int n) throws Exception{

        //error handling (negative case)
        if(n < 0){
            throw new Exception();
        }

        //base case
        if(n == 1){
            return 1;
        }

        //recursive step
        return n * fact(n-1);
    }
}