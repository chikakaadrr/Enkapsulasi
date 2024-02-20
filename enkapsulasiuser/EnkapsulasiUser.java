
package enkapsulasiuser;


public class EnkapsulasiUser {

    public static void main(String[] args) {
        User chika = new User("tenott","yoonnn", 2, false);

// menggunakan method setter
chika.setUsername("tenott");
chika.setPassword("yoonnn");
chika.setID(2);
chika.setStatus(false);

// menggunakan method getter
System.out.println("Username: " + chika.getUsername());
System.out.println("Password: " + chika.getPassword());
        System.out.println("Id: " + chika.getID());
        System.out.println("Status: " + chika.getStatus());
        
    }
    
}
  