public class FizzBuzz{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        for(int i=0; i < num; i++){
            int ans = i+1;
            if(ans%3 == 0 && ans%5 == 0){
                System.out.print("FizzBuzz ");
            }else if(ans%5 == 0){
                System.out.print("Buzz ");
            }else if(ans%3 == 0){
                System.out.print("FIzz ");
            }else{
                System.out.print(ans+" ");
            }
       
        
        }
       
            
        }
}