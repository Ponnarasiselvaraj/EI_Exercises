package VirtualClassroom;

import java.io.Serializable;
import java.util.UUID;

public class Assignment implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String id;
    private final String details;

    public Assignment(String details) {
        this.id = UUID.randomUUID().toString();
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Assignment{" + "id='" + id + '\'' + ", details='" + details + '\'' + '}';
    }
}
