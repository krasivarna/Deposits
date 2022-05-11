package _03;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity(name="cources")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(name="start_date",nullable = false)
    private LocalDate startDate;

    @Column(name="end_date",nullable = false)
    private LocalDate endDate;

    private int credits;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    @ManyToOne
    private Teacher teacher;
}
