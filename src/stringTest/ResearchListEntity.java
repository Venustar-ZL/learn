package stringTest;

public class ResearchListEntity {

    public String getFaceModelUuid() {
        return faceModelUuid;
    }

    public void setFaceModelUuid(String faceModelUuid) {
        this.faceModelUuid = faceModelUuid;
    }

    public String getFaceModelName() {
        return faceModelName;
    }

    public void setFaceModelName(String faceModelName) {
        this.faceModelName = faceModelName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAnalysisResultDescribe() {
        return analysisResultDescribe;
    }

    public void setAnalysisResultDescribe(String analysisResultDescribe) {
        this.analysisResultDescribe = analysisResultDescribe;
    }

    public String getFaceLibraryUuid() {
        return faceLibraryUuid;
    }

    public void setFaceLibraryUuid(String faceLibraryUuid) {
        this.faceLibraryUuid = faceLibraryUuid;
    }

    public String getFaceLibraryName() {
        return faceLibraryName;
    }

    public void setFaceLibraryName(String faceLibraryName) {
        this.faceLibraryName = faceLibraryName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getFaceUuid() {
        return faceUuid;
    }

    public void setFaceUuid(String faceUuid) {
        this.faceUuid = faceUuid;
    }

    public String getFacePhotoUrl() {
        return facePhotoUrl;
    }

    public void setFacePhotoUrl(String facePhotoUrl) {
        this.facePhotoUrl = facePhotoUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResearchListEntity(String faceModelUuid, String faceModelName, String createTime, String analysisResultDescribe, String faceLibraryUuid, String faceLibraryName, String staffName, String faceUuid, String facePhotoUrl, String status) {
        this.faceModelUuid = faceModelUuid;
        this.faceModelName = faceModelName;
        this.createTime = createTime;
        this.analysisResultDescribe = analysisResultDescribe;
        this.faceLibraryUuid = faceLibraryUuid;
        this.faceLibraryName = faceLibraryName;
        this.staffName = staffName;
        this.faceUuid = faceUuid;
        this.facePhotoUrl = facePhotoUrl;
        this.status = status;
    }

    private String faceModelUuid;/*模型uuid*/
    private String faceModelName;/*模型名称*/
    private String createTime;/*研判时间*/
    private String analysisResultDescribe;/*研判描述*/
    private String faceLibraryUuid;/*所属库uuid*/
    private String faceLibraryName;/*所属库名称*/
    private String staffName;/*人员姓名*/
    private String faceUuid;/*人脸uuid*/
    private String facePhotoUrl;/*人员图片*/
    private String status;/*状态*/

    public ResearchListEntity() {
    }

    @Override
    public String toString() {
        return "| " + "模型uuid" + " | " + faceModelUuid + "|" + "\n" +
                "| " + "模型名称" + " | " + faceModelName + "|" + "\n" +
                "| " + "研判时间" + " | " + createTime + "|" + "\n" +
                "| " + "研判描述" + " | " + analysisResultDescribe + "|" + "\n" +
                "| " + "所属库uuid" + " | " + faceLibraryUuid + "|" + "\n" +
                "| " + "属库名称" + " | " + faceLibraryName + "|" + "\n" +
                "| " + "人员姓名" + " | " + staffName + "|" + "\n" +
                "| " + "人员uuid" + " | " + faceUuid + "|" + "\n" +
                "| " + "人员图片" + " | " + facePhotoUrl + "|" + "\n" +
                "| " + "状态" + " | " + status + "|";
    }

}
