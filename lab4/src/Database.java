import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    private static Database database;
    private static int instanceCount = 0;
    private Database() {
        instanceCount++;
    }
    public static Database getDatabase() {
        if (database == null)
            database = new Database();
        return database;
    }

    public static int getNumberOfInstances() {
        return instanceCount;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> resultingTeachers = new ArrayList<>();
        for (Teacher teacher : teachers) {
            List<String> subjects = teacher.getSubjects();
            for (String subjectIterator: subjects) {
                if (subjectIterator.compareTo(subject) == 0) {
                    resultingTeachers.add(teacher);
                }
            }
        }
        return resultingTeachers;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> resultingStudents = new ArrayList<>();
        for (Student student : students) {
            Map<String, Integer> subjects = student.getSubjects();
            for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
                if (entry.getKey().compareTo(subject) == 0) {
                    resultingStudents.add(student);
                }
            }
        }
        return resultingStudents;
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> sortedStudents = new ArrayList<>();
        for (var student : students) {
            sortedStudents.add(new Student(student));
        }

        sortedStudents.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.averageGrade() > o2.averageGrade())
                    return 1;
                else if (o1.averageGrade() < o2.averageGrade())
                    return -1;
                return 0;
            }
        });

        return  sortedStudents;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> sortedStudents = new ArrayList<>();
        for (var student : students) {
            if (student.getGradeForSubject(subject) != 0)
                sortedStudents.add(new Student(student));
        }

        sortedStudents.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGradeForSubject(subject) - o2.getGradeForSubject(subject);
            }
        });

        return sortedStudents;
    }
}
