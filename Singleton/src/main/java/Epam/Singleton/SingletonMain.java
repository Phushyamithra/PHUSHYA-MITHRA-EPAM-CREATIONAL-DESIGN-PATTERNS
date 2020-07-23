package Epam.Singleton;

public class SingletonMain 
{
	 public static void main(String[] args) 
	 {
	        Singleton singletonClass = Singleton.getInstance();
	        singletonClass.showMessage();
	    }
}
