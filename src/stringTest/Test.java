package stringTest;

public class Test {

    public static void main(String[] args) {

        ResearchListEntity researchListEntity = new ResearchListEntity();
        Test test = new Test();
        String str = "| 模型uuid | 321 |" + "\n" +
                "| 模型名称 | 人脸识别 |" + "\n" +
                "| 研判时间 | 12:00 |" + "\n" +
                "| 研判描述 | true |" + "\n" +
                "| 所属库uuid | 456 |" + "\n" +
                "| 所属库名称 | 人脸识别库 |" + "\n" +
                "| 人员姓名 | Zl |" + "\n" +
                "| 人脸uuid | 789|" + "\n" +
                "| 人员图片 | 无 |" + "\n" +
                "| 状态 | 404 |" + "\n";
        test.TransferStringToTable(str, researchListEntity);
        System.out.println(researchListEntity.toString());

    }

    void TransferStringToTable(String str, ResearchListEntity researchListEntity) {
        String[] strs = str.split("\n");
        for (int i = 0; i < strs.length; i++) {
            String[] strs1 = strs[i].split("\\|");
            switch (strs1[1].trim()) {
                case "模型uuid":
                    researchListEntity.setFaceModelUuid(strs1[2]);
                    break;
                case "模型名称":
                    researchListEntity.setFaceModelName(strs1[2]);
                    break;
                case "研判时间":
                    researchListEntity.setCreateTime(strs1[2]);
                    break;
                case "研判描述":
                    researchListEntity.setAnalysisResultDescribe(strs1[2]);
                    break;
                case "所属库uuid":
                    researchListEntity.setFaceLibraryUuid(strs1[2]);
                    break;
                case "所属库名称":
                    researchListEntity.setFaceLibraryName(strs1[2]);
                    break;
                case "人员姓名":
                    researchListEntity.setStaffName(strs1[2]);
                    break;
                case "人脸uuid":
                    researchListEntity.setFaceUuid(strs1[2]);
                    break;
                case "人脸图片":
                    researchListEntity.setFacePhotoUrl(strs1[2]);
                    break;
                case "状态":
                    researchListEntity.setStatus(strs1[2]);
                    break;
                default:
                    break;

            }

        }
    }

}
