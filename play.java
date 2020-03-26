class Playground {
    public static void main(String[ ] args) {
        String s1= "hello";
        String s2= "hello";  //creates in a string on stack so result will be true here

        System.out.println(s1 == s2); //true

        String s3= new String("hello"); // creates a new string the heap
        String s4= new String("hello");
        System.out.println(s3 == s4); //false

        s4 = s2.intern(); //points the strings to same address of s3
        System.out.println(s4 == s2); //true

        changeValue(s2);

        System.out.println(s2); // still prints hello because strings are immutable


    }

    public static void changeValue(String s){
        s = "Hi";
        //creates a new string HELLO and points to that in heap
    }


}
