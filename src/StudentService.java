import java.util.Arrays;
import java.util.StringJoiner;

public class StudentService {

    static Student[] convert(String[] data) {

        Student[] students = new Student[5];

        for (int i = 0, j = 0; i < data.length; i++, j++) {

            students[j] = new Student(data[i]);

        }
        return students;
    }


    static Student maxByMark(Student[] students) {

        Student max = students[0];

        for (int i = 1; i < students.length; i++) {

            if (students[i].getMark() > max.getMark()) {

                max = students[i];
            }

        }

        return max;

    }

    static String sortByMaark(Student[] students) {
        Student temp = null;
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - 1; j++) {

                if (students[j - 1].getMark() > students[j].getMark()) {

                    temp = students[j];
                    students[j] = students[j - 1];
                    students[j - 1] = temp;
                }
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for (int j = 0; j < students.length; j++) {

            sj.add(students[j].toString());
        }

        return sj.toString();
    }

    static String sortByName(Student [] students) {

        for (int i = 0; i <students.length ; i++) {

            String simbol = students[i].getName();
            byte[] sort = simbol.getBytes();
            Arrays.sort(sort);
            String ssbro = sort.toString();
            return ssbro;
        }
        return null;
    }
}


