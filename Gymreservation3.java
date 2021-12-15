/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymreservation3;

/**
 *
 * @author mac
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Gymreservation3 {



//    static ArrayList<Client> client = new ArrayList<>();
//    static ArrayList<Coach> coach = new ArrayList<>();
//    static ArrayList<MemberShip> membership = new ArrayList<>();
//    static ArrayList<Supplies> supplies = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
                        Menu menu = new Menu();

//        ReservationFrame frame=new ReservationFrame();
//       Login l=new Login();
//       Shopp shop=new Shopp();

//      win w=new win();
//          Shop shop=new Shop();
//      if(frame.isOpen==false)
//      {
////        
////          
////        frame.setContentPane(shop);
//      } 
//        Scanner input = new Scanner(System.in);
//
//        Owner o = new Owner("sameh", 1234, 01016633, "sameh123.gmail.com", "Sameh Ahmed", "12345sahd", 70, 170);
//        System.out.println(o.toString());
//        char s = 'c';
//        while (s == 'c' || s == 'C') {
//
//            System.out.println("Press 1) to add a coach");
//            System.out.println("Press 2) to delete a coach");
//            System.out.println("Press 3) to add a memberShip");
//            System.out.println("Press 4) to delete a memebrShip");
//            System.out.println("Press 5) to register a memberShip");
//            System.out.println("Press 6) to buy a supply");
//            System.out.println("Press 7) to view List of Coaches");
//            System.out.println("Press 8) add a supply");
//
//            int choose;
//            choose = input.nextInt();
//
//            String name, email, password, username, type;
//            int id, weight, height, p;
//            long mobile;
//            double price;
//            switch (choose) {
//                case (1): {
//
//                    System.out.print("enter coachs's name: ");
//                    name = input.next();
//                    System.out.print("coach's id: ");
//                    id = input.nextInt();
//                    System.out.print("coach's email: ");
//                    email = input.next();
//                    System.out.println("coach's password: ");
//                    password = input.next();
//                    System.out.print("coach's mobile number: ");
//                    mobile = input.nextLong();
//                    System.out.println("coach's username: ");
//                    username = input.next();
//                    System.out.println("coach's weight: ");
//                    weight = input.nextInt();
//                    System.out.println("coach's height: ");
//                    height = input.nextInt();
//                    coach.add(new Coach(name, id, mobile, email, username, password, weight, height));
//
//                    coach.get(coach.size() - 1).write();
//                    for (int x = 0; x < coach.size(); x++) {
//                        o.addCoach(coach.get(x));
//                    }
//
//                    break;
//                }
//
//                case (2): {
//
//                    coach.get(coach.size() - 1).read();
//                    int n = input.nextInt();
//                    o.removeCoach(n - 1);
//                    o.ViewCoachList();
//
//                    break;
//                }
//
//                case (3): {
//                    System.out.println("enter membership type: ");
//                    type = input.next();
//                    System.out.println("enter period of the membership in days: ");
//                    p = input.nextInt();
//                    System.out.println("enter fees: ");
//                    price = input.nextDouble();
//                    membership.add(new MemberShip(type, p, price));
//
//                    membership.get(membership.size() - 1).write();
//                    for (int x = 0; x < membership.size(); x++) {
//                        o.addMemberShip(membership.get(x));
//                    }
//
//                    break;
//
//                }
//                case (4): {
//
//                    membership.get(membership.size() - 1).read();
//
//                    int n = input.nextInt();
//                    o.removeMemberShip(n - 1);
//                    o.viewMemberShipList();
//                    break;
//                }
//                case (5): {
//                    System.out.println("..........LOGIN.........");
//                    System.out.println("Username: ");
//                    username = input.next();
//                    System.out.println("Email: ");
//                    email = input.next();
//                    System.out.println("Password: ");
//                    password = input.next();
//                    while (password.length() < 3) {
//                        System.out.println("Password Too short ... Re-enter Password");
//                        password = input.next();
//                    }
//                    System.out.print("name: ");
//                    name = input.next();
//                    System.out.print("weight: ");
//                    weight = input.nextInt();
//                    System.out.print("height: ");
//                    height = input.nextInt();
//                    System.out.print("mobile: ");
//                    mobile = input.nextLong();
//                    System.out.print("ID: ");
//                    id = input.nextInt();
//
//                    client.add(new Client(name, id, mobile, email, username, password, weight, height));
//                    System.out.println(".......choose your memberShip.......");
//             
//                        membership.get(membership.size()-1).read();
//                    
//                    int i = (input.nextInt()) - 1;
//                    System.out.println("purchase here: ");
//                    double clientMoney = input.nextDouble();
//                    double pprice = membership.get(i).getPrice();
//                    if (pprice > clientMoney) {
//                        System.out.println("no enough money ....Resvervation failed.....");
//                    } else if (clientMoney > pprice) {
//                        clientMoney = clientMoney - pprice;
//                        client.get(client.size() - 1).setClientMoney(clientMoney);
//                        System.out.println("your change: " + client.get(client.size() - 1).getClientMoney());
//                        FileWriter fw = new FileWriter("Register.txt", true);
//                        BufferedWriter bw = new BufferedWriter(fw);
//                        PrintWriter write = new PrintWriter(bw);
//
//                        write.println(client.get(client.size() - 1).getName() + " " + client.get(client.size() - 1).getID() + " " + membership.get(i).getType() + " " + membership.get(i).getPeriod() + " months");
//                        write.close();
//                        fw.close();
//                        bw.close();
//                        System.out.println("reservation sussuefully");
//                    } else {
//                        PrintWriter write = new PrintWriter("Register.txt");
//
//                        write.println(client.get(client.size() - 1).getName() + " " + client.get(client.size() - 1).getID() + " " + membership.get(i).getType() + " " + membership.get(i).getPeriod() + " months");
//                        write.close();
//                        System.out.println("reservation sussuefully");
//                    }
//                    break;
//                }
//
//                case (6): {
//                 
//                        supplies.get(supplies.size()-1).read();
//                    
//
//                    int i = input.nextInt() - 1;
//                    System.out.print("how many items you need from this product: ");
//                    int number = input.nextInt();
//                    System.out.println("youe fees is: " + supplies.get(i).getProuctPrice() * number);
//
//                    System.out.print("pruchase here: ");
//                    double cashIn = input.nextDouble();
//                    double ppprice = supplies.get(i).getProuctPrice() * number;
//                    if (ppprice > cashIn) {
//                        System.out.println("no enought money....Registeration Failed");
//                    } else if (ppprice < cashIn) {
//                        cashIn = cashIn - ppprice;
//                        System.out.println("your change: " + cashIn);
//                        System.out.println("purchase Done");
//
//                    } else {
//                        System.out.println("purchase Done");
//                    }
//                    break;
//                }
//                case (7): {
//                  
//                        coach.get(coach.size()-1).read();
//                    break;
//                }
//                case (8): {
//                    String productName;
//                    double Price;
//                    int numberofitems;
//                    System.out.print("product name: ");
//                    productName = input.next();
//                    System.out.print("product price: ");
//                    Price = input.nextDouble();
//                    supplies.add(new Supplies(productName, Price));
//
//                    supplies.get(supplies.size() - 1).write();
//
//                    break;
//
//                }
//
//            }
//            System.out.println("if yo want to exit the GYM press (STOP) ..otherwise press (CONTINUE)");
//            s = input.next().charAt(0);
//        }
//        System.out.println("out of GYM");
    }

}