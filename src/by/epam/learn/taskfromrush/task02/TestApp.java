package by.epam.learn.taskfromrush.task02;




public class TestApp {

    public static void main(String[] args) {
        Company companyList = new Company();
        companyList.setPlane();
        System.out.println("----- Список самолётов до сортировки -----");
        companyList.printPlane(companyList.getPlane());
        companyList.sortPlane();
        System.out.println("----- Список самолётов  по расходу топлива -----");
        companyList.printPlane(companyList.getPlane());
        System.out.println("----- Список самолётов  по скорости -----");
        companyList.findBySpeed(100, 150);
    }

}





