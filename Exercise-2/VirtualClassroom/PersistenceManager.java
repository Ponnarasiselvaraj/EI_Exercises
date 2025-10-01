package VirtualClassroom;

import java.io.*;
public class PersistenceManager {
    private final String filename;
    private final String backupFilename;

    public PersistenceManager(String filename) {
        this.filename = filename;
        this.backupFilename = filename + ".bak";
    }

    public DataStore load() {
        File f = new File(filename);
        if (!f.exists()) {
            return new DataStore();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            Object obj = ois.readObject();
            if (obj instanceof DataStore) {
                System.out.println("Loaded state from " + filename);
                return (DataStore) obj;
            } else {
                System.err.println("Unexpected data format in " + filename + ". Starting fresh.");
            }
        } catch (Exception e) {
            System.err.println("Failed to load " + filename + ": " + e.getMessage());
            System.err.println("Attempting to load backup if present...");
            
            File b = new File(backupFilename);
            if (b.exists()) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(b))) {
                    Object obj = ois.readObject();
                    if (obj instanceof DataStore) {
                        System.out.println("Loaded state from backup " + backupFilename);
                        return (DataStore) obj;
                    }
                } catch (Exception ex) {
                    System.err.println("Failed to load backup: " + ex.getMessage());
                }
            }
        }
        return new DataStore();
    }

    public synchronized void save(DataStore store) {
      
        File temp = new File(filename + ".tmp");
        File target = new File(filename);
        File backup = new File(backupFilename);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(temp))) {
            oos.writeObject(store);
            oos.flush();
            
            if (target.exists()) {
                try {
                    if (backup.exists()) backup.delete();
                    boolean renamed = target.renameTo(backup);
                    if (!renamed) System.err.println("Warning: failed to create backup file.");
                } catch (Exception e) {
                    System.err.println("Warning: could not create backup: " + e.getMessage());
                }
            }
            
            if (!temp.renameTo(target)) {
                
                try (FileInputStream in = new FileInputStream(temp);
                     FileOutputStream out = new FileOutputStream(target)) {
                    byte[] buf = new byte[8192];
                    int r;
                    while ((r = in.read(buf)) > 0) out.write(buf, 0, r);
                }
                temp.delete();
            }
            } catch (Exception e) {
            System.err.println("Failed to save " + filename + ": " + e.getMessage());
        } finally {
            if (temp.exists()) temp.delete();
        }
    }
}
