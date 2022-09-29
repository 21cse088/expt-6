public class ThrowUsedCarExceptions {
    public static void main(String[] args) {
        UsedCar[] usedCars = new UsedCar[7];
                try {
                        usedCars[0] = new Usedcar("3400","honda",1983,5000,22220);
                }
                catch(UsedCarException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        usedCars[1] = new Usedcar("5000","ford",2003,60000,20000);

                }
                catch(UsedCarException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        usedCars[2] = new Usedcar("2251","chrysler",1999,5320,120000);
                }
                catch(UsedCarException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        usedCars[3] = new Usedcar("5123","toyota",2021,5320,40000);
                }
                catch(UsedCarException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        usedCars[4] = new Usedcar("330","other",2008,50000,32000);
                }
                catch(UsedCarException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        usedCars[5] = new Usedcar("5000","other",2011,-60000,12000);
                }
                catch(UsedCarException e) {
                        System.out.println(e.getMessage());
                }
                try {
                        usedCars[6] = new Usedcar("0100","other",2000,15000,43000);
                }
                catch(UsedCarException e) {
                        System.out.println(e.getMessage());
                }
                for (int i = 0;i <usedCars.length; i++) {
                        if(usedCars[i] != null) {
                                 System.out.println(usedCars[i].tostring() + "is a valid car...");

class Usedcar {
        public String vin;
        public String process;
        public int year;
        public int mileage;
        public int amount;
        
        public UsedCar(String vin,String process,int year,int mileage,int amount) throws UsedCarException {
                if(vin.length() < 4) {
                        throw new UsedCarException(vin);
                }
                if(!(process.equals("honda")||process.equals("ford")||process.equals("chrysler")||process.equals("toyota")||process.equals("other"))
                        throw new UsedCarException(vin);
                }
                if(year < 1990 && year > 2014) {
                        throw new UsedCarException(vin);
                }
                if(mileage < 0) {
                        throw new UsedCarException(vin);
                } 
                if(amount < 0) {
                        throw new UsedCarException(vin);
                } 
        } 
} 
class UsedCarException extends Exception {
        public UsedCarException(String vin) {
                super("problems with vehicle identification number : "+vin);
        }
}