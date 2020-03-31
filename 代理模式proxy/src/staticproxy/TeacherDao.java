package staticproxy;

/**
 * @Author: LySong
 * @Date: 2020/3/30 15:44
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
