public class ThrowException {
    static void demo() throws Exception{
        try{
            throw new Exception("demo");
        }catch(Exception e){
            System.out.println("Caught inside demo program!"+ e.getMessage());
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            demo();
        }catch(Exception e){
            System.out.println("Recaught: "+ e);
        }
    }
}
