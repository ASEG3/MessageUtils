package messageUtils;

import java.io.Serializable;
import java.util.ArrayList;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	private ArrayList<ArrayList<Double>> weightedAverage;
	private double mostExpensive;
	private double leastExpensive;
	private ArrayList<ArrayList<String>> newHouses;

	public Message() {
		weightedAverage = new ArrayList<ArrayList<Double>>();
		newHouses = new ArrayList<ArrayList<String>>();
	}

	public void addHouseEntryNew(ArrayList<String> houseEntry) {
		newHouses.add(houseEntry);
	}

	public ArrayList<String> getAHouseInfo(int i) {
		return newHouses.get(i);
	}

	public int getSizeOfNewHouses() {
		return newHouses.size();
	}

	public ArrayList<ArrayList<String>> getNearbyHouses() {
		return newHouses;
	}

	public ArrayList<Double> getHouse(int i) {
		return weightedAverage.get(i);
	}

	public void addWeight(ArrayList<Double> houseWeights) {
		weightedAverage.add(houseWeights);
	}

	public int getSizeOfWeighted() {
		return weightedAverage.size();
	}

	public ArrayList<ArrayList<Double>> getWeightedHouses() {
		return weightedAverage;
	}

	public void setLeastExpensive(double leastExpensive) {
		this.leastExpensive = leastExpensive;
	}

	public double getLeastExpensive() {
		return leastExpensive;
	}

	public void setMostExpensive(double mostExpensive) {
		this.mostExpensive = mostExpensive;
	}

	public double getMostExpensive() {
		return mostExpensive;
	}

}
