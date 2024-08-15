package pack1;

public class Stock {
				String symbol;
				String name;
				double prevClosing;
				double current;
				
		//Constructor:
				public Stock(String symbol,String name) {
					this.symbol=symbol;
					this.name=name;
				}
	   //Method:
				public void setPrevPrice(double prevClosing) {
					this.prevClosing=prevClosing;
				}
				public void setCurrentPrice(double current) {
					this.current=current;
				}
				double getChange() {
					return ((current-prevClosing)/prevClosing)*100;
				}
}
