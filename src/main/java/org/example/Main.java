package org.example;

public class Main {
    public static void main(String[] args) {
        //A.1
        int x = 10;
        int y = 5;
        int result = 0;

        if (x > y) {
            result = x * y;
        } else {
            result = x + y;
        }
        System.out.println(result);
        //50
        //if სთეითმენთი სრულდება

        //A.2
        int count = 1;
        while (count <= 4) {
            System.out.println(count);
            count++;
        }
        //4ჯერ გატარდება ციკლი
        //1,2,3,4 დაიპრინტება

        //A.3
        String word = "Java";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        //J A V A
        //4ჯერ გატარდება ციკლი

        //Part B – Practical Coding Task
        String username = "ani";
        String password = "123";
        int attempts = 3;

        while(attempts > 0){
            if(!password.matches(".*[0-9].*")){
                System.out.println("password must contain at least 1 digit");
                break;
            }

            if(username.equals("admin") && password.equals("1234")){
                System.out.println("Login successful");
                break;
            } else{
                System.out.println("Login failed");
            }
            attempts--;
        }

        if(attempts == 0){
            System.out.println("Account locked");
        }

        System.out.print("USERNAME: ");
        for(int i = 0; i < username.length(); i++){
            System.out.print(username.charAt(i) + " ");
        }
    }
}