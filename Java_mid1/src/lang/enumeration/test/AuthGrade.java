package lang.enumeration.test;

public enum AuthGrade {
    GUEST(1, "Customer"), LOGIN(2, "User"), ADMIN(3, "Admin");

    private int level;
    private String desc;

    AuthGrade(int level, String desc){
        this.level = level;
        this.desc = desc;
    }

    public int getLevel() {
        return level;
    }

    public String getDesc() {
        return desc;
    }

}
