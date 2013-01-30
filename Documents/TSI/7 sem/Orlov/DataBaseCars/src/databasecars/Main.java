/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecars;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Alex
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {



        Map<String, Car> carMap = new HashMap<String, Car>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-------------------\nCar's database\n-------------------\n"
                + "Add new record - '1'\n\nView data - '2'\n\nDelete record - '3'\n\n"
                + "Search - '4'\n\nExit - 5\n--------------------\n");
        String s = br.readLine();

        if (s.equals("1")) {

            System.out.println("Would you like edit already existing file or create new database? Enter 'exist' or 'new' ");
            String s0 = br.readLine();
            if (s0.equals("exist")) {
                FileInputStream fis = new FileInputStream("cars.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                carMap = (Map<String, Car>) ois.readObject();

                String s1 = " ";
                do {
                    System.out.println("Would you like create new record? Enter 'yes' or 'no' ");
                    s1 = br.readLine();

                    if (s1.equals("yes")) {

                        System.out.println("Create 'Sport Car' or 'Passenger car'? Enter :" + " " + "'1' (Sport)" + " " + "or" + " " + "'0' (Passengesr)");
                        String s2 = br.readLine();
                        int b = Integer.parseInt(s2);

                        if (b == 1) {
                            String s3;
                            do {
                                System.out.println("Enter bodyType");
                                String sptype = br.readLine();
                                System.out.println("Enter brand name :");
                                String spname = br.readLine();
                                System.out.println("Enter model :");
                                String spmodel = br.readLine();
                                System.out.println("Enter color :");
                                String spcolor = br.readLine();
                                System.out.println("Enter vin Number:");
                                String spvin = br.readLine();
                                carMap.put((spvin), new SportCar(sptype, spname, spmodel, spcolor, spvin));
                                System.out.println("Create one more 'Sport Car'? Enter : yes or no");
                                s3 = br.readLine();
                            } while (s3.equals("yes"));

                        }

                        if (b == 0) {
                            String s4;
                            do {
                                System.out.println("Enter bodyType :");
                                String type = br.readLine();
                                System.out.println("Enter brand name :");
                                String name = br.readLine();
                                System.out.println("Enter model :");
                                String model = br.readLine();
                                System.out.println("Enter vin Number :");
                                String vin = br.readLine();
                                carMap.put((vin), new Car(type, name, model, vin));
                                System.out.println("Create one more 'Passanger Car'? Enter : yes or no");
                                s4 = br.readLine();
                            } while (s4.equals("yes"));

                        }

                    }

                } while (s1.equals("yes"));



                if (s1.equals("no")) {
                    System.out.println("You have finished creating records!!!");
                }

                FileOutputStream fos = new FileOutputStream("cars.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(carMap);
                oos.close();

            }

            if (s0.equals("new")) {

                String s1 = " ";
                do {
                    System.out.println("Would you like create new record? Enter 'yes' or 'no' ");
                    s1 = br.readLine();

                    if (s1.equals("yes")) {

                        System.out.println("Create 'Sport Car' or 'Passenger car'? Enter :" + " " + "'1' (Sport)" + " " + "or" + " " + "'0' (Passenger)");
                        String s2 = br.readLine();
                        int b = Integer.parseInt(s2);

                        if (b == 1) {
                            String s3;
                            do {
                                System.out.println("Enter bodyType");
                                String sptype = br.readLine();
                                System.out.println("Enter brand name :");
                                String spname = br.readLine();
                                System.out.println("Enter model :");
                                String spmodel = br.readLine();
                                System.out.println("Enter color :");
                                String spcolor = br.readLine();
                                System.out.println("Enter vin Number :");
                                String spvin = br.readLine();
                                carMap.put((spvin),new SportCar(sptype, spname, spmodel, spcolor,spvin));
                                System.out.println("Create one more 'Sport Car'? Enter : yes or no");
                                s3 = br.readLine();
                            } while (s3.equals("yes"));

                        }

                        if (b == 0) {
                            String s4;
                            do {
                                System.out.println("Enter bodyType :");
                                String type = br.readLine();
                                System.out.println("Enter brand name :");
                                String name = br.readLine();
                                System.out.println("Enter model :");
                                String model = br.readLine();
                                System.out.println("Enter vin Nmuber :");
                                String vin = br.readLine();
                                carMap.put((vin),new Car(type, name, model,vin));
                                System.out.println("Create one more 'Passanger Car'? Enter : yes or no");
                                s4 = br.readLine();
                            } while (s4.equals("yes"));

                        }

                    }

                } while (s1.equals("yes"));

                if (s1.equals("no")) {
                    System.out.println("You have finished creating records!!!");


                }

                System.out.println("Enter file name with .txt extension !!!");
                String filename = br.readLine();
                FileOutputStream fos = new FileOutputStream(filename);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(carMap);
                oos.close();
                for (Car c : carMap.values()) {
                    System.out.println(c);
                }

            }
        }

        if (s.equals("2")) {

            System.out.println("Enter file name with .txt extension !!!");
            String filename = br.readLine();
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            carMap = (Map<String,Car>) ois.readObject();
            for (Car c : carMap.values()) {
                System.out.println(c);
            }
        }
        if (s.equals("3")) {
            System.out.println("Enter file name with .txt extension !!!");
            String filename = br.readLine();
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            carMap = (Map<String,Car>) ois.readObject();
            for (Car c : carMap.values()) {
                System.out.println(c);
            }
            System.out.println("--------------------\n");
            System.out.println("Enter element's number you want to delete\n (massive starts fr zero!)\n");
            String delete = br.readLine();
            carMap.remove(delete);
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(carMap);
            oos.close();
            System.out.println("-------------------\n");
            for (Car c : carMap.values()) {
                System.out.println(c);
            }
        }
        if (s.equals("4")) {
        }

        if (s.equals("5")) {
            System.out.println("-------------------\n");
            System.out.println("You have no done any action!\n Goodbuy for now! ");
        }


    }
}
