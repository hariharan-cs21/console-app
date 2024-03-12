package shopping;


import busReserve.Bus;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        ArrayList<Products> products=new ArrayList<Products>();
        ArrayList<Order> myorder=new ArrayList<Order>();
        products.add(new Products(1,79000,"Iphone 14",2));
        products.add(new Products(2,15000,"Nothing 2a",2));
        products.add(new Products(3,3000,"Boat 141",1));
        int userOpt;
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        String theName="";
        while(true) {
            System.out.println("Enter 1 to Register\nEnter 2 to Login \nEnter 3 to Shop\nEnter 4 to change password\nEnter 5 to Exit");
            userOpt=sc.nextInt();
            sc.nextLine();
            if(userOpt==1) {
                System.out.println("Enter username: ");
                String regUsername = sc.nextLine();
                if (!users.containsKey(regUsername)) {
                    System.out.println("Enter password");
                    String password=sc.nextLine();
                    users.put(regUsername,new User(regUsername,password));
                    System.out.println("Registered Successfully");
                } else {
                    System.out.println("Username already taken");
                }
            }
            else if (userOpt==2) {
                System.out.println("Enter username:");
                String username = sc.nextLine();

                System.out.println("Enter password:");
                String password = sc.nextLine();
                User user = users.get(username);
                if (user != null && user.login(username, password)) {
                    System.out.println("Login successful!  "+ "Welcome "+username+"!");
                    if(!theName.equals(username)){
                        myorder.clear();
                    }
                    theName=username;
                    loggedIn=true;

                } else {
                    System.out.println("Invalid username or password.");
                }
            }
            else if(userOpt==3){
                if(loggedIn==false){
                    System.out.println("Please Login to continue");
                }
                else {
                    for (Products p : products) {
                        p.displayProduct();
                    }
                    System.out.println("Enter the ID of the product you want to buy:");
                    int productId = sc.nextInt();
                    System .out.println("Enter the quantity:");
                    int quantity = sc.nextInt();
                    for(Products p:products){
                        if(p.getid()==productId){
                            if(quantity<=p.getQuantityAvailable()){
                                double total=quantity*p.getPrice();
                                myorder.add(new Order(p.getName(),total,quantity));
                                System.out.println("Product Purchase Successfull");
                                System.out.println("Total Bill : "+ total);
                                System.out.println("Thanks for Shopping "+theName+"!");
                                p.setQuantity(p.getQuantityAvailable()-quantity);
                            }
                            else {
                                System.out.println("Insufficient Quantitiy");
                            }
                            break;
                        }
                    }
                    System.out.println("Your Orders:");
                    for (Order order : myorder) {
                        System.out.println("Product: " + order.getProductName() + ", Price: " + order.getPrice()+
                                "Qnt : "+order.getQuantity());
                    }
                }
            }
            else if(userOpt==4){
                if(loggedIn){
                    String username = theName;
                    System.out.println("Enter your Old Password");
                    String oldPassword = sc.nextLine();

                        if(users.get(username).login(username, oldPassword)) {
                        System.out.println("Enter your New Password");
                        String newPassword = sc.nextLine();

                        users.get(username).changePassword(newPassword);
                        System.out.println("Password changed successfully for User : "+username);
                    } else {
                        System.out.println("Incorrect old password.");
                    }
                } else {
                    System.out.println("Please login to change password.");
                }
            }

            else if(userOpt==5){
                System.exit(1);
            }
        }
    }
}
