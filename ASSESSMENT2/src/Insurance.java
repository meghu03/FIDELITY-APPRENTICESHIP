abstract class Insurance {
    private String insuranceNumber;
    private String insuranceName;
    private Double amountcovered;

    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public Double getAmountcovered() {
        return amountcovered;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public void setAmountcovered(Double amountcovered) {
        this.amountcovered = amountcovered;
    }
    public abstract Double calculatePremium();
}


class MotorInsurance extends Insurance {
    private Double idv;
    private Float depPercent;

    public Double getIdv() {
        return idv;
    }
    public Float getDepPercent() {
        return depPercent;
    }
    public void setIdv(Double idv) {
        this.idv = idv;
    }
    public void setDepPercent(Float depPercent) {
        this.depPercent = depPercent;
    }
    @Override
    public Double calculatePremium() {
        idv = getAmountcovered() - ((getAmountcovered() * depPercent) / 100);
        return 0.03 * idv;
    }
}


class LifeInsurance extends Insurance {
    private int policyTerm;
    private Float benefitPercent;

    public int getPolicyTerm() {
        return policyTerm;
    }
    public Float getBenefitPercent() {
        return benefitPercent;
    }
    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }
    public void setBenefitPercent(Float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }
    @Override
    public Double calculatePremium() {
        return (getAmountcovered() - ((getAmountcovered() * benefitPercent) / 100)) / policyTerm;
    }
}
