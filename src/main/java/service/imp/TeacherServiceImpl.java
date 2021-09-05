package service.imp;

import cn.edu.bjfu.it.oyss181002602.dao.CourseDao;
import cn.edu.bjfu.it.oyss181002602.dao.StudentDao;
import cn.edu.bjfu.it.oyss181002602.dao.TeacherDao;
import cn.edu.bjfu.it.oyss181002602.model.Course;
import cn.edu.bjfu.it.oyss181002602.model.Student;
import cn.edu.bjfu.it.oyss181002602.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TeacherService;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherDao teacherDao;
    @Autowired
    CourseDao courseDao;
    @Autowired
    StudentDao studentDao;
    public Teacher doLogin(Integer teacherId, String passwd) {
        Teacher teacher = teacherDao.selectByPrimaryKey(teacherId);
        if(teacher==null)return null;
        if(teacher.getPasswd().equals(passwd))
            return teacher;
        else
            return null;
    }

    public List<Course> getCourseListByPrimaryKey(int teacherid) {
        return courseDao.selectCourseByTeacherId(teacherid);
    }

    public List<Student> getStudentListByPrimaryKey(int teacherid) {
        return studentDao.selectStudentByTeacherId(teacherid);
    }
}
