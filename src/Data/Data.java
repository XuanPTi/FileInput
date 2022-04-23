package Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Class.Categories;
import Class.Product;

public class Data {
    public static List<Categories> lstCtg = new ArrayList<>();
    public static List<Product> lstPrd = new ArrayList<>();


    public void saveCategori() {
        File f = new File("E:\\file\\category.txt");
   try{

       FileOutputStream fos = new FileOutputStream(f);
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(lstCtg);

       oos.close();
       fos.close();

   }catch (Exception e){
       e.printStackTrace();
   }
    }
     public void getCategori(){
         File f = new File("E:\\file\\category.txt");
         try{
             FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis);

             List<Categories> data = ( List<Categories>) ois.readObject();

             for (Categories ctg: data){

                 ctg.dislapyData(ctg);
             }
         }catch (Exception e){
             e.printStackTrace();
         }

     }



}

