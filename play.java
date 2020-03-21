class Playground {
    public static void main(String[ ] args) {
       String s1= "hello";
       //string s2= "hello"  //creates in a string pool so result will be true here
  
       String s2= new String("hello"); //always create a new string the heap
       
       System.out.println(s1 == s2); //false
       
      s2 = s1.intern(); //points the strings to same address of s1
      System.out.println(s1 == s2); //true
    
       changeValue(s2);
       
       System.out.println(s2); // still prints hello because strings are immutable
       
       
    }
    
    public static void changeValue(String s){
        s = "Hi";
        //creates a new string HELLO and points to that in heap
    }
    
    
}
