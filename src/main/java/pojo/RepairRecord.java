package pojo;


public class RepairRecord {

  private long id;
  private long idNumber;
  private String idName;
  private String idFaculty;
  private String idFacultyclass;
  private String bug;
  private long idRepairnumber;
  private String idRepairname;
  private java.sql.Timestamp repairtime;
  private String isAccomplished;
  private String isStudent;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(long idNumber) {
    this.idNumber = idNumber;
  }


  public String getIdName() {
    return idName;
  }

  public void setIdName(String idName) {
    this.idName = idName;
  }


  public String getIdFaculty() {
    return idFaculty;
  }

  public void setIdFaculty(String idFaculty) {
    this.idFaculty = idFaculty;
  }


  public String getIdFacultyclass() {
    return idFacultyclass;
  }

  public void setIdFacultyclass(String idFacultyclass) {
    this.idFacultyclass = idFacultyclass;
  }


  public String getBug() {
    return bug;
  }

  public void setBug(String bug) {
    this.bug = bug;
  }


  public long getIdRepairnumber() {
    return idRepairnumber;
  }

  public void setIdRepairnumber(long idRepairnumber) {
    this.idRepairnumber = idRepairnumber;
  }


  public String getIdRepairname() {
    return idRepairname;
  }

  public void setIdRepairname(String idRepairname) {
    this.idRepairname = idRepairname;
  }


  public java.sql.Timestamp getRepairtime() {
    return repairtime;
  }

  public void setRepairtime(java.sql.Timestamp repairtime) {
    this.repairtime = repairtime;
  }


  public String getIsAccomplished() {
    return isAccomplished;
  }

  public void setIsAccomplished(String isAccomplished) {
    this.isAccomplished = isAccomplished;
  }


  public String getIsStudent() {
    return isStudent;
  }

  public void setIsStudent(String isStudent) {
    this.isStudent = isStudent;
  }

}
