package jsp;
public class FirstBean {
   public String sName=null;
   public int iClass=0;
   public int iMarks=0;
   public int iMaxMarks=0;
   
   
    public String getSName() {
        return sName;
    }
    public void setSName(String name) {
        sName = name;
    }
    public int getIClass() {
        return iClass;
    }
    public void setIClass(int class1) {
        iClass = class1;
    }
    public int getIMarks() {
        return iMarks;
    }
    public void setIMarks(int marks) {
        iMarks = marks;
    }
    public int getIMaxMarks() {
        return iMaxMarks;
    }
    public void setIMaxMarks(int maxMarks) {
        iMaxMarks = maxMarks;
    }
    public double getDPercent() {
        double dPer=(double)(iMarks*100)/iMaxMarks;
        return dPer;
    }
    
}