package dto.iterators;

import java.util.Iterator;
import java.util.List;

import dto.Student;
import dto.StudentGroup;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    private List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudents();
        // this.students = studentGroup.getStudents().iterator;
    }

    @Override
    public boolean hasNext() {
        return cursor < students.size();
    }

    @Override
    public Student next() {
        return students.get(cursor++);
    }

    @Override
    public void remove() {
        this.students.remove(cursor);
    }
}
