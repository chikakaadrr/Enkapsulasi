
package enkapsulasiuser;


public class User{
    private String username;
    private String password;
    private int id;
    private boolean status; //true :menikah, false:belum menikah
    
    //id = 0
    // status = false

    public User(String username, String password, int id, boolean status){
        this.username = username;
        this.password = password;
        this.id = id;
        this.status = status;
        
    }
    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }
     public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
}
