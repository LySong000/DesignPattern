package lysong;

import java.util.ArrayList;
import java.util.List;

/**
 * University就是Composite 可以管理College
 * @Author: LySong
 * @Date: 2020/3/29 14:08
 */
public class Department extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {
        //输出University包含的College
        System.out.println("----------"+ getName() + "----------");
        for (OrganizationComponent o:
             organizationComponents) {
            o.print();
        }
    }
}
