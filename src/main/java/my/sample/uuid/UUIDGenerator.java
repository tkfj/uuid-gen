package my.sample.uuid;

import java.util.UUID;

public class UUIDGenerator {

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }
}
