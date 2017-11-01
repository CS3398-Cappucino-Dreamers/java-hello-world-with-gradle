package hello;

public class Greeter {
	
  private String name = "";
  private Integer age;
  
  public Greeter(){
	 
  }
  
  public void setAge(int age){
	  this.age = age;
  }
  
  public String getName() 
  {
    return name;
  }

  public void setName(String name) 
  {
      this.name = name;
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

  
  public int getAge(){
	  if(age == null){
		  return -1;
	  }
	  return age;
  }
}
  
  
  
  
  
