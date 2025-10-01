package VirtualClassroom;

public class Main {
    public static void main(String[] args) {
        String filename = "data.vcm";
        PersistenceManager persistence = new PersistenceManager(filename);
        DataStore store = persistence.load();
        VirtualClassroomManager manager = new VirtualClassroomManager(store, persistence);
        manager.runCli();
    }
}
