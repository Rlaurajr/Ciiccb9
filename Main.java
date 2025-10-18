public class Main {
public static void main(String[] args) {
    System.out.println("Hello Wolrd");
    Plant plant1=new Plant();
    plant1.name="papaya"; //write
    System.outprintln(plant1.name); //read
    System.outprintlm(plant1.setBranch()); 
   }
}
class Plant{
    int branch;
    String name;
    int leaves;
void setBranch(int leaves){
this.leaves=leaves;