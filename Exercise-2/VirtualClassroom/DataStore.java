package VirtualClassroom;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DataStore implements Serializable {
    private static final long serialVersionUID = 1L;
    public Map<String, Classroom> classrooms = new HashMap<>();
    public Map<String, Student> students = new HashMap<>();
}
