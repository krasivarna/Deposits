package _03;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="students")
public class Student extends Person{
    @Column(name="average_grade",nullable = false)
    private float averageGrade;

    private int attendace;

    @ManyToMany
    @JoinTable(
            name="students_courses",
            joinColumns = @JoinColumn(name="student_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="courses_id",referencedColumnName = "id")
    )
    private Set<Course> courses;

    protected Student(){
     super();
    }

    protected Student(String firstName,String lastName,String phoneNumber,
                      float averageGrade,int attendace){
        super(firstName,lastName,phoneNumber);
        this.averageGrade=averageGrade;
        this.attendace=attendace;
    }

}
