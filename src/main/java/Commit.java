public class Commit {

    private String description;
    private String uniqueId;

    public Commit(String description, String uniqueId) {
        this.description = description;
        this.uniqueId = uniqueId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }
}

