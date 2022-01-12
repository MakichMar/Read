public class Student {
    private String name;
    private int mark;

    @Override
    public String toString() {
        return name +","+ mark;
    }

    public Student(String data) {
        String[] s = data.split("-");
        this.name = s[0];
        this.mark = Integer.parseInt(s[1]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
