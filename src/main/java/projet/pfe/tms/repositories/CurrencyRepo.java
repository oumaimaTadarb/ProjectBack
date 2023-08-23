package projet.pfe.tms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.pfe.tms.models.Currency;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency, Long> {
}
