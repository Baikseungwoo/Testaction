package itm.oss;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    
    public int subtract(int a, int b){
        return a-b;
    }

    public boolean isPrime (int number){
        for (int i=2; i<number; i++){
            if(number%i ==0){
                return false;
            }
        }
        return true;
    }

    public int getNextPrime(int number){
        int index = number;
        while(true){
            index +=1;
            if(isPrime(index)){
                return index;
            }
        }
    }
}