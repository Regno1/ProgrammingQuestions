class Solution {
   
    public static Hello helperFunction() {
        // Your code here
     
        // Implement sayHello using lambda expression and return the object.
       
       Hello sayHello = ()-> System.out.print("Hello");
        // Write this in the lambda expression: System.out.println("Hello")
      return sayHello;
    }
}