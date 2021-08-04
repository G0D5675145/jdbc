package business;

public class JunitMessage {
		String m;
	    public JunitMessage(String msg)
	    {
	        m=msg;
	    }
		public String printMessage()
		{
		    return m;
		}
		 
		public String printHiMessage()
		{
		    return "Hi "+m;
		}

}
