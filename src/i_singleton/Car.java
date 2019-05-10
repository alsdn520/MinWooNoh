package i_singleton;

public class Car {
		private static int num = 1000;
		public int carNum;
		
		public Car() {
			num++;
			carNum = num;
		}

		public int getCarNum() {
			
			return carNum;
		}

		public void setCarNum(int carNum) {
			this.carNum = carNum;
		}
		
}
