public interface IEmployee {
    void salary();
}


public interface IManager {
    void hire();
    void train();
	void salary();
}


public interface ICEO extends IManager {
    void addBonus();
    void makeDecisions();
    void addStocks();
	void salary();
}