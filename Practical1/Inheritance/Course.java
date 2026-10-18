
class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;

    OnlineCourse(String courseName, int duration, String platform) {
        super(courseName, duration);
        this.platform = platform;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Platform: " + platform);
    }

    public static void main(String[] args) {
        OnlineCourse o = new OnlineCourse("Java", 3, "Udemy");
        o.displayInfo();
    }
}