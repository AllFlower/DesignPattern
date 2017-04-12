package CreateType.Singleton;

/**
 * Created by flying on 2016/12/24.
 */
public class TestSingleTon {
    private SingleTon singleTon = SingleTon.getInstance();
    public  void getNumber(){
        singleTon.getString();
    }
    public  SingleTon getSingleTon(){
        return singleTon;
    }

    public static void main(String args[]){
        TestSingleTon test= new TestSingleTon();
        test.getNumber();
        SingleTon singleTon1 = SingleTon.getInstance();
        singleTon1.getString();

        SingleTon singleTon2 = test.getSingleTon();
        if(singleTon1.equals(singleTon2)){
            System.out.println(true);
        }
        if(singleTon1==singleTon2){
            System.out.println(true);
        }
    }
}
