package service.imp;

import generate.RepairRecord;
import generate.RepairRecordDao;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

public class UserServiceImpl implements UserService {
    @Autowired
    RepairRecordDao repairRecordDao;

    public int insertRecord(RepairRecord record){
        return repairRecordDao.insertSelective(record);
    }
}
