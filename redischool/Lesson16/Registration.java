package redischool.Lesson16;

import java.util.Objects;


public class Registration {

    final String name;
    final String courseId;

    public Registration(String name, String courseId) {
        this.name = name;
        this.courseId = courseId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registration that = (Registration) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(courseId, that.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courseId);
    }
}
