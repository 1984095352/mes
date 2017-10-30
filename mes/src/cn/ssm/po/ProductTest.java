package cn.ssm.po;

public class ProductTest {
    private Integer testId;

    private Integer productsId;

    private String date;

    private String processName;

    private String standardVal;

    private String testVal1;

    private String testVal2;

    private String testVal3;

    private String testVal4;

    private String testVal5;

    private String operator;

    private String batchNumber;

    private String isOk;

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public String getStandardVal() {
        return standardVal;
    }

    public void setStandardVal(String standardVal) {
        this.standardVal = standardVal == null ? null : standardVal.trim();
    }

    public String getTestVal1() {
        return testVal1;
    }

    public void setTestVal1(String testVal1) {
        this.testVal1 = testVal1 == null ? null : testVal1.trim();
    }

    public String getTestVal2() {
        return testVal2;
    }

    public void setTestVal2(String testVal2) {
        this.testVal2 = testVal2 == null ? null : testVal2.trim();
    }

    public String getTestVal3() {
        return testVal3;
    }

    public void setTestVal3(String testVal3) {
        this.testVal3 = testVal3 == null ? null : testVal3.trim();
    }

    public String getTestVal4() {
        return testVal4;
    }

    public void setTestVal4(String testVal4) {
        this.testVal4 = testVal4 == null ? null : testVal4.trim();
    }

    public String getTestVal5() {
        return testVal5;
    }

    public void setTestVal5(String testVal5) {
        this.testVal5 = testVal5 == null ? null : testVal5.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public String getIsOk() {
        return isOk;
    }

    public void setIsOk(String isOk) {
        this.isOk = isOk == null ? null : isOk.trim();
    }
}