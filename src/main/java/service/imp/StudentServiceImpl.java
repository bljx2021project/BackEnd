package service.imp;

import cn.edu.bjfu.it.oyss181002602.dao.StudentDao;
import cn.edu.bjfu.it.oyss181002602.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {
    @Autowired
    StudentDao studentDao;

    public Student getStudentbyStudentId(int studentId){
        return studentDao.selectByPrimaryKey(studentId);
    }
    public int updateStudent(Student student){
        return studentDao.updateByPrimaryKeySelective(student);
    }

    public Student getStudentbyFilename(String filename) {
        return studentDao.getStudentbyFilename(filename);
    }
}
