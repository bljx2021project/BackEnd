package generate;

import generate.RepairRecord;

public interface RepairRecordDao {
    int deleteByPrimaryKey(Integer id);

    int insert(RepairRecord record);

    int insertSelective(RepairRecord record);

    RepairRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RepairRecord record);

    int updateByPrimaryKey(RepairRecord record);
}