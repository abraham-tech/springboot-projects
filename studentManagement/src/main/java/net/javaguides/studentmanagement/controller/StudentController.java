package net.javaguides.studentmanagement.controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.javaguides.studentmanagement.dto.StudentDto;
import net.javaguides.studentmanagement.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class StudentController {
    private StudentService studentService;

    @GetMapping({"/students"})
    public String listStudents(Model model){
        List<StudentDto> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

}
