package capitalfloat.connect.Dao;

import capitalfloat.connect.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Repository()
@Qualifier("postgresql")
public class PostgresqlStudentImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class StudentRowMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setCourse(resultSet.getString("course"));
            return student;
        }
    }


    @Override
    public Collection<Student> getAllStudents() {

        final String query = "SELECT id, name, course FROM students";
        List<Student> students = jdbcTemplate.query(query, new StudentRowMapper());
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        final String query = "SELECT id, name, course FROM students WHERE id = ?";
        Student student = jdbcTemplate.queryForObject(query, new StudentRowMapper(),id);
        return student;
    }

    @Override
    public void removeStudentById(int id) {
        final String query = "DELETE FROM students WHERE id = ?";
        jdbcTemplate.update(query, id);
    }

    @Override
    public void updateStudent(Student student) {
        final String query = "UPDATE students SET name = ?, course = ? WHERE id = ?";
        int id = student.getId();
        final String name = student.getName();
        final String course=student.getCourse();
        jdbcTemplate.update(query, new Object[] {name, course, id});
    }

    @Override
    public void insertStudent(Student student) {
        final String query = "INSERT INTO students (name, course) VALUES (?,?)";
        final String name = student.getName();
        final String course=student.getCourse();
        jdbcTemplate.update(query, new Object[] {name, course});
    }

}
