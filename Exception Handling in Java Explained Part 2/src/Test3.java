public class Test3 {
    int getNextNo(int n){
        try{
        if(n==5){
        return n+1;
        }
    }
        finally{
        System.out.println("This is important CODE");
        }

        return n-1;
    }
    public static void main(String[] args) {
        Test3 obj = new Test3();
        System.out.println(obj.getNextNo(5));
    }
}

//Line number 9 does not execute due to return
//but we can do otherwise with the help of finally