package deepclone;

/**
 * @Author: LySong
 * @Date: 2020/3/24 12:07
 */
public class Clinet {
    public static void main(String[] args) {
        DeepProtoType p = new DeepProtoType();
        p.name = "李一松";
        p.deepCloneableTarget = new DeepCloneableTarget("李二松","李二松类");
        //方式1深拷贝
//        try {
//            DeepProtoType clone = (DeepProtoType) p.clone();
//            System.out.println(p.name + ":" + p.deepCloneableTarget.hashCode());
//            System.out.println(clone.name + ":" + clone.deepCloneableTarget.hashCode());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
        //方式2深拷贝
        DeepProtoType clone = (DeepProtoType) p.deepClone();
        System.out.println(p.name + ":" + p.deepCloneableTarget.hashCode());
        System.out.println(clone.name + ":" + clone.deepCloneableTarget.hashCode());

    }
}
