public class AmericaFlag {
    public static void main(String[] args){
        //length = 79, breadth = 12
        //alternating stars = 10 or 9 for 6 rows
        //remaining sign is =
        int row = 12;
        int column = 79;
        int i, j;
        for (i = 0; i < row; i++){
            for ( j = 0; j<column; j++){
                if (i % 2 == 0 && i < 6){
                    if (j%2==0 && j<19){
                        System.out.print("*");
                    }
                    else if (j%2!=0 && j<19){
                        System.out.print(" ");
                    }
                    else{
                        if (j%2==0){
                            System.out.print("=");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                else if (i % 2 != 0 && i<6){
                    if (j%2==0 && j<19){
                        System.out.print(" ");
                    }
                    else if (j%2!=0 && j<19){
                        System.out.print("*");
                    }
                    else{
                        if (j%2==0){
                            System.out.print("=");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                else{
                    if (j%2==0){
                        System.out.print("=");
                    }
                    else {
                        System.out.print(" ");
                    }
                }


            }
            System.out.println("\n");
        }
    }
}
