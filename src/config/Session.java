/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author user
 */
public class Session {
    private static Session instance;
    private int uid;
    private String fname;
      private String Iname;
       private String email;
 
          private String username;
            private String type;
              private String status;
           private  Session(){
               //Private cons  prevents instance
           }

 
           

    public static synchronized Session getInstances() {
       if (instance==null){
           instance=new Session();
       }
        return instance;
        
    }

    public static boolean setInstancesEmpty() {
         return instance==null;
      
    }
    
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
      

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getIname() {
        return Iname;
    }

    public void setIname(String Iname) {
        this.Iname = Iname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
           
}
