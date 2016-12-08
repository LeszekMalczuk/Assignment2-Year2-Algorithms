package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Stack;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XMLSerializer implements Serializer {

	
	  private Stack stack = new Stack();
	  private File file;

	  public XMLSerializer(File file)
	  {
	    this.file = file;
	  }

	  public void push(Object o)
	  {
	    stack.push(o);
	  }

	  public Object pop()
	  {
	    return stack.pop(); 
	  }

	  @SuppressWarnings("unchecked")
	  public void read() throws Exception
	  {
	    ObjectInputStream is = null;

	    try
	    {
	      XStream xstream = new XStream(new DomDriver());
	      is = xstream.createObjectInputStream(new FileReader(file));
	      stack = (Stack) is.readObject();
	    }
	    finally
	    {
	      if (is != null)
	      {
	        is.close();
	      }
	    }
	  }

	  public void write() throws Exception
	  {
	    ObjectOutputStream os = null;

	    try
	    {
	      XStream xstream = new XStream(new DomDriver());
	      os = xstream.createObjectOutputStream(new FileWriter(file));
	      os.writeObject(stack);
	    }
	    finally
	    {
	      if (os != null)
	      {
	        os.close();
	      }
	    }
	  }
	  public void read1()
	  {
	  ObjectInputStream is = null;
	  XStream xstream = new XStream(new DomDriver());
	  try {
		is = xstream.createObjectInputStream(new FileReader(file));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		stack = (Stack) is.readObject();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  if (is != null)
	  {
	  try {
		is.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  }
	  } 
}
