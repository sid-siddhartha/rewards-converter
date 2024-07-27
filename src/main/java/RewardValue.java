public class RewardValue {

    private final double cashValue;
    private static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMtoC(milesValue);
    }

    private double convertMtoC(int milesValue) {
        return milesValue * conversionRate;
    }

    private double convertCtoM(double cashValue) {
        return cashValue / conversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return (int)convertCtoM(this.cashValue);
    }
}
