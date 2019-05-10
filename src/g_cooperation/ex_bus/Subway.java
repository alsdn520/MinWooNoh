package g_cooperation.ex_bus;

public class Subway {
 int subwayNum; //ÁöÇÏÃ¶È£¼±
 int intake = 0; //ÁöÇÏÃ¶ºñ
 int passenger; //½Â°´¼ö
 
 public Subway(int num) {
	 this.subwayNum = num;
 }
 
 public void take(int passenger) {
	 this.passenger++;
	 this.intake+=1500;
 }
 public int getsubwayNum() {
	 return subwayNum;
 }
 public int getInrake() {
	 return intake;
 }
 public int getPassenger() {
	 return passenger;
 }
 
 public void showInfo() {
	 System.out.println("Subway"+this.getsubwayNum()+" get "+this.getPassenger()
	 +" passengers and earned " + this.getInrake()+" won");
 }
}
