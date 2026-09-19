public enum Setting {
    OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");

    private String status;

    Setting (String status) {
        this.status = status;
    }

    public String toString() {
        return status;
    }

}