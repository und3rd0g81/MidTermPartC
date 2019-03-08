/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author aidan
 */
public class TestUserprofile {
    
    public static void main(String[] args){
        String id = "null";
        String genre = "null";
          UserProfile user = new UserProfile(id,genre);        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
         user.setUserID(input.nextLine());
         System.out.println("Which of the following genres is your favourite?: Mystery, Comedy, Action, Drama: ");
         user.setGenre(input.nextLine());
        System.out.println("Your user profile has been created");
        
    }
    


}
