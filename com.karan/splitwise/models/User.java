package com.karan.splitwise
   
   public class User{

       public String name;
       public String email;
       public String phone;
       public String userID;

       public User (String name, String email, String phone, String userID){
           this.name=name;
           this.email=email;
           this.phone=phone;
           this.userID=userID;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getName() {
           return name;
       }

       public String getEmail() {
           return email;
       }

       public void setEmail(String email) {
           this.email = email;
       }

       public String getPhone() {
           return phone;
       }

       public void setPhone(String phone) {
           this.phone = phone;
       }

       public String getUserID() {
           return userID;
       }

       public void setUserID(String userID) {
           this.userID = userID;
       }

   }
