class FizzBuzz{
    public void fizzBuzz(int n){
        for(int i in 1..n){
            if(i%3==0 && i%5==0){
                println "Fizz Buzz";
            }
            else if(i%3==0){
                println "Fizz"
            }
            else if(i%5==0) println "Buzz";
            else println(i);
        }
    }

    static void main(String[] args){
        FizzBuzz f = new FizzBuzz();
        f.fizzBuzz(50);
    }
}