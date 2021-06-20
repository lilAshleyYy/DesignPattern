public class FECourse extends ACourse {

    private boolean needWriteArticleFlag;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供前端源代码");
        System.out.println("提供前端多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
