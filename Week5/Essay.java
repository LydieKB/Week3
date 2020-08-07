public class Essay {

    public static void main(String[] args) {
       int n1 = 2, n2 = 10 , n3 = 20, maximun;
	 maximun = max(n1,n2,n3);

     System.out.println("result is :" + maximun);
 }

 public static int max(int i, int j, int g) {
        if (i > j ){
            return i;
     } 
     else if  (i > g){
         return i ;
     }
else if (j>g){
     return j;
}
else {
    return g ;
}
    }
        
    
}