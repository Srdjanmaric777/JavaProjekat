package services.FilterService;

import java.util.List;

public interface ICriteria {
    public List<Person> meetCriteria(List<Person> persons);
}
