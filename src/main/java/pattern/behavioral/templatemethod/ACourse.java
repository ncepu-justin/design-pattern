package pattern.behavioral.templatemethod;

/**
 * Created by justin
 * 模板方法模式
 * 定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现，模板方法使得子类在不改变算法
 * 结构的情况下，重新定义算法的某些步骤
 */
public abstract class ACourse {

    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void writeArticle(){
        System.out.println("编写手记");
    }
    //钩子方法
    protected boolean needWriteArticle(){
        return false;
    }
    abstract void packageCourse();





}
