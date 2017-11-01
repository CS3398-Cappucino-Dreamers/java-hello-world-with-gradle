package hello;

public class Greeter {

  private String name = "";
  private String food = "";

  public String getName() 
  {
    return name;
  }

  public void setName(String name) 
  {
      this.name = name;
  }
  
  public String getFood() 
  {
      return food;
  }

  public void setFood(String food) 
  {
      this.food = food;
  }
  
  public String sayHello() 
  {
  	if (name == "") 
    {
       return "Hello!";
    }
    else 
    {
       return "Hello " + name + "!";
    }
  }
  
  public String favoriteFood() 
  {
  	if (name == "") 
    {
       return "No one loves " + food;
    }
    else 
    {
       return name + " loves " + food;
    }
  }
}
