import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

/*1. mintak user masukkan 1 bahan makanan
2. system akan run a list of ingredients
3. system akan cari match antara bahan tu dengan list*/

public class Practice {

    public static void main(String[] args) throws FileNotFoundException {

        String item;
        File file = new File ("C:\\Users\\julia\\IdeaProjects\\jomMasak\\src\\NasiAyamIngredients.txt");
        Scanner scan = new Scanner(file); // scanner is used to read files
        Scanner ask = new Scanner (System.in); // for user's input
        ArrayList<String> simpan = new ArrayList<String>();

        System.out.print("Enter a food item: ");
        item = ask.nextLine();

        int i = 0;

        // reading the file
        while (scan.hasNextLine()){
            String data = scan.nextLine(); // line will be saved as a string called 'data'
            System.out.println(data);
            simpan.add(i, data);
            i++;
        }
        scan.close();

        System.out.println("DONE READING THE TEXT FILE");

        for (int j=0; j<simpan.size(); j++){

            // cannot use compare == item bc when two strings are equal, its value is 0
            if (simpan.get(j).compareTo(item) == 0){
                System.out.println("A match is found");
            }

        }

    }
}
