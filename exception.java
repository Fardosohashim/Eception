package Exception;

public class exception {
    public static void main(String[] args) {
       // int a=1;
       // int b=0;
        //int c;
       // c=a/b;
       // System.out.println(c);
        try {
            int[] mynumbers = {1, 2, 3};
            System.out.println(mynumbers[1]);
        }
                catch(Exception e){
                    assert System.out != null;
                    System.out.println("Something went wrong");
            }
        finally {
            assert System.out != null;
            System.out.println("the 'try catch 'is finished:");
        }





        }
    }

