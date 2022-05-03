package lv.tsi.student.controllers;


import lv.tsi.student.entities.Student;
import lv.tsi.student.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/getStudents")
    public ResponseEntity<List<Student>> findStudents() {
        Iterable<Student> iterable = studentRepository.findAll();
        List<Student> list = Streamable.of(iterable).toList();

        return ResponseEntity.ok(list);
    }

    @GetMapping(value={"/getStudent", "student"})
    public ResponseEntity<Student> findStudent(@RequestParam(value="id") Long id) {
        Optional<Student> book = studentRepository.findById(id);

        if (book.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(book.get());
    }
}
