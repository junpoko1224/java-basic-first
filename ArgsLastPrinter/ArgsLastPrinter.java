public class ArgsLastPrinter{
    public static void main(String[] args){
       if(args.length == 0){
           System.out.println("なし");
       }else{
           int i = args.length;
           System.out.println(args[i-1]);
            
       }
    }
}