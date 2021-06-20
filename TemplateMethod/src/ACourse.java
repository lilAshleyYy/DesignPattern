public abstract class ACourse {

    /**
     * 制作课程 模板方法
     */
    protected final void makeCourse() {
        this.makePPT();// 必选步骤
        this.makeVideo();// 必选步骤
        if (needWriteArticle()) {
            this.writeArticle();// 可选步骤
        }
        this.packageCourse();// 子类实现的步骤
    }

    /**
     * 制作PPT
     */
    final void makePPT() {
        System.out.println("制作PPT");
    }

    /**
     * 录制视频
     */
    final void makeVideo() {
        System.out.println("录制视频");
    }

    /**
     * 编写手记
     */
    final void writeArticle() {
        System.out.println("编写手记");
    }

    /**
     * 是否编写手记
     * (钩子方法)
     *
     * @return
     */
    protected boolean needWriteArticle() {
        return false;
    }

    /**
     * 打包课程（抽象方法，由子类去实现）
     */
    abstract void packageCourse();
}
