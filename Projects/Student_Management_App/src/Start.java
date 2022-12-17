import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			System.out.println("Welcome to Student Management App .");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			while(true)
			{
				System.out.println("Press 1 for ADD Students");
				System.out.println("Press 2 for DELETE Students");
				System.out.println("Press 3 for DISPLAY Students");
				System.out.println("Press 4 for UPDATE Students");
				System.out.println("Press 5 for EXIT ");
				
				int ans = Integer.parseInt(br.readLine());
				
				if(ans == 1)
				{
//					add students
					System.out.println("Enter Student Name : ");
					String name = br.readLine();
					
					System.out.println("Enter student Phone Number : ");
					String phone = br.readLine();
					
					System.out.println("Enter Student City :");
					String city = br.readLine(); 
					
					Student st = new Student(name, phone, city);
					boolean answer =StudentDao.insertStudentToDB(st);
					
					 if(answer)
					 {
						 System.out.println("Student is added successfully...");
					 }
					 else {
						System.out.println("something went wrong try again ....");
					}
					System.out.println(st);
				}
				else if(ans == 2)
				{
//					delete students
					System.out.println("Enter student id to delete : ");
					int userId = Integer.parseInt(br.readLine());
					boolean answer = StudentDao.deleteStudentToDB(userId);
					if(answer)
					 {
						 System.out.println("Student is deleted successfully...");
					 }
					 else {
						System.out.println("something went wrong try again ....");
					}
				}
				else if(ans == 3)
				{
//					display students
					StudentDao.displayStudent();
				}
				else if(ans == 4)
				{
					//update student
					System.out.println("Enter id of student which you want to change : ");
					int id = Integer.parseInt(br.readLine());
					
					System.out.println("Enter Student Name : ");
					String newName = br.readLine();
					
					System.out.println("Enter student Phone Number : ");
					String newPhone = br.readLine();
					
					System.out.println("Enter Student City :");
					String newCity = br.readLine(); 
					
					boolean answer = StudentDao.updateStudent(id, newName, newPhone, newCity);
					
					if(answer)
					 {
						 System.out.println("Student is updated successfully...");
					 }
					 else {
						System.out.println("something went wrong try again ....");
					}
				}
				else if(ans == 5)
				{
					break;
				}
			}
	}

}
