import java.util.ArrayList;
import java.util.List;

public class LW3_task1 {
	public static class House {
		private int id;
		private int apartmentNumber;
		private double area;
		private int floor;
		private int numberOfRooms;
		private String street;
		private String buildingType;
		private int yearsOfExploitation;

		public House(int id, int apartmentNumber, double area, int floor, int numberOfRooms, String street,
				String buildingType, int yearsOfExploitation) {
			this.id = id;
			this.apartmentNumber = apartmentNumber;
			this.area = area;
			this.floor = floor;
			this.numberOfRooms = numberOfRooms;
			this.street = street;
			this.buildingType = buildingType;
			this.yearsOfExploitation = yearsOfExploitation;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getApartmentNumber() {
			return apartmentNumber;
		}

		public void setApartmentNumber(int apartmentNumber) {
			this.apartmentNumber = apartmentNumber;
		}

		public double getArea() {
			return area;
		}

		public void setArea(double area) {
			this.area = area;
		}

		public int getFloor() {
			return floor;
		}

		public void setFloor(int floor) {
			this.floor = floor;
		}

		public int getNumberOfRooms() {
			return numberOfRooms;
		}

		public void setNumberOfRooms(int numberOfRooms) {
			this.numberOfRooms = numberOfRooms;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getBuildingType() {
			return buildingType;
		}

		public void setBuildingType(String buildingType) {
			this.buildingType = buildingType;
		}

		public int getYearsOfExploitation() {
			return yearsOfExploitation;
		}

		public void setYearsOfExploitation(int yearsOfExploitation) {
			this.yearsOfExploitation = yearsOfExploitation;
		}

		@Override
		public String toString() {
			return "House{" +
					"id=" + id +
					", apartmentNumber=" + apartmentNumber +
					", area=" + area +
					", floor=" + floor +
					", numberOfRooms=" + numberOfRooms +
					", street='" + street + '\'' +
					", buildingType='" + buildingType + '\'' +
					", yearsOfExploitation=" + yearsOfExploitation +
					'}';
		}
	}

	public static class HouseArray {
		private List<House> houses;

		public HouseArray() {
			this.houses = new ArrayList<>();
		}

		public void addHouse(House house) {
			houses.add(house);
		}

		public List<House> getHousesByNumberOfRooms(int numberOfRooms) {
			List<House> result = new ArrayList<>();
			for (House house : houses) {
				if (house.getNumberOfRooms() == numberOfRooms) {
					result.add(house);
				}
			}
			return result;
		}

		public List<House> getHousesByRoomsAndFloorRange(int numberOfRooms, int minFloor, int maxFloor) {
			List<House> result = new ArrayList<>();
			for (House house : houses) {
				if (house.getNumberOfRooms() == numberOfRooms && house.getFloor() >= minFloor
						&& house.getFloor() <= maxFloor) {
					result.add(house);
				}
			}
			return result;
		}

		public List<House> getHousesByArea(double minArea) {
			List<House> result = new ArrayList<>();
			for (House house : houses) {
				if (house.getArea() > minArea) {
					result.add(house);
				}
			}
			return result;
		}

		@Override
		public String toString() {
			return "HouseArray{" +
					"houses=" + houses +
					'}';
		}
	}

	public static void main(String[] args) {
		HouseArray houseArray = new HouseArray();

		// Додавання прикладових об'єктів House
		houseArray.addHouse(new House(1, 101, 75.5, 2, 3, "Main St", "Apartment", 10));
		houseArray.addHouse(new House(2, 202, 90.0, 3, 4, "Broad St", "House", 15));
		houseArray.addHouse(new House(3, 303, 60.0, 1, 2, "Park St", "Condo", 8));

		// Виведення списку квартир за різними критеріями
		System.out.println("List of houses with 3 rooms:");
		System.out.println(houseArray.getHousesByNumberOfRooms(3));

		System.out.println("\nList of houses with 4 rooms on floors 1-3:");
		System.out.println(houseArray.getHousesByRoomsAndFloorRange(4, 1, 3));

		System.out.println("\nList of houses with area more than 70.0:");
		System.out.println(houseArray.getHousesByArea(70.0));
	}
}
