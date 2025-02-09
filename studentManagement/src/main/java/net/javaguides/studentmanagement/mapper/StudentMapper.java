package net.javaguides.studentmanagement.mapper;

import net.javaguides.studentmanagement.dto.StudentDto;
import net.javaguides.studentmanagement.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){
        return new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
    }

    public static Student mapToStudent(StudentDto studentDto){
        return new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );
    }
}
