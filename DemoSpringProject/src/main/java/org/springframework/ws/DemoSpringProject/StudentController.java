package org.springframework.ws.DemoSpringProject;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Students")
public class StudentController {
	public List<Student> getStudents() {
		 ArrayList<Student> students=new ArrayList<Student>();
		 Student s=new Student();
		 s.setName("Vikash");
		 students.add(s);
		 return students;
	}
}
