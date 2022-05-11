package _03;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity(name="teachers")
public class Teacher extends Person{
    @Column(nullable = false)
    private String email;

    @Column(name="salary_per_hour",nullable = false)
    private float salaryPerHour;

    @OneToMany(mappedBy = "courses")
    private Set<Course> courses;

    protected Teacher(){
        super();
    }

    protected Teacher(String firstName,String lastName,String phoneNumber,
                      String email,float salaryPerHour){
        super(firstName,lastName,phoneNumber);
        this.email=email;
        this.salaryPerHour=salaryPerHour;
    }
}
