package Day28_ArrayList;

public class Test {



        public Test(){
            System.out.println("A ");
            // this(10);
        }
       public Test(int a){
            //this(2.5);
           System.out.println("B ");
        }
        public Test(String str){
            this();
            //this(100);
            System.out.println(str);
        }


        public static void main(String[] args) {
            Test obj=new Test(100);
        }
    }

