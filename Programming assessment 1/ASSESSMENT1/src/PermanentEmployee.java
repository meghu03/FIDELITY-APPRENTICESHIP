class PermanentEmployee extends Employee {
    int pf;
    public PermanentEmployee(int id, String name, float basicsalary, int pf) {
        super(id, name, basicsalary);
        this.pf = pf;
    }
  public void calculatenetsalary() {
      netsalary = basicsalary - pf;
  }
  public void calculatebonus() {
      if (pf < 1000) {
          bonus = 0.1f * basicsalary;
      } else if (pf >= 1000 && pf < 1500) {
          bonus = 0.115f * basicsalary;
      } else if (pf >= 1500 && pf < 1800) {
          bonus = 0.12f * basicsalary;
      } else {
          bonus = 0.15f * basicsalary;
      }
  }
  @Override
public void displaydetails() {
    System.out.println("PF: " + pf);
      super.displaydetails();
    }
}



