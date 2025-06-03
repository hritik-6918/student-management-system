package net.springboot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.springboot.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@SuppressWarnings("unused")
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		*Student student1 = new Student("Hritik", "Kumar", "hritik@gmail.com");
		*studentRepository.save(student1);
		*
		*Student student2 = new Student("Monu", "Tiwari", "monu@gmail.com");
		*studentRepository.save(student2);
		*
		*Student student3 = new Student("Aman", "Singh", "singh@gmail.com");
		*studentRepository.save(student3);
		*
		*Student student4 = new Student("Piyush", "Ray", "piyu@gmail.com");
		*studentRepository.save(student4);
		*
		*Student student5 = new Student("Sonu", "Yadav", "monu@gmail.com");
		*studentRepository.save(student5);
		*/
	}

}
