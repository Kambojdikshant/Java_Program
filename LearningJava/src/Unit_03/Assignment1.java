package Unit_03;
import java.io.* ; 
public class Assignment1 {

	public static void main(String[] args) throws IOException {
		FileReader fout = new FileReader("C:\\Users\\DELL\\git\\Java_Program\\LearningJava\\src\\Unit_03\\input.txt") ; 
		BufferedReader bf = new BufferedReader(fout) ; 
		int i,c=0 ; 
		while((i=bf.read())!= -1)
		{
			if(i==32)
			{
				c++ ;
			}
		}
        System.out.println("Number of word in the file is "+(c+1));
	}

}
