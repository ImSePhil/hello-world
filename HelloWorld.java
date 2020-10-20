public class HelloWorld{

	private int i;
	public HelloWorld(){
		i = 0;
	}

	public HelloWorld(String text){
		System.out.println(text);	
	}

	public int getI(){
		return i;
	}

	public void setI(int x){
		i = x;
	}


	private String name;
	
	public String getName(){
		return name;
	}

	public void setName(String y){
		name = y;
	}

}
