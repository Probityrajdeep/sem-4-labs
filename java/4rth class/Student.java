class Student{
    void StdInfo(){
        System.out.println("I am a CGU student");

    }
}

class ETC extends Student{
    void show(){
        System.out.println("I am a ETC student");
    }
}
class EEE extends Student{
    void show(){
        System.out.println("I am a EEE student");
    }
}
class CSE extends Student{
    void show(){
        System.out.println("I am a CSE student");
    }
} 
class Main{
    public static void main(String[] args){
        ETC ob1=new ETC();
        EEE ob2=new EEE();
        CSE ob3=new CSE();
         
        ob1.StdInfo();
        ob2.show();
        ob3.StdInfo();
    }
}