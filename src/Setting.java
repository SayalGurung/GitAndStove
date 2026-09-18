public enum Setting {
    OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");

    private String Status;

    Setting (String Status) {
        this.Status = Status;
    }

    public String toString() {
        return Status;
    }

}