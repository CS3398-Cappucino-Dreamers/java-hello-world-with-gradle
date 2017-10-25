package hello;

public class Greeter {
	
	
  private String name = "";
  private ArrayList<Object> chrisGreeters;

  public Greeter(){
	 initChris();
  }
  
  public initChris(){
	  chrisGreeters = new ArrayList<Object>();
	  for(int i = 0; i<10; i++){
		  chrisGreeters.add(new Greeter()
	  }
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
  
  @Override
  public String toString(){
	  System.out.println("Chris says no ya ya no no ya");
  }
  
  public Object chrisGreetsEverybody(){
	  if(chrisGreeters != null){
		  for(Greeter chrisGreeter: chrisGreeters){
			  chrisGreeter.toString();
		  }
	  }
	  return chrisGreeter;
  }
}
