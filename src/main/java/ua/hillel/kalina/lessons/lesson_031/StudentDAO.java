package ua.hillel.kalina.lessons.lesson_031;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
public class StudentDAO {

    private final SessionFactory sessionFactory;

    public StudentDAO() {
        this.sessionFactory = HibernateSession.getSessionFactory();
    }

    public void addStudent(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void deleteStudent(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Student student = (Student) session.get(Student.class, id);
            session.delete(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void updateStudent(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public List<Student> getAllStudents() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List students = null;
        try {
            transaction = session.beginTransaction();
            students = session.createQuery("FROM Student").list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return students;
    }

    public Student getStudentById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Student student = null;
        try {
            transaction = session.beginTransaction();
            student = (Student) session.get(Student.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return student;
    }
}
