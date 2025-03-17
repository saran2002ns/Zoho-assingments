package Assigment_Class_Object;

public class Q2_Employe {
    private String name;
    private int age;
    private String password;
    private  int employeId;
    private static int totalEmployes;
    private String email;
        Q2_Employe(String name,int age,String password,String email){
            totalEmployes++;
            this.name=name;
            this.age=age;
            this.password=password;
            this.employeId=totalEmployes;
            this.email=email;
        }
        
        public static void main(String[] args) {
            Q2_Employe employe1=new Q2_Employe("Saran",23 , "Password", "saran@gmail.com");
            Q2_Employe employe2=new Q2_Employe("Saran2",24 , "Pass", "saran2002@gmail.com");
            System.out.println(employe1);
            System.out.println(employe2);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public  int getEmployeId() {
            return employeId;
        }

        public static int getTotalEmployes() {
            return totalEmployes;
        }

        public static void setTotalEmployes(int totalEmployes) {
            Q2_Employe.totalEmployes = totalEmployes;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public String toString(){
            return " Name : "+name+"  |  Age :  "+age+"  |  Employe Id :  "+employeId;
        }

}
