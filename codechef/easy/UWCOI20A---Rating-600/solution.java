public static String solve(int N, int X, int[] A) {
        String a= "NO";
        for(int i=0;i<N;i++){
            if(X==A[i]){
            
                a="YES";
                return a;
            }
        }
        return a;
        
}