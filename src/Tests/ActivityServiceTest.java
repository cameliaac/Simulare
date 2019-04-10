package Tests;

import Domain.ActivityValidator;
import Repository.IRepository;
import Service.ActivityService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivityServiceTest {
    private ActivityValidator validator = new ActivityValidator();
    private IRepository repository = new IRepository(validator);
    private ActivityService service = new ActivityService(repository);

    @Test
    void testsIfInsertAndGetAllWorksProperly() {
        service.insert("1", 32, "aaaaa", "11.11.2012","hh.mm");
        assertEquals(32, service.getAll().get(0).getTime());


        try {
            service.insert("1", 32, "aaaaa", "11.11.2012","hh.mm");
        } catch (RuntimeException rex) { assertTrue(true); }
    }
}
