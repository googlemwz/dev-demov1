package com.mwz.test;



/**
 * @description:
 * @author: Wenzhong.Ma
 * @create: 2020-08-20 12:58
 **/

public class User {

    private String userName ;

    private String number ;

    private String roletype ;

    private  String status;

    public User(String userName ,String number,String roletype,String status){
        this.userName=userName ;

        this.number=number ;

        this.roletype=roletype ;

        this.status=status;
    }

    public User(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }





    @Override
    public int hashCode() {
        //return super.hashCode();


        String str = userName + number+roletype;
        System.out.println(str.hashCode());
        return str.hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
           // System.out.println(" equals is obj instanceof User");
            User otherUser = (User) obj;
            if (this.userName == otherUser.getUserName()
                    && this.number.equals(otherUser.getNumber())
                    && this.roletype.equals(otherUser.getRoletype())
                    && this.status.equals(otherUser.getStatus())) {
              //  System.out.println(" equals is obj  return true");
                return true;
            }
        }
       // System.out.println(" equals is false");
        return false;

    }

    @Override
    public String toString() {
        return "User{" +
                "[" + ( userName + number+roletype).hashCode() +
                "],[" + number +
                "], ['" + userName + '\'' +
                "], ['" + roletype + '\'' +
                "], ['" + status + '\'' +"]"+
                '}';
    }
}
