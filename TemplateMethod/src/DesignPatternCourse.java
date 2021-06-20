public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("设计模式课程");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
