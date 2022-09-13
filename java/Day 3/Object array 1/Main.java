/******************************************************************************
make array of student objects.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
 student b2[] = new student[4];
 b2[0]= new student (107,"Pratik");
 b2[1]= new student (109,"Suleman");
 b2[2]= new student (101,"Rylan");
 b2[3]= new student (121,"sus");
 for (int i=0;i<b2.length;i++){
		    b2[i].print();
		}
 	}
}
