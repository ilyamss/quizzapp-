package com.example.ilyamss.onlinequizapp.Model;

/**
 * Created by ilyamss on 29.05.2018.
 */
public class User {





        private String userName;
        private String password;
        private String email;

        public User(){};


        public User(String password, String userName, String email) {
            this.password = password;
            this.userName = userName;
            this.email = email;
        }

        public void setUserName(String userName) {

            this.userName = userName;
        }
        public String getUserName() {
            return userName;
        }
        public void setPassword(String password) {

            this.password = password;
        }
        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
}

