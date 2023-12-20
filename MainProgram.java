public class MainProgram {
    public static void main(String[] args) {
        
        IEmployee employee = new Employee();
        employee.salary();

        
        IManager manager = new Manager();
        manager.salary();
        manager.hire();
        manager.train();

        
        ICEO ceo = new CEO();


        ceo.addBonus();
        ceo.salary();
        ceo.makeDecisions();
        ceo.addStocks();
    }
}