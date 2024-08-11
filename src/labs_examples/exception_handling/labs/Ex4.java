package labs_examples.exception_handling.labs;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,0,5};

        for(int i=0; i<=arr1.length;i++){
            try {
                System.out.println(arr1[i]/arr2[i]);
            }catch(ArithmeticException exc){
                try{
                    System.out.println(arr1[i]/arr2[i]+1);
                }catch(ArithmeticException exc0){
                    System.out.println("Complicated problem");
                }
                catch (ArrayIndexOutOfBoundsException exc2){
                System.out.println(exc2.toString());

                }catch (Exception e){
                System.out.println(e.toString());
                }finally {
                System.out.println("All data processed");
            }
        }
    }

}

}
