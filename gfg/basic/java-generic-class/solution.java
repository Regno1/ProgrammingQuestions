class GenericClass<T> {
   
    private T data;
    
    // Add your code here. Make a private data variable, constructor which intialize
   public GenericClass(T data){
       this.data= data;
   }
    //  the data variable and a method showType().
    public void showType(){
        System.out.println(data.getClass().getSimpleName());
        System.out.println(data);
    }
}