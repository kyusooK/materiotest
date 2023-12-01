package materiotest.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import materiotest.BasicApplication;

@Entity
@Table(name = "Company_table")
@Data
//<<< DDD / Aggregate Root
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Boolean isTeam;

    private Integer age;

    private Date enteringDate;

    public static CompanyRepository repository() {
        CompanyRepository companyRepository = BasicApplication.applicationContext.getBean(
            CompanyRepository.class
        );
        return companyRepository;
    }
}
//>>> DDD / Aggregate Root
