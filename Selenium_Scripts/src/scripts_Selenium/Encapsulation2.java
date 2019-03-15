package scripts_Selenium;

import org.testng.annotations.Test;

public class Encapsulation2 {
	
 
      private String id;
 
      private String name;
 
      public String getId() {
 
            return id;
 
      }
 
      public String getName() {
 
            return name;
 
      }
 
      public void setId(String newId) {
 
            id = newId;
 
      }
 @Test
      public void setName(String newName) {
 newName="Praveen";
            name = newName;
            System.out.println(name);
 
      }
 
}



