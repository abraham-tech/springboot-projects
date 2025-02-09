package net.javaguides.studentmanagement.service.impl;

import net.javaguides.studentmanagement.dto.StudentDto;
import net.javaguides.studentmanagement.entity.Student;
import net.javaguides.studentmanagement.mapper.StudentMapper;
import net.javaguides.studentmanagement.repository.StudentRepository;
import net.javaguides.studentmanagement.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtos = students.stream()
                .map((student) -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
        return studentDtos;
    }

    @Override
    public void createStudent(StudentDto student) {

    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        return null;
    }

    @Override
    public void updateStudent(StudentDto studentDto) {

    }

    @Override
    public void deleteStudent(Long studentId) {

    }
}
