package materiotest.domain;

import java.util.Date;
import java.util.List;
import materiotest.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface CompanyRepository
    extends PagingAndSortingRepository<Company, Long> {
    @Query(
        value = "select company " +
        "from Company company " +
        "where(:name is null or company.name like %:name%) and (:isTeam is null or company.isTeam like %:isTeam%)"
    )
    List<Company> findByCompanyQuery(
        String name,
        Boolean isTeam,
        Pageable pageable
    );
}
