import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException{
        do{
            System.out.print("*=========* Pastry Shop *============* \n");
            System.out.print("            1. Cheesecake.              \n");
            System.out.print("            2. Muffin.              \n");
            System.out.print("            3. Pudding.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Please enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            Employee e=new Employee();

            switch (choice) {
                case 1:
                {
                    e.cheesecakeSale();
                }
                break;
                case 2:
                {
                    e.muffinSale();
                }
                break;
                case 3:
                {
                    e.puddingSale();
                }
                break;
                default:
                {
                    System.out.println("Goodbye! :)");
                }
                return;
            }

        }while(choice!=4);
    }
}

