package lysong;

/**
 * @Author: LySong
 * @Date: 2020/3/29 14:17
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("家里蹲大学", "666啊");

        OrganizationComponent computerCollege = new College("计算机科学与工程学院","计算机哦");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院","信息工程哦");



        computerCollege.add(new Department("软件工程","不错哦"));
        computerCollege.add(new Department("网络工程","666"));
        computerCollege.add(new Department("计算机科学与技术","mud"));

        infoEngineerCollege.add(new Department("通信工程","不好学"));
        infoEngineerCollege.add(new Department("信息工程","不好学"));

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();


    }
}
