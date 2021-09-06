package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * repair_record
 * @author 
 */
@Data
public class RepairRecord implements Serializable {
    private Integer id;

    private Long idNumber;

    private String idName;

    private String idFaculty;

    private String idFacultyclass;

    private String bug;

    private Long idRepairnumber;

    private String idRepairname;

    private Date repairtime;

    private Boolean isAccomplished;

    private Boolean isStudent;

    public RepairRecord(Integer id, Long idNumber, String idName, String idFaculty, String idFacultyclass, String bug, Long idRepairnumber, String idRepairname, Date repairtime, Boolean isAccomplished, Boolean isStudent) {
        this.id = id;
        this.idNumber = idNumber;
        this.idName = idName;
        this.idFaculty = idFaculty;
        this.idFacultyclass = idFacultyclass;
        this.bug = bug;
        this.idRepairnumber = idRepairnumber;
        this.idRepairname = idRepairname;
        this.repairtime = repairtime;
        this.isAccomplished = isAccomplished;
        this.isStudent = isStudent;
    }

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RepairRecord other = (RepairRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIdNumber() == null ? other.getIdNumber() == null : this.getIdNumber().equals(other.getIdNumber()))
            && (this.getIdName() == null ? other.getIdName() == null : this.getIdName().equals(other.getIdName()))
            && (this.getIdFaculty() == null ? other.getIdFaculty() == null : this.getIdFaculty().equals(other.getIdFaculty()))
            && (this.getIdFacultyclass() == null ? other.getIdFacultyclass() == null : this.getIdFacultyclass().equals(other.getIdFacultyclass()))
            && (this.getBug() == null ? other.getBug() == null : this.getBug().equals(other.getBug()))
            && (this.getIdRepairnumber() == null ? other.getIdRepairnumber() == null : this.getIdRepairnumber().equals(other.getIdRepairnumber()))
            && (this.getIdRepairname() == null ? other.getIdRepairname() == null : this.getIdRepairname().equals(other.getIdRepairname()))
            && (this.getRepairtime() == null ? other.getRepairtime() == null : this.getRepairtime().equals(other.getRepairtime()))
            && (this.getIsAccomplished() == null ? other.getIsAccomplished() == null : this.getIsAccomplished().equals(other.getIsAccomplished()))
            && (this.getIsStudent() == null ? other.getIsStudent() == null : this.getIsStudent().equals(other.getIsStudent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIdNumber() == null) ? 0 : getIdNumber().hashCode());
        result = prime * result + ((getIdName() == null) ? 0 : getIdName().hashCode());
        result = prime * result + ((getIdFaculty() == null) ? 0 : getIdFaculty().hashCode());
        result = prime * result + ((getIdFacultyclass() == null) ? 0 : getIdFacultyclass().hashCode());
        result = prime * result + ((getBug() == null) ? 0 : getBug().hashCode());
        result = prime * result + ((getIdRepairnumber() == null) ? 0 : getIdRepairnumber().hashCode());
        result = prime * result + ((getIdRepairname() == null) ? 0 : getIdRepairname().hashCode());
        result = prime * result + ((getRepairtime() == null) ? 0 : getRepairtime().hashCode());
        result = prime * result + ((getIsAccomplished() == null) ? 0 : getIsAccomplished().hashCode());
        result = prime * result + ((getIsStudent() == null) ? 0 : getIsStudent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", idName=").append(idName);
        sb.append(", idFaculty=").append(idFaculty);
        sb.append(", idFacultyclass=").append(idFacultyclass);
        sb.append(", bug=").append(bug);
        sb.append(", idRepairnumber=").append(idRepairnumber);
        sb.append(", idRepairname=").append(idRepairname);
        sb.append(", repairtime=").append(repairtime);
        sb.append(", isAccomplished=").append(isAccomplished);
        sb.append(", isStudent=").append(isStudent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}