package pattern.behavioral.iterator;

import java.util.List;

/**
 * 迭代器模式：提供一种方法，顺序访问一个集合对象中的各个元素，而不暴露该对象的内部表示
 * Created by justin.
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;
    private Course course;
    public CourseIteratorImpl(List courseList){
        this.courseList=courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程,位置是: "+position);
        course=(Course)courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse(){
        if(position< courseList.size()){
            return false;
        }
        return true;
    }
}
