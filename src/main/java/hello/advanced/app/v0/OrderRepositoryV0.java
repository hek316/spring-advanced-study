package hello.advanced.app.v0;

import org.springframework.stereotype.Repository;


@Repository
public class OrderRepositoryV0 {

    public  void save(String itemId) {
         if (itemId.equals("ex")) {
             throw new IllegalStateException("예외 발생!");
         }
         sleep(1000);
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
