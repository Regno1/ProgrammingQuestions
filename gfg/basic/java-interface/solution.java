class testClass implements in1 {
    public void display(int k) {
        // Add your code here.
      int count=0;
      for(int i=2;i<=k;i++){
          if(isPrime(i)){
              count++;
          }
          
      }
      System.out.println(count);
}
private boolean isPrime(int n){
    if(n<=1) return false;
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}