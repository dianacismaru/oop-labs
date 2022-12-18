package lab10.task2;

public final class House {
	private final String location;
	private final int numFloors;
	private final int numRooms;
	private final boolean pool;
	private final boolean appliances;
	private final boolean solarPanels;
	private final String securityCompany;

	private House(HouseBuilder builder) {
		this.location = builder.location;
		this.numFloors = builder.numFloors;
		this.numRooms = builder.numRooms;
		this.pool = builder.pool;
		this.appliances = builder.appliances;
		this.solarPanels = builder.solarPanels;
		this.securityCompany = builder.securityCompany;
	}

	@Override
	public String toString() {
		return "House{" +
				"location='" + location + '\'' +
				", numFloors=" + numFloors +
				", numRooms=" + numRooms +
				", pool=" + pool +
				", appliances=" + appliances +
				", solarPanels=" + solarPanels +
				", securityCompany='" + securityCompany + '\'' +
				'}';
	}

	static class HouseBuilder {
		private final String location;
		private final int numFloors;
		private final int numRooms;
		private boolean pool;
		private boolean appliances;
		private boolean solarPanels;
		private String securityCompany;

		public HouseBuilder(String location, int numFloors, int numRooms) {
			this.location = location;
			this.numFloors = numFloors;
			this.numRooms = numRooms;
		}

		public HouseBuilder pool(boolean pool) {
			this.pool = pool;
			return this;
		}

		public HouseBuilder appliances(boolean appliances) {
			this.appliances = appliances;
			return this;
		}

		public HouseBuilder solarPanels(boolean solarPanels) {
			this.solarPanels = solarPanels;
			return this;
		}

		public HouseBuilder securityCompany(String securityCompany) {
			this.securityCompany = securityCompany;
			return this;
		}

		public House build() {
			return new House(this);
		}
	}

	public String getLocation() {
		return location;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public int getNumRooms() {
		return numRooms;
	}

	public boolean isPool() {
		return pool;
	}

	public boolean isAppliances() {
		return appliances;
	}

	public boolean isSolarPanels() {
		return solarPanels;
	}

	public String getSecurityCompany() {
		return securityCompany;
	}
}
