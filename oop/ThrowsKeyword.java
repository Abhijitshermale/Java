import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadandWrite
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
	void saveFile() throws FileNotFoundException
	{
		String text="this is demo";
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
	}
}
class ThrowsKeyword
{
	public static void main(String[] args)
	{
		ReadandWrite rw = new ReadandWrite();
		try
		{
			rw.readFile();

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

		try
		{
			rw.saveFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
