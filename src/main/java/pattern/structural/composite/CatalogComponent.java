package pattern.structural.composite;

/**
 * 组合模式：将对象组合成属性结构以表示"部分-整体"的层次结构 （实现：需要统一接口或同一父类）
 * Created by justin
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){

        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent){

        throw new UnsupportedOperationException("不支持删除操作");
    }


    public String getName(CatalogComponent catalogComponent){

        throw new UnsupportedOperationException("不支持获取名称操作");
    }


    public double getPrice(CatalogComponent catalogComponent){

        throw new UnsupportedOperationException("不支持获取价格操作");
    }


    public void print(){

        throw new UnsupportedOperationException("不支持打印操作");
    }


}
