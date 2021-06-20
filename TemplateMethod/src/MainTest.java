public class MainTest {
    public static void main(String[] args) {
        DesignPatternCourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("---------------------------");
        VueFECourse vueFECourse = new VueFECourse(false);
        vueFECourse.makeCourse();
        System.out.println("---------------------------");
        ReactorFECourse reactorFECourse = new ReactorFECourse(true);
        reactorFECourse.makeCourse();
    }
}
