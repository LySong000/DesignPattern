package dynamic;

/**
 * @Author: LySong
 * @Date: 2020/3/30 16:39
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }
}
