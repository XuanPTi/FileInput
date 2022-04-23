package Class;

import Data.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {


	Data.lstCtg.add(new Categories(1, "xuan", "xuan", true, 0));
	Data.lstCtg.add(new Categories(2, "tuan", "xuan", true, 0));
	Data.lstCtg.add(new Categories(3, "pham", "xuan", true, 0));
	Data.lstCtg.add(new Categories(4, "hoang", "xuan", true, 0));

	readFile();
}

	public static void readObjec(){
		File f = new File("E:\\file\\texx.txt");

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(f);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(Data.lstCtg);
			objectOutputStream.close();
			fileOutputStream.close();

		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static void readFile(){
		File f = new File("E:\\file\\texx.txt");


		try {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Categories> data = (List<Categories>) ois.readObject();
			for (Categories ctg: data){

				ctg.dislapyData(ctg);

			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}

