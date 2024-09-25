class TemporaryEmployee extends Employee {
    int dailywages;
    int noofdays;
    public TemporaryEmployee(int id, String name, int dailywages, int noofdays) {
        super(id, name, 0);
        this.dailywages = dailywages;
        this.noofdays = noofdays;
    }

    public void calculatenetsalary() {
        netsalary = dailywages * noofdays;
    }

    public void calculatebonus() {
        if (dailywages < 1000) {
            bonus = 0.15f * netsalary;
        } else if (dailywages >= 1000 && dailywages < 1500) {
            bonus = 0.12f * netsalary;
        } else if (dailywages >= 1500 && dailywages < 1750) {
            bonus = 0.11f * netsalary;
        } else {
            bonus = 0.08f * netsalary;
        }
    }

    @Override
    public void displaydetails() {
        System.out.println("Daily Wages: " + dailywages);
        System.out.println("No of Days: " + noofdays);
        super.displaydetails();
    }
}
