package com.main;

public class SQLInjectionExample {
    public static void main(String[] args) {
        String username = getUserInput();
        String query = "SELECT * FROM users WHERE username = '" + username + "'";
        // query 실행 로직
    }

    private static String getUserInput() {
        // 사용자로부터 입력 받는 로직
<<<<<<< HEAD
        return "TEST"; //3
=======
        return "TEST"; //3
>>>>>>> feature/rebase-demo1
    }
}