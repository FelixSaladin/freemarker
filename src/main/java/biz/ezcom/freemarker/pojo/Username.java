package biz.ezcom.freemarker.pojo;

public class Username {
    private String first;
    private String last;

    public Username() {}

    public Username(String first, String last) {
        super();
        this.first = first;
        this.last = last;
    }

    public final String getFirst() {
        return this.first;
    }

    public final void setFirst(String first) {
        this.first = first;
    }

    public final String getLast() {
        return this.last;
    }

    public final void setLast(String last) {
        this.last = last;
    }
}
