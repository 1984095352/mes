package cn.ssm.po;

public class StandardValues {
    private Integer valId;

    private Integer productsId;

    private String testProcess;

    private String standardVal;

    public Integer getValId() {
        return valId;
    }

    public void setValId(Integer valId) {
        this.valId = valId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public String getTestProcess() {
        return testProcess;
    }

    public void setTestProcess(String testProcess) {
        this.testProcess = testProcess == null ? null : testProcess.trim();
    }

    public String getStandardVal() {
        return standardVal;
    }

    public void setStandardVal(String standardVal) {
        this.standardVal = standardVal == null ? null : standardVal.trim();
    }
}